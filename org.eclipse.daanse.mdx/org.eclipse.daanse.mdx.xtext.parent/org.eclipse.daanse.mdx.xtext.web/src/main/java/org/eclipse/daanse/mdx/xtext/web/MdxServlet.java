/*
 * generated by Xtext 2.27.0
 */
package org.eclipse.daanse.mdx.xtext.web;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.eclipse.xtext.util.DisposableRegistry;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardContextSelect;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import com.google.inject.Injector;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
//@WebServlet(name = "", urlPatterns = "/xtext-service/*")
@HttpWhiteboardServletName("MdxXtextServices")
@HttpWhiteboardServletPattern("/xtext-service/*")
//@Component(service = Servlet.class, scope = ServiceScope.PROTOTYPE)
@HttpWhiteboardContextSelect(MdxServlet.CONTEXT_FILTER)
public class MdxServlet extends XtextServlet {
	public static final String CONTEXT_FILTER = "(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "="
			+ BundleDelegatingServletContext.NAME + ")";

	private static final long serialVersionUID = 1L;

	DisposableRegistry disposableRegistry;

	@Activate
	public void activate() {
		Injector injector = new MdxWebSetup().createInjectorAndDoEMFRegistration();
		this.disposableRegistry = injector.getInstance(DisposableRegistry.class);

		System.out.println("sssss");
	}

	public void init() throws ServletException {
		super.init();
	}

	public void destroy() {
		if (disposableRegistry != null) {
			disposableRegistry.dispose();
			disposableRegistry = null;
		}
		super.destroy();
	}

}
