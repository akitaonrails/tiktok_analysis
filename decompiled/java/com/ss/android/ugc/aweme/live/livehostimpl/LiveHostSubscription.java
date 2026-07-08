package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC2361009My;
import X.AnonymousClass1677;
import X.C01GW;
import X.C0C64;
import X.C0JKV;
import X.C0JSB;
import X.C0L0G;
import X.C0WZX;
import X.C0XQ7;
import X.C1219970hqt;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C1228700i4y;
import X.C1228810i59;
import X.C1230910i8X;
import X.C1388190mED;
import X.C1411590mpx;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1618506Vj;
import X.C1701330uNH;
import X.C1836170xsl;
import X.C1910310zoL;
import X.C19322110iZ;
import X.C19719612Di;
import X.C19EG;
import X.C19EH;
import X.C20684815ws;
import X.C207204166g;
import X.C207213166p;
import X.C207218166u;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2348809Ig;
import X.C452501pT;
import X.C490570JLr;
import X.C495480Jbu;
import X.C495490Jbv;
import X.C518580KVk;
import X.C520010KaN;
import X.C521920KdS;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1219960hqs;
import X.EnumC1228720i50;
import X.EnumC1228990i5R;
import X.EnumC1229950i6z;
import X.EnumC1230500i7s;
import X.EnumC1230920i8Y;
import X.EnumC913760Zt0;
import X.InterfaceC1631620sYq;
import X.InterfaceC1822460xWe;
import X.InterfaceC20685415wy;
import X.InterfaceC495470Jbt;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveSubscriptionContextWrapperSetting;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.PcsVideoActivity;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.PcsCourseDetailFragment;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.dialog.PcsCourseDetailSheet;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveHostSubscription implements IHostSubscription {
    public C1910310zoL LL;
    public final List<Function0<Unit>> LLILLJJLI = new ArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 766));
    public InterfaceC1631620sYq<? super String, ? super JSONObject, ? super Map<String, String>, Unit> LLILZ;

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final int Ah0() {
        return 402685969;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final boolean Xs() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "pgc_subs_web_enabled", true, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final boolean l21() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "sov_preview_consumption", true, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final InterfaceC1822460xWe nN2() {
        return new InterfaceC1822460xWe() { // from class: X.0xYC
            @Override // X.InterfaceC1822460xWe
            public final C1823300xY0 LIZ() {
                return new C1823300xY0();
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Bc1(InterfaceC495470Jbt interfaceC495470Jbt) {
        InterfaceC20685415wy interfaceC20685415wy;
        if (interfaceC495470Jbt instanceof InterfaceC20685415wy) {
            interfaceC20685415wy = (InterfaceC20685415wy) interfaceC495470Jbt;
        } else {
            interfaceC20685415wy = null;
        }
        C20684815ws.LJIJJLI(interfaceC20685415wy);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Ca0(Function0<Unit> function0) {
        C1910310zoL c1910310zoL;
        C19719612Di.LJJIIJ(this.LLILLJJLI, new AwS607S0100000_28(function0, (Function0<Unit>) 88), true);
        if (((ArrayList) this.LLILLJJLI).isEmpty() && (c1910310zoL = this.LL) != null) {
            ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZLLL(c1910310zoL);
            this.LL = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Ia2(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("previous_page", "subscription_page", bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withParam(UriProtector.parse("https://www.tiktok.com/email/h5/notifications?disableBounces=1"));
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final String Rj(String str) {
        return ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).Rj(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void iL1(C518580KVk c518580KVk) {
        this.LLILZ = c518580KVk;
        C20684815ws.LJIJJLI((C207204166g) this.LLILLL.getValue());
        if (c518580KVk != null) {
            C20684815ws.LIZ((C207204166g) this.LLILLL.getValue());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void iQ1(AnonymousClass1677 anonymousClass1677) {
        EmoteEditDialogFragment emoteEditDialogFragment = new EmoteEditDialogFragment();
        emoteEditDialogFragment.LLJJIII = anonymousClass1677;
        emoteEditDialogFragment.LLJJIJI = anonymousClass1677.LJI;
        emoteEditDialogFragment.show(anonymousClass1677.LIZ, "SubscribePreviewImageDialogFragment");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void kB2(Activity activity) {
        IExternalAlbumService iExternalAlbumService = (IExternalAlbumService) PluggableExtentionKt.pluggableSpi$default(IExternalAlbumService.class, false, false, false, 14, null);
        if (iExternalAlbumService != null) {
            iExternalAlbumService.LIZ(activity);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void mS1(C207213166p c207213166p) {
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = new SpotlightImageListPreviewDialogFragment();
        spotlightImageListPreviewDialogFragment.LLJILLL = c207213166p;
        spotlightImageListPreviewDialogFragment.LLJILJILJ = c207213166p.LJFF;
        spotlightImageListPreviewDialogFragment.LLJJIJI = c207213166p.LIZIZ;
        spotlightImageListPreviewDialogFragment.show(c207213166p.LIZ, "SpotlightImageListPreviewDialogFragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09My, X.0zoL] */
    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void v72(Function0<Unit> function0) {
        ((ArrayList) this.LLILLJJLI).add(function0);
        if (this.LL == null) {
            ?? r2 = new AbstractC2361009My() { // from class: X.0zoL
                @Override // X.AbstractC2361009My
                public final boolean onShot(String str) {
                    super.onShot(str);
                    Iterator<Function0<Unit>> it2 = this.LL.LLILLJJLI.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                    return false;
                }
            };
            ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LJFF(r2);
            this.LL = r2;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final List<LiveSubMediaModel> vZ(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("choose_live_sub_media");
        if (parcelableArrayListExtra == null) {
            return new ArrayList();
        }
        return parcelableArrayListExtra;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final InterfaceC495470Jbt yj0(InterfaceC1631620sYq<? super String, ? super JSONObject, ? super Map<String, String>, Unit> interfaceC1631620sYq) {
        C1411590mpx c1411590mpx = new C1411590mpx(interfaceC1631620sYq);
        C20684815ws.LIZ(c1411590mpx);
        return c1411590mpx;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final List<LiveSubMediaModel> CA1(Intent intent, String str) {
        return C207218166u.LIZ(intent.getParcelableArrayListExtra(str));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void In1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) PcsVideoActivity.class);
        intent.putExtras(bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UBYq/qCWJ6yrHDFJLV7xCLwr0iPe", null));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void P51(AnonymousClass1677 anonymousClass1677, String str) {
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = new SpotlightImageEditDialogFragment();
        spotlightImageEditDialogFragment.LLJJIII = anonymousClass1677;
        spotlightImageEditDialogFragment.LLJJIJI = anonymousClass1677.LJI;
        spotlightImageEditDialogFragment.LLLII = str;
        spotlightImageEditDialogFragment.show(anonymousClass1677.LIZ, "SpotlightImageEditDialogFragment");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Rq2(Context context, C0JKV c0jkv) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C0XQ7.LIZ().bindEmail(activityLIZ, "subscription_page", "click", null, new C521920KdS(c0jkv, 0));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void WH(Context context, String str) {
        C1228650i4t c1228650i4t = new C1228650i4t("fans_club_page", "anchor_fans_club_page_entrance_click", EnumC1228990i5R.PUBLIC_GROUP.getValue(), null, 0, new C1228700i4y(0, 2, null, null, null, 29), false, null, null, false, null, false, null, null, null, null, 0, 0, false, null, null, null, -1064, 1);
        String value = EnumC913760Zt0.FAN_GROUP.getValue();
        EnumC1219960hqs.Companion.getClass();
        C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "fans_club_page", "anchor_fans_club_page_entrance_click").LJFF(context, new C1228470i4b(c1228650i4t, new C1228810i59("fans_club_page", "anchor_fans_club_page_entrance_click", str, false, false, null, 0L, EnumC1230500i7s.JOIN_LIVE_PROFILE_FAN_LIST, null, null, 2, null, value, null, Collections.singletonList(C1219970hqt.LIZ(1)), null, false, null, null, 4022128)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void ZR0(Context context, List<SubscribingInfo> list) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//live/container");
        smartRouteBuildRoute.withParam("fragment_type", "price_change");
        smartRouteBuildRoute.withParam("subscribe_info", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), list));
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void ch(Fragment fragment, String str) {
        C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "", "").LJII(R.id.eux, 16, fragment, new C1230910i8X("creator_chat_room_list", "click_creator_chat_room_cell", 1, "", EnumC1219960hqs.SUBSCRIPTION.getValue(), EnumC1219960hqs.UNKNOWN.getValue(), null, EnumC1228720i50.CHAT_ROOM.getValue(), EnumC1230920i8Y.DEFAULT.getValue(), "", 0, false, false, EnumC1229950i6z.DEFAULT.getValue(), System.currentTimeMillis(), false, false, null, null, null, EnumC1230500i7s.JOIN_SUBSCRIBE_GROUP_LIST), str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final String ky0(Context context, Uri uri) {
        ContentResolver contentResolver;
        Cursor cursorLJJJ;
        int columnIndex;
        String string = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme) || (contentResolver = context.getContentResolver()) == null || (cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, new String[]{"_data"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UBYq/qCWJ6yrHDFJLV7xCLwr0iPe", null))) == null) {
            return null;
        }
        if (cursorLJJJ.moveToFirst() && (columnIndex = cursorLJJJ.getColumnIndex("_data")) > -1) {
            string = cursorLJJJ.getString(columnIndex);
        }
        cursorLJJJ.close();
        return string;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void u60(Context context, Bundle bundle) throws Throwable {
        C1606420ruC c1606420ruCLIZIZ = C1607950rwf.LIZIZ(R.anim.m0, R.anim.m1, context);
        Intent intent = new Intent(context, (Class<?>) PcsCourseActivity.class);
        intent.putExtras(bundle);
        if (C1388190mED.LIZ(context) == null) {
            intent.addFlags(268435456);
        }
        Bundle bundleLJFF = c1606420ruCLIZIZ.LJFF();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_2");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJ(context, intent, bundleLJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UBYq/qCWJ6yrHDFJLV7xCLwr0iPe", null));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void EB0(Context context, int i, String str) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//live/container");
        smartRouteBuildRoute.withParam("fragment_type", "subscribe");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("open_sub_only_setting", i);
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final IHostSubscription.Result vV1(Fragment fragment, Intent intent, IHostSubscription.Params params) {
        return T62(fragment, C207218166u.LIZ(intent.getParcelableArrayListExtra("choose_photo")), params, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdkapi.host.IHostSubscription.Result T62(androidx.fragment.app.Fragment r18, java.util.List<com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel> r19, com.bytedance.android.livesdkapi.host.IHostSubscription.Params r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSubscription.T62(androidx.fragment.app.Fragment, java.util.List, com.bytedance.android.livesdkapi.host.IHostSubscription$Params, boolean):com.bytedance.android.livesdkapi.host.IHostSubscription$Result");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final IHostSubscription.Result.PhotoFile vq2(Context context, LiveSubMediaModel liveSubMediaModel, int i, int i2, int i3, int i4, boolean z) throws JSONException {
        Bitmap bitmapCreateBitmap;
        IHostSubscription.Result.PhotoFile photoFile = new IHostSubscription.Result.PhotoFile();
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(ky0(context, UriProtector.parse(liveSubMediaModel.getFileLocalUriPath())), 1080, 1080);
        boolean z2 = true;
        if (z) {
            if (liveSubMediaModel.getWidth() == 0 || liveSubMediaModel.getHeight() == 0) {
                liveSubMediaModel.setWidth(bitmapFromSD.getWidth());
                liveSubMediaModel.setHeight(bitmapFromSD.getHeight());
            }
            if (liveSubMediaModel.getWidth() < i || liveSubMediaModel.getHeight() < i2) {
                photoFile.isLittlePhoto = true;
                return photoFile;
            }
        }
        if (bitmapFromSD.getWidth() < i3 && bitmapFromSD.getHeight() < i4) {
            if (bitmapFromSD.getWidth() < bitmapFromSD.getHeight()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, 0, (bitmapFromSD.getHeight() - bitmapFromSD.getWidth()) / 2, bitmapFromSD.getWidth(), bitmapFromSD.getWidth());
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, (bitmapFromSD.getWidth() - bitmapFromSD.getHeight()) / 2, 0, bitmapFromSD.getHeight(), bitmapFromSD.getHeight());
            }
            if (bitmapFromSD.getWidth() == bitmapFromSD.getHeight()) {
                z2 = false;
            }
        } else if (bitmapFromSD.getWidth() > i3 && bitmapFromSD.getHeight() < i4) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, (bitmapFromSD.getWidth() - bitmapFromSD.getHeight()) / 2, 0, bitmapFromSD.getHeight(), bitmapFromSD.getHeight());
        } else if (bitmapFromSD.getWidth() < i3 && bitmapFromSD.getHeight() > i4) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, 0, (bitmapFromSD.getHeight() - bitmapFromSD.getWidth()) / 2, bitmapFromSD.getWidth(), bitmapFromSD.getWidth());
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapFromSD, (bitmapFromSD.getWidth() - i3) / 2, (bitmapFromSD.getHeight() - i4) / 2, i3, i4);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 25, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data:image/webp;base64,");
        sbLIZ.append(strEncodeToString);
        photoFile.base64 = C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uri", UriProtector.parse(liveSubMediaModel.getFileLocalUriPath()).getPath());
        jSONObject.put("file_name", liveSubMediaModel.getFileName());
        photoFile.path = C786410Ut5.J3(jSONObject);
        photoFile.size = bitmapCreateBitmap.getByteCount();
        photoFile.withTextSticker = liveSubMediaModel.getWithTextSticker();
        photoFile.isCropped = z2;
        photoFile.isLittlePhoto = false;
        return photoFile;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Is0(Context context, String str, int i, boolean z, int i2, boolean z2, boolean z3, C495490Jbv c495490Jbv) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        FragmentManager fragmentManagerLJIL;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i2);
        bundle.putBoolean("isMute", z2);
        bundle.putBoolean("isPause", z3);
        bundle.putBoolean("isAutoPlay", z);
        bundle.putInt("videoLength", i);
        C786410Ut5.LJJJI("videoUrl", str, bundle);
        EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment = new EducationVideoPlayerDialogFragment();
        educationVideoPlayerDialogFragment.LLJILLL = c495490Jbv;
        educationVideoPlayerDialogFragment.setArguments(bundle);
        educationVideoPlayerDialogFragment.setCancelable(false);
        if (LiveSubscriptionContextWrapperSetting.INSTANCE.getValue()) {
            if (context != null && (fragmentManagerLJIL = C520010KaN.LJIL(context, false)) != null) {
                educationVideoPlayerDialogFragment.show(fragmentManagerLJIL, "common_video_player");
                return;
            }
            return;
        }
        if ((context instanceof C19EG) && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            educationVideoPlayerDialogFragment.show(supportFragmentManager, "common_video_player");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void KC0(Context context, String str, String str2, long j, long j2, String str3, long j3, boolean z) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C0JSB c0jsb = new C0JSB(str, str2, j, j2, str3, j3, z);
            PcsCourseDetailSheet pcsCourseDetailSheet = new PcsCourseDetailSheet();
            pcsCourseDetailSheet.LLJLLL = c0jsb;
            C19322110iZ.LJFF(supportFragmentManager, pcsCourseDetailSheet, "pcs_course_detail_sheet", null, 0);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Fy(Context context, String str, String str2, String str3, Integer num, String str4, String str5, int i, C495480Jbu c495480Jbu) {
        int iIntValue;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        FragmentManager fragmentManagerLJIL;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("roomId", str, bundle);
        C786410Ut5.LJJJI("videoUrl", str2, bundle);
        C786410Ut5.LJJJI("downloadUrl", str3, bundle);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        bundle.putInt("downloadStatus", iIntValue);
        if (str4 == null) {
            str4 = "";
        }
        C786410Ut5.LJJJI("enterFromPage", str4, bundle);
        if (str5 == null) {
            str5 = "";
        }
        C786410Ut5.LJJJI("enterFrom", str5, bundle);
        C786410Ut5.LJJJI("last_page", "live_page", bundle);
        bundle.putInt("videoLength", i);
        bundle.putBoolean("isAutoPlay", false);
        bundle.putInt("position", 0);
        bundle.putBoolean("isMute", false);
        bundle.putBoolean("isPause", false);
        bundle.putBoolean("asFragmentAddToActivity", false);
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = new LiveReplayVideoPlayerDialogFragment();
        liveReplayVideoPlayerDialogFragment.LLLIIL = c495480Jbu;
        liveReplayVideoPlayerDialogFragment.setArguments(bundle);
        liveReplayVideoPlayerDialogFragment.setCancelable(false);
        if (LiveSubscriptionContextWrapperSetting.INSTANCE.getValue()) {
            if (context != null && (fragmentManagerLJIL = C520010KaN.LJIL(context, false)) != null) {
                liveReplayVideoPlayerDialogFragment.show(fragmentManagerLJIL, "common_video_player");
                return;
            }
            return;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            liveReplayVideoPlayerDialogFragment.show(supportFragmentManager, "common_video_player");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Q32(FragmentManager fragmentManager, String str, String str2, long j, long j2, String str3, long j3, boolean z, boolean z2) {
        C490570JLr c490570JLr = PcsCourseDetailFragment.LLILZ;
        Long lValueOf = Long.valueOf(j3);
        c490570JLr.getClass();
        PcsCourseDetailFragment pcsCourseDetailFragmentLIZ = C490570JLr.LIZ(str, str2, j, j2, str3, lValueOf, false, z, z2);
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.vga, pcsCourseDetailFragmentLIZ, null);
        c19ehLJIIJ.LJIIL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void tG2(Fragment fragment, int i, int i2, int i3, int i4, C0L0G c0l0g, Map<String, ? extends Object> map, int i5, int i6) {
        ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LIZLLL(fragment, i, i2, i3, i4, c0l0g.minWidth, c0l0g.minHeight, c0l0g.maxWidth, c0l0g.maxHeight, c0l0g.maxSize, map, 3, i5, i6);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final Fragment wt1(boolean z, Room room, long j, String str, String str2, String str3, Boolean bool, Function1<? super Integer, Unit> function1, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Function0<Unit> function0) {
        SubOnlyVideoContentFragment subOnlyVideoContentFragment = new SubOnlyVideoContentFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_author", z);
        bundle.putLong("user_id", j);
        C786410Ut5.LJJJI("sec_user_id", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        subOnlyVideoContentFragment.setArguments(bundle);
        subOnlyVideoContentFragment.LLJ = bool;
        subOnlyVideoContentFragment.LLILLJJLI = room;
        subOnlyVideoContentFragment.LLJIJIL = function1;
        if (subOnlyVideoOpenParams == null) {
            subOnlyVideoOpenParams = new SubOnlyVideoOpenParams(null, null, 7, 0);
        }
        subOnlyVideoContentFragment.LLIZ = subOnlyVideoOpenParams;
        subOnlyVideoContentFragment.LLIZLLLIL = function0;
        return subOnlyVideoContentFragment;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void KJ1(Activity activity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map<String, ? extends Object> map, int i10) {
        ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LIZJ(activity, i, i2, i3, i4, i5, i6, i7, i8, i9, map, 3, 100, i10);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void NR0(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10) {
        C1836170xsl.LIZ.getClass();
        C1836170xsl.LIZJ(context, 0.0f, null, str, str2, str3, str4, str5, null, str8, str9, str10, "", str6, str7);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void g21(Context context, String str, String str2, String str3, String str4, int i, String str5, long j, long j2, int i2, Map<String, ? extends Object> map, ArrayList<IHostSubscription.SpriteImage> arrayList, String str6, String str7) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//live/ReplayVideoClipActivity");
        smartRouteBuildRoute.withParam("videoId", str);
        smartRouteBuildRoute.withParam("videoUrl", str2);
        String str8 = "";
        if (str3 == null) {
            str3 = "";
        }
        smartRouteBuildRoute.withParam("enterFromPage", str3);
        if (str4 != null) {
            str8 = str4;
        }
        smartRouteBuildRoute.withParam("enterFrom", str8);
        if (str5 == null) {
            str5 = "live_replay";
        }
        smartRouteBuildRoute.withParam("lastPage", str5);
        smartRouteBuildRoute.withParam("videoLengthMS", ((long) i) * 1000);
        smartRouteBuildRoute.withParam("initialTimeMS", j);
        smartRouteBuildRoute.withParam("initialDurationMS", j2);
        smartRouteBuildRoute.withParam("cutContentType", i2);
        smartRouteBuildRoute.withParam("extra", C2348809Ig.LJIIIIZZ(map));
        smartRouteBuildRoute.withParam("spriteImage", arrayList);
        smartRouteBuildRoute.withParam("user_type", str6);
        smartRouteBuildRoute.withParam("anchor_id", str7);
        smartRouteBuildRoute.open();
    }
}
