package com.bytedance.ies.xbridge.model.params;

import X.AbstractC1871160ynC;
import X.C1871380ynY;
import X.C1871910yoP;
import X.InterfaceC1107590evd;

/* JADX INFO: loaded from: classes29.dex */
public final class XUploadImageMethodParamModel extends AbstractC1871160ynC {
    public static final C1871380ynY Companion = new Object() { // from class: X.0ynY
    };
    public final String filePath;
    public InterfaceC1107590evd header;
    public InterfaceC1107590evd params;
    public final String url;

    public final String getFilePath() {
        return this.filePath;
    }

    public final InterfaceC1107590evd getHeader() {
        return this.header;
    }

    public final InterfaceC1107590evd getParams() {
        return this.params;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final XUploadImageMethodParamModel convert(InterfaceC1107590evd interfaceC1107590evd) {
        Companion.getClass();
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "url", "");
        if (strLJFF.length() != 0) {
            String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "filePath", "");
            if (strLJFF2.length() != 0) {
                InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "params");
                InterfaceC1107590evd interfaceC1107590evdLJ2 = C1871910yoP.LJ(interfaceC1107590evd, "header");
                XUploadImageMethodParamModel xUploadImageMethodParamModel = new XUploadImageMethodParamModel(strLJFF, strLJFF2);
                if (interfaceC1107590evdLJ != null) {
                    xUploadImageMethodParamModel.setParams(interfaceC1107590evdLJ);
                }
                if (interfaceC1107590evdLJ2 != null) {
                    xUploadImageMethodParamModel.setHeader(interfaceC1107590evdLJ2);
                }
                return xUploadImageMethodParamModel;
            }
            return null;
        }
        return null;
    }

    public final void setHeader(InterfaceC1107590evd interfaceC1107590evd) {
        this.header = interfaceC1107590evd;
    }

    public final void setParams(InterfaceC1107590evd interfaceC1107590evd) {
        this.params = interfaceC1107590evd;
    }

    public XUploadImageMethodParamModel(String str, String str2) {
        this.url = str;
        this.filePath = str2;
    }
}
