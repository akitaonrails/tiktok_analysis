package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class JsbSecureAuthConfigSettings {
    public static final JsbSecureAuthConfigModel LIZ;

    public static final class JsbSecureAuthConfigModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("secureAes128cbcKey")
        public final String secureAes128cbcKey;

        @C09CT("secureFallbackMethodList")
        public final ArrayList<String> secureFallbackMethodList;

        @C09CT("secureMethodAes128cbcIv")
        public final String secureMethodAes128cbcIv;

        @C09CT("securePublicKeyList")
        public final ArrayList<JsbSecurePublicKeyModel> securePublicKeyList;

        public JsbSecureAuthConfigModel() {
            this(new ArrayList(), false, new ArrayList(), "", "");
        }

        public JsbSecureAuthConfigModel(ArrayList<String> arrayList, boolean z, ArrayList<JsbSecurePublicKeyModel> arrayList2, String str, String str2) {
            this.secureFallbackMethodList = arrayList;
            this.enable = z;
            this.securePublicKeyList = arrayList2;
            this.secureAes128cbcKey = str;
            this.secureMethodAes128cbcIv = str2;
        }
    }

    public static final class JsbSecurePublicKeyModel {

        @C09CT("publicKey")
        public final String publicKey;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final int status;

        public JsbSecurePublicKeyModel() {
            this("", 0);
        }

        public JsbSecurePublicKeyModel(String str, int i) {
            this.publicKey = str;
            this.status = i;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("x.createCalendarEvent");
        arrayList.add("x.startGyroscope");
        arrayList.add("x.stopGyroscope");
        arrayList.add("x.sendSMS");
        arrayList.add("x.copy");
        arrayList.add("x.openApp");
        arrayList.add("x.openForThird");
        arrayList.add("x.requestForThird");
        arrayList.add("openBAConversionToolsWithType");
        arrayList.add("openAdLandPageLinks");
        arrayList.add("openAdApp");
        arrayList.add("openAdLandPage");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new JsbSecurePublicKeyModel("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmrjnhFSv3K66fyKzNJkZq2Xq5sMAcRJhRVWHFzg6mxT2lymt8O27TA5wAiFlqwdDhZDDANb6jTk87nqokFT/SOzoniGgMVauhsVdk3sVGlivrePs35o03+N7iN7ApJ4R0i8RTuSi+zidZyylFLkoR+H/guusjNxZiIhRm9g2i9/ur18dYbz/g4XoKLMsnTWBubtjAEjtzIOX6zsJqrwkfEmHgdnokvC7xQjSnE3fWulXavwNTtabXcTIa0Rn4YQWazB56kTKel4dS5zoghys5IvH1kqjte+Yu3qoitnph69jxXukSl08jQzY1aE1OP4misJ3zUKoZOvzHBR5iedhQQIDAQAB", 0));
        LIZ = new JsbSecureAuthConfigModel(arrayList, false, arrayList2, "", "");
    }
}
