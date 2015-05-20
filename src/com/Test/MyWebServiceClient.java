package com.Test;

import java.math.BigDecimal;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

//import com.gwmsystem.crm.SaleClueServiceSoapProxy;

//import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class MyWebServiceClient {

	public static void main(String[] args) throws Exception {
		
		try {
			//CXF DynamicClientFactory ����
//			URL wsdlURL = new URL("http://10.1.129.49:8003/saleclueservice.asmx?WSDL");
//			QName an = new QName("");
			
//			DynamicClientFactory dcf = DynamicClientFactory.newInstance();
//			org.apache.cxf.endpoint.Client client = dcf.createClient(wsdlURL);
//			Object[] a = client.invoke("HelloWorld", "");
//			System.out.println(a);
			
			//axis��ʽ
			//helloWorld ���� ͨ��
			String strUri = "http://10.1.28.61:2212/saleclueservice.asmx";
			//SaleClueServiceSoapProxy sproxy = new SaleClueServiceSoapProxy(strUri);
			//String result = sproxy.helloWorld("�ط���hello");
			//System.out.println(result);
			
			//saveSaleClueSourceWithJson ���� ͨ��
//			String p1 = "[{'SaleClueInfoID':'123', 'DealerID':'', 'ShopID':1, 'SaleClueType':4, 'SubmitOn':'2014-4-29', 'OrderType':1, 'OrderAmount':12000, 'Deposit':1200, 'FinalPayment':1, 'Freight':230, 'PaymentState':0, 'TimeOfPayment':'2014-4-29', 'IntentBrandID':'', 'IntentBrandName':'', 'VehicleColor':'', 'CustomerName':'testjson', 'CustomerNumber':'', 'Contact':'13576768989', 'Email':'', 'Province':'�ӱ�ʡ', 'City':'��ɽ��', 'County':'������', 'Address':'���׵�', 'TestdrivePlan':'', 'PurchasePlan':'', 'Gender':1, 'Age':'', 'Remark':''}]";
//			String p2 = "[{'SaleClueProductInfoID':'115', 'SaleClueInfoID':'123', 'SubOrderType':1, 'ActivitiesType':'MG3231', 'ActivitiesName':'����', 'ActivitiesDuration':'2014-4-22��2014-4-28', 'Name':'��Ʒ', 'ConfigurationNumber':'', 'ExportVersion':'���ڰ�', 'MaterialNumber':'', 'Price':12000, 'ProductLine':'', 'AnnualPattern':'', 'Gearbox':'', 'EngineCapacity':'', 'InteriorColor':'', 'Kind':'����H2', 'CarType':'CC7155MM2', 'Pattern':'2014��', 'Configuration':'������', 'Color':'�й��', 'EngineType':'GW4G15B', 'Option':'', 'ECPOption':'������ɫ:�����ɫ����+��ľ��,������ɫ:�����ɫ����,���:һ�����,��դ:���Ÿ�դ,ǰ���:Ѭ��,�����ֱ�:һ�Ż�������,������,������ͣ,�촰', 'ECPDefaultOption':'������ɫ:�����ɫ����+��ľ��,�����ɫ:�����ɫ����,���:һ�����,�����ֱ�:���Ż�������', 'Remark':''}]";
//			String p3 = "[{'SaleClueProductBoutiqueID':'128', 'SaleClueInfoID':'123', 'SubOrderType':2, 'ActivitiesType':'MH992', 'ActivitiesName':'��Ʒ����', 'ActivitiesDuration':'2014-4-22��2014-4-22', 'SKUNumber':'EFRWEF2345R234', 'SKUFrontName':'343432'}]";

//			int rs = sproxy.saveSaleClueSourceWithJson(p1, p2, p3);
//			System.out.println(rs);
			
			//saveSaleClueSource ���鷽ʽ
			/*
			SaleClueInfo sci = new SaleClueInfo();
			sci.setAddress("");
			sci.setAge("12");
			sci.setCity("������");
			sci.setContact("13567899878");
			sci.setCounty("������");
			sci.setCustomerName("");
			sci.setCustomerNumber("");
			sci.setDealerID("");
			sci.setDeposit(new BigDecimal("1200"));
			sci.setEmail("");
			sci.setFinalPayment(new BigDecimal("120000"));
			sci.setFreight(new BigDecimal("120"));
			sci.setGender(1);
			sci.setIntentBrandID("");
			sci.setIntentBrandName("");
			sci.setOrderAmount(new BigDecimal("5000"));
			sci.setOrderType(1);
			sci.setPaymentState(1);
			sci.setProvince("�ӱ�ʡ");
			sci.setPurchasePlan("");
			sci.setTestdrivePlan("");
			sci.setTimeOfPayment("");
			sci.setRemark("");
			sci.setSaleClueInfoID("11211");
			sci.setSaleClueType(4);
			sci.setShopID(1);
			sci.setSubmitOn("2014-05-03");
			sci.setVehicleColor("");
			
			SaleClueProductInfo scpi = new SaleClueProductInfo();
			scpi.setActivitiesDuration("");
			scpi.setActivitiesName("����");
			scpi.setActivitiesType("�����");
			scpi.setAnnualPattern("");
			scpi.setCarType("CCKM2509");
			scpi.setColor("");
			scpi.setConfiguration("������");
			scpi.setConfigurationNumber("");
			scpi.setECPDefaultOption("");
			scpi.setECPOption("");
			scpi.setEngineCapacity("2.0");
			scpi.setEngineType("GW4D15A");
			scpi.setExportVersion("���ڰ�");
			scpi.setGearbox("");
			scpi.setInteriorColor("");
			scpi.setKind("");
			scpi.setMaterialNumber("");
			scpi.setName("");
			scpi.setOption("");
			scpi.setPattern("");
			scpi.setPrice(new BigDecimal("1023"));
			scpi.setProductLine("");
			scpi.setRemark("");
			scpi.setSaleClueInfoID("11211");
			scpi.setSaleClueProductInfoID("156");
			scpi.setSubOrderType(1);
			
			ArrayList<SaleClueInfo> sciList = new ArrayList<SaleClueInfo>();
			sciList.add(sci);
			
			ArrayList<SaleClueProductInfo> scpiList = new ArrayList<SaleClueProductInfo>();
			scpiList.add(scpi);
			*/
//			int rs = sproxy.saveSaleClueSource(sciList.toArray(new SaleClueInfo[0]), scpiList.toArray(new SaleClueProductInfo[0]), null);
//			
//			System.out.println(rs);
			
			//
//			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//			factory.setAddress("http://admin:password@localhost:8080/services/MyService");
//			factory.setServiceClass(SaleClueService.class);
//			ITest client = (ITest) factory.create();
//			client.test();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public static int functionCaculate(int n) {
		if (n > 1) {
            return n * functionCaculate(n - 1);
        } else {
            return 1;
        }
	}
}
