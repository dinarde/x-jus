package br.jus.trf2.xjus;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crivano.swaggerservlet.SwaggerCall;
import com.crivano.swaggerservlet.SwaggerServlet;

import br.jus.trf2.xjus.services.gae.HttpGAE;
import br.jus.trf2.xjus.services.gae.ObjectifyFactoryCreator;

public class XjusServlet extends SwaggerServlet {
	private static final long serialVersionUID = 1756711359239182178L;
	static public XjusServlet instance = null;

	@Override
	public void initialize(ServletConfig config) throws ServletException {
		instance = this;

		SwaggerCall.setHttp(new HttpGAE());

		super.setAPI(IXjus.class);

		super.setActionPackage("br.jus.trf2.xjus");

		ObjectifyFactoryCreator.create();
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}