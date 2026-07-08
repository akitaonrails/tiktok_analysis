package com.ss.android.ugc.aweme.im.service;

import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class TemplateIconResourceMapper implements ITemplateIconResourceMapper {
    public static final TemplateIconResourceMapper LIZ = new TemplateIconResourceMapper();

    public static final class Service implements ITemplateIconResourceMapper {
        public final /* synthetic */ TemplateIconResourceMapper LIZ = TemplateIconResourceMapper.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.ITemplateIconResourceMapper
        public final int LIZ(String str, boolean z) {
            return this.LIZ.LIZ(str, z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.im.service.ITemplateIconResourceMapper
    public final int LIZ(String str, boolean z) {
        boolean z2;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && str != null) {
            switch (str.hashCode()) {
                case -2091181238:
                    if (str.equals("paid_series")) {
                        return R.raw.icon_tiktok_logo;
                    }
                    break;
                case -1741312354:
                    if (str.equals("collection")) {
                        if (z) {
                            return R.raw.icon_favorites_collection;
                        }
                        return R.raw.icon_2pt_favorites_collection;
                    }
                    break;
                case -84391837:
                    if (str.equals("point_of_interest")) {
                        return R.raw.icon_map_thumbtack_fill;
                    }
                    break;
                case 1879474642:
                    if (str.equals("playlist")) {
                        if (z) {
                            return R.raw.icon_playlist;
                        }
                        return R.raw.icon_2pt_playlist;
                    }
                    break;
            }
        }
        return -1;
    }
}
