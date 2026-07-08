package com.bytedance.ies.ugc.aweme.commwecialize.ba.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class BAProductLinkSchemaSettings {
    public static final ProductLinkSchema LIZ = new ProductLinkSchema(null, null);

    public static final class ProductLinkSchema {

        @C09CT("attach_link")
        public final String addLink;

        @C09CT("create_link")
        public final String createLink;

        public ProductLinkSchema() {
            this(null, null);
        }

        public ProductLinkSchema(String str, String str2) {
            this.addLink = str;
            this.createLink = str2;
        }
    }
}
