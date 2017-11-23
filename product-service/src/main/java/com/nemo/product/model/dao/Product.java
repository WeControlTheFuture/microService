package com.nemo.product.model.dao;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	private String code;
	private String mkt_name;
	private String mkt_name_alt;
	private String mkt_short_name;
	private String mkt_tagline;
	private String mkt_desc_short;
	private String mkt_image_list;
	private String mkt_image_hero;
	private String mkt_video_hero;
	private String mkt_key_features;
	private String picture;
	private String summary;
	private String name;
	private String thumbnail;
	private String manufacturerName;
	private String manufacturerPartNumber;
	private Double averageRating;
	private String variantType;
	private String approvalStatus;
	private String linkingHierarchyCode;
	private Boolean isHideModels;
	private Boolean isShowFeatures;
	private Boolean isHideReviews;
	private Boolean isShowTechSpecs;
	private Boolean isShowAccessories;
	private Boolean isEnableRetargeting;
	private Boolean isShowGallery;
	private String techSpecs;
	private String gallery360View;
	private String galleryPhoto;
	private String galleryVideo;
	private String pmiResources;
	private String ctaLink;
	private Boolean showEOL;
	private String whatsInTheBoxContent;
	private String whatsNewContent;
	private String ctabuttonlink;
	private String originalProductCode;
	private String baseWarranty;
	private String baseProduct;
	private String aposSrvType;
	
	private String conditionTitle;
	private String conditionDescription;
	private String pictureMediaContainer;
	
	private String data_sheet;
	private String descriptiveFeatures;
	private String processor_logo;
	private String saleStatus;
	private String mtmCode;
	private String customTabs;
	private Boolean showCustomTabs;
	private Boolean recommendedFlag;
	private String merchandisingTag;
	
	//this is new field, enum(CTO,MTM,OPTION,Accessory,Service)
	private String productType;
	
	
}
