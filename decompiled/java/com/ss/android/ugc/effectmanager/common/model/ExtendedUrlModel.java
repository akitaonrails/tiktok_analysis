package com.ss.android.ugc.effectmanager.common.model;

import X.C1954807lC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ExtendedUrlModel implements Serializable {
    public String uri;
    public List<String> url_list;
    public List<String> zip_url_list;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchModelType.values().length];
            try {
                iArr[FetchModelType.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[FetchModelType.ORIGIN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExtendedUrlModel() {
        this(new ArrayList(), null, new ArrayList());
    }

    public final List<String> getUrlList() {
        return getUrl_list();
    }

    public final List<String> getZipUrlList() {
        return getZip_url_list();
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public final List<String> getUrl(FetchModelType fetchModelType) {
        int i = WhenMappings.$EnumSwitchMapping$0[fetchModelType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return getUrl_list();
            }
            throw new C1954807lC();
        }
        return getZip_url_list();
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public final void setUrlList(List<String> list) {
        setUrl_list(list);
    }

    public void setUrl_list(List<String> list) {
        this.url_list = list;
    }

    public final void setZipUrlList(List<String> list) {
        setZip_url_list(list);
    }

    public void setZip_url_list(List<String> list) {
        this.zip_url_list = list;
    }

    public ExtendedUrlModel(List<String> list, String str, List<String> list2) {
        this.url_list = list;
        this.uri = str;
        this.zip_url_list = list2;
    }
}
