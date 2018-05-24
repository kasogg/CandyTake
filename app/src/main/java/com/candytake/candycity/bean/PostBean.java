package com.candytake.candycity.bean;

public class PostBean {

    /**
     * id : 27
     * date : 2018-05-16T09:45:49
     * date_gmt : 2018-05-16T01:45:49
     * guid : {"rendered":"http://candytake.com/?p=27"}
     * modified : 2018-05-18T11:26:27
     * modified_gmt : 2018-05-18T03:26:27
     * slug : eoz
     * status : publish
     * type : post
     * link : http://candytake.com/airdrop/27
     * title : {"rendered":"EOZ"}
     * content : {"rendered":"<p>EOZ正在空投，注册账户即可获得5000糖果，邀请再送5000<\/p>\n<p>空投地址：<a href=\"http://eoz.one/i/370933\">http://eoz.one/i/370933<\/a><\/p>\n",
     * "protected":false}
     * excerpt : {"rendered":"<p>EOZ正在空投，注册账户即可获得5000糖果，邀请再送5000 空投地址：http://eoz.one/i/3<\/p><\/div>\n<div
     * class=\"blog-btn\"><a href=\"http://candytake.com/airdrop/27\" class=\"home-blog-btn\">阅读更多<\/a><\/p>\n","protected":false}
     * author : 1
     * featured_media : 0
     * comment_status : closed
     * ping_status : open
     * sticky : false
     * template :
     * format : standard
     * meta : []
     * categories : [1]
     * tags : []
     * _links : {"self":[{"href":"http://candytake.com/wp-json/wp/v2/posts/27"}],"collection":[{"href":"http://candytake.com/wp-json/wp/v2/posts"}],
     * "about":[{"href":"http://candytake.com/wp-json/wp/v2/types/post"}],"author":[{"embeddable":true,"href":"http://candytake.com/wp-json/wp/v2/users/1"}],
     * "replies":[{"embeddable":true,"href":"http://candytake.com/wp-json/wp/v2/comments?post=27"}],"version-history":[{"href":"http://candytake
     * .com/wp-json/wp/v2/posts/27/revisions"}],"wp:attachment":[{"href":"http://candytake.com/wp-json/wp/v2/media?parent=27"}],
     * "wp:term":[{"taxonomy":"category","embeddable":true,"href":"http://candytake.com/wp-json/wp/v2/categories?post=27"},{"taxonomy":"post_tag",
     * "embeddable":true,"href":"http://candytake.com/wp-json/wp/v2/tags?post=27"}],"curies":[{"name":"wp","href":"https://api.w.org/{rel}","templated":true}]}
     */

    public int id;
    public String date;
    public String modified;
    public String link;
    public TitleBean title;
    public ContentBean content;

    public static class TitleBean {
        public String rendered;
    }

    public static class ContentBean {
        public String rendered;
    }

}
