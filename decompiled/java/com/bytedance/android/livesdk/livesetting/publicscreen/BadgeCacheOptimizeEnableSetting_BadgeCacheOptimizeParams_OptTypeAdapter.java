package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class BadgeCacheOptimizeEnableSetting_BadgeCacheOptimizeParams_OptTypeAdapter extends TypeAdapter<BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams> {
    public final Gson LIZ;

    public BadgeCacheOptimizeEnableSetting_BadgeCacheOptimizeParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams badgeCacheOptimizeParams = new BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams(false, false, false, false, false, LSPassThroughRecordSizeConfig.DEFAULT, 300000L, 5000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2131841131:
                        if (strLJJJJ.equals("cache_expire_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.cacheExpireTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1967204970:
                        if (strLJJJJ.equals("member_count_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.memberCountThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -975060672:
                        if (strLJJJJ.equals("deferred_cache_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.deferredCacheEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -419866804:
                        if (strLJJJJ.equals("other_audience_cache_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.otherAudienceCacheEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -173560802:
                        if (strLJJJJ.equals("audience_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.audienceEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 311148039:
                        if (strLJJJJ.equals("self_view_cache_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.selfViewCacheEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1614338637:
                        if (strLJJJJ.equals("anchor_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.anchorEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1760785497:
                        if (strLJJJJ.equals("max_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badgeCacheOptimizeParams.maxCacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return badgeCacheOptimizeParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams badgeCacheOptimizeParams) throws IOException {
        BadgeCacheOptimizeEnableSetting.BadgeCacheOptimizeParams badgeCacheOptimizeParams2 = badgeCacheOptimizeParams;
        if (badgeCacheOptimizeParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_enable");
        c09dl.LJJJJJL(badgeCacheOptimizeParams2.anchorEnable);
        c09dl.LJIILLIIL("audience_enable");
        c09dl.LJJJJJL(badgeCacheOptimizeParams2.audienceEnable);
        c09dl.LJIILLIIL("self_view_cache_enable");
        c09dl.LJJJJJL(badgeCacheOptimizeParams2.selfViewCacheEnable);
        c09dl.LJIILLIIL("other_audience_cache_enable");
        c09dl.LJJJJJL(badgeCacheOptimizeParams2.otherAudienceCacheEnable);
        c09dl.LJIILLIIL("deferred_cache_enable");
        c09dl.LJJJJJL(badgeCacheOptimizeParams2.deferredCacheEnable);
        c09dl.LJIILLIIL("max_cache_size");
        c09dl.LJJJJ(Integer.valueOf(badgeCacheOptimizeParams2.maxCacheSize));
        c09dl.LJIILLIIL("cache_expire_time_ms");
        c09dl.LJJIZ(badgeCacheOptimizeParams2.cacheExpireTimeMs);
        c09dl.LJIILLIIL("member_count_threshold");
        c09dl.LJJJJ(Integer.valueOf(badgeCacheOptimizeParams2.memberCountThreshold));
        c09dl.LJII();
    }
}
