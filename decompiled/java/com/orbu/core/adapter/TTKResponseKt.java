package com.orbu.core.adapter;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKResponseKt {
    public static final String getDescription(TTKResponse tTKResponse) {
        String description;
        if (tTKResponse == null || (description = tTKResponse.getDescription()) == null) {
            return "";
        }
        return description;
    }

    public static final int getStatusCode(TTKResponse tTKResponse) {
        if (tTKResponse != null) {
            return tTKResponse.getStatusCode();
        }
        return 0;
    }

    public static final boolean isBlock(TTKResponse tTKResponse) {
        if (tTKResponse != null) {
            return tTKResponse.getBlock();
        }
        return false;
    }

    public static final boolean isNeedConvertBitmap(TTKResponse tTKResponse) {
        if (tTKResponse != null && tTKResponse.getStatusCode() == 101) {
            return true;
        }
        return false;
    }
}
