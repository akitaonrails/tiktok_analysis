package com.lynx.tasm.service;

import X.InterfaceC1312730kGV;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxTextService extends IServiceProvider {

    public static class LynxTextInfo {
        public final String[] content;
        public final double height;
        public final double width;

        public String[] getContent() {
            String[] strArr = this.content;
            if (strArr == null) {
                return null;
            }
            return (String[]) strArr.clone();
        }

        public double getHeight() {
            return this.height;
        }

        public double getWidth() {
            return this.width;
        }

        public LynxTextInfo(double d) {
            this(d, 0.0d, null);
        }

        public LynxTextInfo(double d, String[] strArr) {
            this(d, 0.0d, strArr);
        }

        public LynxTextInfo(double d, double d2) {
            this(d, d2, null);
        }

        public LynxTextInfo(double d, double d2, String[] strArr) {
            String[] strArr2;
            this.width = d;
            this.height = d2;
            if (strArr == null) {
                strArr2 = null;
            } else {
                strArr2 = (String[]) strArr.clone();
            }
            this.content = strArr2;
        }
    }

    InterfaceC1312730kGV createPage(long j);

    long createTextLayoutAPI(Object obj);

    void destroyTextLayoutAPI(long j);

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    LynxTextInfo getTextInfo(String str, String str2, String str3, String str4, int i);
}
