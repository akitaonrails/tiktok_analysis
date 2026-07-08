package com.ss.android.ugc.aweme.commercialize.service;

import X.AbstractC1216410hl9;
import X.AbstractC1255880imo;
import X.C1010120cOQ;
import X.C1017070cZd;
import X.C1017160cZm;
import X.C1019030ccn;
import X.C1021870chN;
import X.C1022820ciu;
import X.C1024180cl6;
import X.C1030680cva;
import X.C1031030cw9;
import X.C1045070dIn;
import X.C1045220dJ2;
import X.C1045340dJE;
import X.C1216360hl4;
import X.C1252850ihv;
import X.C1255920ims;
import X.C19GS;
import X.C1AF0;
import X.C2093608Ic;
import X.C2184171Adz;
import X.C2201701BEy;
import X.C2264031DjV;
import X.C2264471DkD;
import X.C486660J6q;
import X.C581980Ms8;
import X.C988820bq4;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceGlueOutServiceImpl implements ICommerceGlueOutService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final long LIZ() {
        return C1045340dJE.LJIJI().LJIIZILJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final int LJJLIL() {
        return C1045340dJE.LJIJI().LJIIJ + 1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final long getCurrentPosition() {
        return C1045340dJE.LJIJI().LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final boolean LIZIZ(Aweme aweme) {
        return C1045220dJ2.LJIIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIIIZ(Aweme aweme) {
        int videoLength;
        boolean z;
        boolean z2;
        Integer num;
        List<String> list = C1019030ccn.LIZ;
        float fLIZ = C1024180cl6.LIZ();
        if (aweme.getVideo() != null) {
            videoLength = aweme.getVideo().getVideoLength();
        } else {
            videoLength = 0;
        }
        IAppMeasurementProvider iAppMeasurementProvider = C1019030ccn.LIZLLL;
        if (iAppMeasurementProvider != null && iAppMeasurementProvider.LIZJ(aweme, "RawAdPlay")) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJFF = C2264471DkD.LJFF();
        boolean zLJ = C2264471DkD.LJ();
        boolean zLIZJ = C2264471DkD.LIZJ();
        if (zLJ && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (C1017070cZd.LJJLIIJ(aweme) || C1017070cZd.LLILII(aweme))) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "play", C1017070cZd.LJJIJLIJ(aweme));
            c1022820ciuLIZLLL.LIZJ(Integer.valueOf(videoLength), "video_length");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1045340dJE.LJIJI().LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
            c1022820ciuLIZLLL.LIZIZ(Float.valueOf(fLIZ), "playervol");
            c1022820ciuLIZLLL.LIZIZ(C1019030ccn.LJI(aweme), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019030ccn.LJIIZILJ(aweme), "room_id");
            c1022820ciuLIZLLL.LIZIZ(C1045340dJE.LJIIZILJ(aweme), "bsh_video_id");
            if (C1019030ccn.LJIJ(aweme)) {
                num = 1;
            } else {
                num = null;
            }
            c1022820ciuLIZLLL.LIZIZ(num, "aweme_updated");
            if (C1030680cva.LJIIJJI(aweme) && C1030680cva.LJFF(aweme)) {
                c1022820ciuLIZLLL.LIZIZ(String.valueOf(C1030680cva.LJFF(aweme)), "is_encrypt");
            }
            String strLJ = C1045340dJE.LJ(aweme);
            if (strLJ != null && !strLJ.isEmpty()) {
                c1022820ciuLIZLLL.LIZIZ(strLJ, "bsh_card_area");
            }
            if (C1017070cZd.LLILII(aweme)) {
                C2264031DjV.LIZ.getClass();
                c1022820ciuLIZLLL.LIZIZ("1", C2264031DjV.LIZIZ.LIZ);
            }
            if (z) {
                if (zLIZJ) {
                    c1022820ciuLIZLLL.LIZIZ("1", "ams_also_reported");
                }
                if (zLJFF) {
                    c1022820ciuLIZLLL.LIZIZ("1", "track_from_online_in_ams");
                }
            }
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (AwemeExtKt.isAdTraffic(aweme) && awemeRawAdLJJIJLIJ != null) {
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel playTrackUrlList = awemeRawAdLJJIJLIJ.getPlayTrackUrlList();
            Long creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
            String logExtra = awemeRawAdLJJIJLIJ.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("play", playTrackUrlList, creativeId, logExtra);
        }
        if (AwemeExtKt.isAdTraffic(aweme)) {
            C988820bq4.LIZ(aweme);
            C988820bq4.LIZ.getClass();
            C988820bq4.LIZIZ().put(aweme, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hl4] */
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final C1216360hl4 LJIIJ(AbstractC1255880imo abstractC1255880imo) {
        return new AbstractC1216410hl9<C1252850ihv, C1255920ims<C1252850ihv>>(abstractC1255880imo) { // from class: X.0hl4
            {
                this.mModel = abstractC1255880imo instanceof C1252850ihv ? abstractC1255880imo : null;
                this.mPresenter = new C1212520hes();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
                PRESENTER presenter = this.mPresenter;
                Object[] objArr = new Object[8];
                objArr[0] = c2189821An6.getUid();
                int i3 = 1;
                objArr[1] = c2189821An6.getSecUid();
                objArr[2] = Long.valueOf(c2189821An6.getMaxCursor());
                objArr[3] = 0L;
                objArr[4] = 6;
                if (c2189821An6.getMaxCursor() != 0) {
                    i3 = 4;
                }
                objArr[5] = Integer.valueOf(i3);
                objArr[6] = c2189821An6.getAdvId();
                objArr[7] = "";
                presenter.LIZJ(objArr);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final boolean LJIJI(Aweme aweme) {
        return C1045220dJ2.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIJ(Aweme aweme) {
        List<String> list = C1019030ccn.LIZ;
        C2184171Adz.LIZLLL("draw_ad", "show_100pct", aweme.getAwemeRawAd()).LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJJL(C1045070dIn c1045070dIn) {
        C1045220dJ2.LJIIZILJ(c1045070dIn);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "like", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJFF(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "like_cancel", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJI(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        HashMap map;
        if (C1019030ccn.LJIJI(context, aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !C2093608Ic.LJ(awemeRawAd.getOpenUrl())) {
            Uri uri = UriProtector.parse(awemeRawAd.getOpenUrl());
            if ("webcast_room".equals(uri.getHost()) && "ad_link".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge"))) {
                HashMap map2 = new HashMap();
                map2.put("enter_from_merge", "ad_link");
                map2.put("action_type", "click");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    map2.put("enter_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    map2.put("anchor_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                    map2.put("room_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                    map2.put("video_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_pb");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                    map2.put("log_pb", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "request_id");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) {
                    map2.put("request_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                }
                LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                if (newLiveRoomDataExt == null) {
                    map = new HashMap();
                } else {
                    map = new HashMap();
                    if (newLiveRoomDataExt.roomLayout == 1) {
                        map.put("live_type", "game");
                    } else if (newLiveRoomDataExt.liveTypeAudio) {
                        map.put("live_type", "voice_type");
                    } else if (newLiveRoomDataExt.isThirdParty) {
                        map.put("live_type", "thirdparty");
                    } else {
                        map.put("live_type", "video_live");
                    }
                }
                map2.putAll(map);
                LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                HashMap map3 = new HashMap();
                if (newLiveRoomDataExt2 != null && newLiveRoomDataExt2.withLinkmic && (newLiveRoomDataExt2.liveTypeAudio || newLiveRoomDataExt2.linkMicLayout == 16)) {
                    map3.put("interact_function", "chat_room");
                }
                map2.putAll(map3);
                C486660J6q.LJIIJ(map2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJII(Context context, Aweme aweme) {
        C1019030ccn.LJJJIL(context, "click_button", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIIJJI(Context context, Aweme aweme) {
        C1019030ccn.LJJJJI(context, "background_ad", "click_message", aweme, C1019030ccn.LJIIJJI(context, aweme, false, null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIILJJIL(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_redpacket", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIIZILJ(String str, String str2) {
        List<String> list = C1019030ccn.LIZ;
        if (TextUtils.equals("click", str)) {
            C988820bq4.LJFF(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIJ(Context context, Aweme aweme) {
        C1019030ccn.LJJIJIIJI(context, aweme, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIJJLI(Context context, Aweme aweme) {
        C1019030ccn.LJJIJLIJ(context, aweme, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIL(Context context, Aweme aweme) {
        C1019030ccn.LJJJIL(context, "click_coupon", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJ(Context context, Aweme aweme) {
        C1045340dJE.LJIJI().getClass();
        C1045340dJE.LJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIFFI(Context context, Aweme aweme) {
        if (C1019030ccn.LJIJI(context, aweme)) {
            JSONObject jSONObjectLJIIJJI = C1019030ccn.LJIIJJI(context, aweme, true, null);
            try {
                jSONObjectLJIIJJI.put("refer", "photo");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C1019030ccn.LJJJJJ(context, aweme.getAwemeRawAd(), "homepage_ad", "click", jSONObjectLJIIJJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJII(Context context, Aweme aweme) {
        C1019030ccn.LJJJJIZL(context, "click_start", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIII(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "ad_click", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIIJZLJL(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_form", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIIZ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_call", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIIZI(Context context, Aweme aweme) {
        C1019030ccn.LJJ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final boolean LJJIJL(C19GS c19gs, Aweme aweme) {
        return C1021870chN.LIZ(c19gs, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIJLIJ(Context context, Aweme aweme) {
        C1019030ccn.LJJJIL(context, "click_call", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIL(Context context, Aweme aweme) {
        C1019030ccn.LJJIJ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIZ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "othershow", aweme, C1019030ccn.LJIIJ(context, aweme, "sticker"));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_message", aweme, C1019030ccn.LJIIJJI(context, aweme, false, null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJI(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_button", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJI(Context context, Aweme aweme) {
        C1019030ccn.LJJJJI(context, "draw_ad", "click_message", aweme, C1019030ccn.LJIIJJI(context, aweme, false, null));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJIZL(Context context, Aweme aweme) {
        C1019030ccn.LJJIII(context, aweme, null, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJJ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_coupon", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJLI(Context context, Aweme aweme) {
        C1019030ccn.LJJJIL(context, "click_redpacket", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJLL(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "click_start", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJZ(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "otherclick", aweme, C1019030ccn.LJIIJ(context, aweme, "sticker"));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJZI(Context context, Aweme aweme) {
        C1019030ccn.LJJJIL(context, "click_start", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJLIIL(Context context, Aweme aweme) {
        C1019030ccn.LJJJJ(context, "music_click", aweme, C1019030ccn.LJIIIZ(context, aweme));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJLL(Aweme aweme, Aweme aweme2) {
        C1031030cw9.LIZ.getClass();
        C1031030cw9.LIZIZ(aweme, aweme2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LIZJ(String str, String str2, JSONObject jSONObject) {
        C1019030ccn.LJJJ(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LIZLLL(C19GS c19gs, String str, String str2) {
        C1019030ccn.LJJJI(c19gs, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIIL(Context context, Aweme aweme, Map<String, String> map) {
        JSONObject jSONObjectLJIIJJI = C1019030ccn.LJIIJJI(context, aweme, true, map);
        HashMap map2 = new HashMap();
        map2.put("anchor_id", C1019030ccn.LJI(aweme));
        map2.put("room_id", C1019030ccn.LJIIZILJ(aweme));
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            map2.put("pack_content_type", aweme.getAwemeRawAd().getType());
        }
        C1019030ccn.LJJJJL(aweme, map2);
        if (aweme.isAd() && !C1017070cZd.LLIZLLLIL(aweme) && !C1010120cOQ.LJIJI(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
            C1019030ccn.LJJJJLI(System.currentTimeMillis(), aweme.getAwemeRawAd().getCreativeIdStr(), map2);
        }
        C1017160cZm.LIZ(aweme, map2, map.get("refer"), false);
        try {
            jSONObjectLJIIJJI.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map2));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C1019030ccn.LJJJIL(context, "click", aweme, jSONObjectLJIIJJI);
        if (C1017070cZd.LJJLIIJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
        map.get("refer");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIILL(Context context, Aweme aweme, String str) {
        C1019030ccn.LJJIIZI(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIILLIIL(Context context, Aweme aweme, String str) {
        C1019030ccn.LJJIJIL(context, aweme, str, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIJJ(Context context, Aweme aweme, Map<String, String> map) {
        C1019030ccn.LJJIJL(context, aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJI(Context context, Aweme aweme, Map map) {
        C1019030ccn.LJJIJLIJ(context, aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIIJ(Context context, Aweme aweme, String str) {
        C1019030ccn.LJJIII(context, aweme, null, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIJIIJI(Context context, Aweme aweme, String str) {
        C1019030ccn.LJJIJIIJI(context, aweme, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a6  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(int r11, long r12, com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.service.CommerceGlueOutServiceImpl.LJJIJIL(int, long, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJL(Context context, Aweme aweme, String str) {
        C1019030ccn.LJJII(context, aweme, str, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIIIIZZ(UrlModel urlModel, Long l, String str, Function2 function2) {
        C2201701BEy.LIZ.getClass();
        C2201701BEy.LIZ("click", urlModel, l, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJIILIIL(Context context, Aweme aweme, String str, Map map) {
        C1019030ccn.LJJIJIL(context, aweme, str, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJIJIIJIL(Context context, Aweme aweme, C581980Ms8 c581980Ms8, int i) {
        C1019030ccn.LIZIZ(aweme, c581980Ms8, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJIL(Context context, Aweme aweme, String str, Map<String, ? extends Object> map) {
        C1019030ccn.LJJII(context, aweme, str, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService
    public final void LJJJJ(Context context, Aweme aweme, Map<String, String> map, String str) {
        C1019030ccn.LJJIII(context, aweme, map, str);
    }
}
