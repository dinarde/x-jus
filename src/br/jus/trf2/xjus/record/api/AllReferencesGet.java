package br.jus.trf2.xjus.record.api;

import java.util.ArrayList;

import br.jus.trf2.xjus.record.api.IXjusRecordAPI.AllReferencesGetRequest;
import br.jus.trf2.xjus.record.api.IXjusRecordAPI.AllReferencesGetResponse;
import br.jus.trf2.xjus.record.api.IXjusRecordAPI.Reference;

public class AllReferencesGet implements IXjusRecordAPI.IAllReferencesGet {

	@Override
	public void run(AllReferencesGetRequest req, AllReferencesGetResponse resp)
			throws Exception {
		resp.list = new ArrayList<>();

		{
			Reference ref = new Reference();
			ref.id = "documento:0000000001";
			resp.list.add(ref);
		}
		{
			Reference ref = new Reference();
			ref.id = "documento:0000000002";
			resp.list.add(ref);
		}
		{
			Reference ref = new Reference();
			ref.id = "documento:0000000003";
			resp.list.add(ref);
		}
		{
			Reference ref = new Reference();
			ref.id = "documento:0000000004";
			resp.list.add(ref);
		}
	}

	public String getContext() {
		return "obter a lista de índices";
	}
}