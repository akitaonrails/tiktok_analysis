package com.ss.android.ugc.aweme.services.video;

import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public interface IUploadRecoverInfoStore {
    int getJumpTo();

    String getSchema();

    Pair<String, String> getText();

    void isBackUp(boolean z);

    void setHintLayerEnabled(boolean z);

    void setJumpTo(int i);

    void setSchema(String str);

    void setText(String str, String str2);

    public static final class DefaultImpls {
        public static int getJumpTo(IUploadRecoverInfoStore iUploadRecoverInfoStore) {
            return 0;
        }

        public static String getSchema(IUploadRecoverInfoStore iUploadRecoverInfoStore) {
            return null;
        }

        public static void isBackUp(IUploadRecoverInfoStore iUploadRecoverInfoStore, boolean z) {
        }

        public static void setHintLayerEnabled(IUploadRecoverInfoStore iUploadRecoverInfoStore, boolean z) {
        }

        public static void setJumpTo(IUploadRecoverInfoStore iUploadRecoverInfoStore, int i) {
        }

        public static void setSchema(IUploadRecoverInfoStore iUploadRecoverInfoStore, String str) {
        }

        public static Pair<String, String> getText(IUploadRecoverInfoStore iUploadRecoverInfoStore) {
            return new Pair<>("", "");
        }

        public static /* synthetic */ void setText$default(IUploadRecoverInfoStore iUploadRecoverInfoStore, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "";
                }
                iUploadRecoverInfoStore.setText(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setText");
        }
    }
}
