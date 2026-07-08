package com.bytedance.android.livesdk.broadcast.preview.widget.revision;

import X.C01GW;
import X.C098200Yq;
import X.C0ULX;
import X.C0ULZ;
import X.C0UO0;
import X.C11NJ;
import X.C13LQ;
import X.C1548820qPI;
import X.C1808280x9m;
import X.C189200o6;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C418440Gaw;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C760180Trs;
import X.C770230UJh;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1141530foN;
import X.InterfaceC1487280oo2;
import Y.AfS181S0100000_12;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.AgeBlockDataChannel;
import com.bytedance.android.livesdk.broadcast.LiveStatusPerceptionChannel;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS152S0101000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.BannerExtraParams;
import webcast.api.smb.BannerExtraParamsDailyChallenges;
import webcast.api.smb.BannerIcon;
import webcast.api.smb.SMBBannerInfoResponse;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.TopRightBannerContainerComponent;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewBannerWidget extends PreviewWidget implements InterfaceC1141530foN {
    public static final Set<String> LLJJI = C13LQ.LJLIIL(new String[]{"webcast_lynxview", "webcast_lynxview_popup", "webcast_webview", "webcast_webview_popup"});
    public C0ULX LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public Map<String, String> LLIZ;
    public Map<String, String> LLIZLLLIL;
    public Playbook LLJ;
    public Map<Integer, LiveGoLivePageContainer> LLJI;
    public boolean LLJIJIL;
    public View LLJILLL;
    public final Map<LiveMode, Boolean> LLJILJIL = new LinkedHashMap();
    public final Map<LiveMode, Boolean> LLJILJILJ = new LinkedHashMap();
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(72));

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        this.LLJIJIL = false;
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            c0ulx.onDetach();
        }
        ((C11NJ) this.LLJJ.getValue()).LJ();
        C1548820qPI.LJIIIIZZ("service_plus_reward_claimed", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hh4;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    public final void J1() {
        C0ULX c0ulx;
        C770230UJh.LIZ.getClass();
        int iLIZIZ = (C770230UJh.LIZLLL() && C770230UJh.LJ()) ? (int) C497740JfY.LIZIZ(C770230UJh.LIZ()) : -1;
        View view = this.contentView;
        if (view != null) {
            C500260Jjc.LJLJLLL(iLIZIZ, view);
        }
        View view2 = this.LLJILLL;
        if (view2 == null || (c0ulx = this.LLILZ) == null) {
            return;
        }
        c0ulx.LJZI(view2, AFwS199S0000000_12.get$arr$(73));
    }

    public final void L1() {
        LiveGoLivePageContainer liveGoLivePageContainerLIZIZ;
        TopRightBannerContainerComponent topRightBannerContainerComponent;
        Map<Integer, LiveGoLivePageContainer> map = this.LLJI;
        if (map == null || (liveGoLivePageContainerLIZIZ = C760180Trs.LIZIZ(this.dataChannel, map)) == null || (topRightBannerContainerComponent = liveGoLivePageContainerLIZIZ.topRightBannerContainer) == null) {
            hide();
        } else if (topRightBannerContainerComponent.type == 6) {
            this.LLIZLLLIL = liveGoLivePageContainerLIZIZ.bannerTypeName;
        } else if (topRightBannerContainerComponent.targetTopRightContainerItemType == 0) {
            H1(null, topRightBannerContainerComponent);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            c0ulx.onHide();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            c0ulx.onShow();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        LiveMode liveModeLIZJ;
        TopRightBannerContainerComponent topRightBannerContainerComponent;
        super.C1();
        C770230UJh.LIZ.getClass();
        if (C770230UJh.LIZLLL()) {
            J1();
        }
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && dataChannel.gg0(LiveStatusPerceptionChannel.class) != null) {
                DataChannel dataChannel2 = this.dataChannel;
                M1(-4, dataChannel2 != null ? dataChannel2.gg0(LiveStatusPerceptionChannel.class) : null);
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && dataChannel3.gg0(AgeBlockDataChannel.class) != null) {
                DataChannel dataChannel4 = this.dataChannel;
                int i = (dataChannel4 == null || (topRightBannerContainerComponent = (TopRightBannerContainerComponent) dataChannel4.gg0(AgeBlockDataChannel.class)) == null) ? 0 : topRightBannerContainerComponent.type;
                DataChannel dataChannel5 = this.dataChannel;
                M1(i, dataChannel5 != null ? dataChannel5.gg0(AgeBlockDataChannel.class) : null);
            }
            if (!this.LLJIJIL) {
                Map<LiveMode, Boolean> map = this.LLJILJIL;
                DataChannel dataChannel6 = this.dataChannel;
                if (dataChannel6 == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel6)) == null) {
                    liveModeLIZJ = LiveMode.VIDEO;
                }
                if (Intrinsics.LJFF(((LinkedHashMap) map).get(liveModeLIZJ), Boolean.TRUE)) {
                    hide();
                    return;
                }
            }
            L1();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewBannerAnchorViewChannel.class, new AwS591S0100000_12(this, 378));
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 379));
            dataChannel.EQ2(this, LiveStatusPerceptionChannel.class, new AwS591S0100000_12(this, 380));
            dataChannel.EQ2(this, AgeBlockDataChannel.class, new AwS591S0100000_12(this, 381));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, ActivePlaybookChannel.class, new AwS591S0100000_12(this, 760));
        }
        C1548820qPI.LIZLLL("service_plus_reward_claimed", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            c0ulx.onPause();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            c0ulx.onResume();
        }
    }

    public final void I1(int i) {
        Object c098200Yq;
        View bannerView;
        GradientDrawable gradientDrawable;
        try {
            C0ULX c0ulx = this.LLILZ;
            Drawable background = null;
            if (c0ulx != null) {
                bannerView = c0ulx.getBannerView();
                if (bannerView != null) {
                    background = bannerView.getBackground();
                }
            } else {
                bannerView = null;
            }
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = new AwS152S0101000_12(i, bannerView, 3);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeBackgroundColor failed. backgroundColor: ");
            sbLIZ.append(i);
            C20441214yg.LJ("PreviewBannerWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer num;
        if (Intrinsics.LJFF(c262100zr.LIZ, "service_plus_reward_claimed")) {
            Integer num2 = this.LLILZIL;
            if ((num2 != null && num2.intValue() == 30) || ((num = this.LLILZIL) != null && num.intValue() == 31)) {
                AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 377);
                C480460Ism.LIZ().getClass();
                ((C11NJ) this.LLJJ.getValue()).LIZ(C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).getSmbBannerInfo().LJIILIIL(new C0UO0()), null, "/smb/banner/info/", null, 13).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0f6X
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        SMBBannerInfoResponse.Banner banner;
                        int i;
                        long j;
                        String str;
                        int i2;
                        BannerExtraParamsDailyChallenges bannerExtraParamsDailyChallenges;
                        List<SMBBannerInfoResponse.Banner> list;
                        SMBBannerInfoResponse.Banner next;
                        SMBBannerInfoResponse.ResponseData responseData = (SMBBannerInfoResponse.ResponseData) ((BaseResponse) obj).data;
                        ImageModel imageModel = null;
                        if (responseData != null && (list = responseData.banners) != null) {
                            Iterator<SMBBannerInfoResponse.Banner> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.type == 2) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            banner = next;
                        } else {
                            banner = null;
                        }
                        if (banner == null) {
                            return null;
                        }
                        BannerExtraParams bannerExtraParams = banner.extraParams;
                        if (bannerExtraParams != null && (bannerExtraParamsDailyChallenges = bannerExtraParams.dailyChallenges) != null) {
                            i = bannerExtraParamsDailyChallenges.type;
                            j = bannerExtraParamsDailyChallenges.season;
                        } else {
                            i = 0;
                            j = 0;
                        }
                        BannerIcon bannerIcon = banner.icon;
                        if (bannerIcon == null || (str = bannerIcon.text) == null) {
                            str = "";
                        }
                        if (i != 1) {
                            if (i != 2) {
                                i2 = 0;
                            } else {
                                i2 = 30;
                            }
                        } else {
                            i2 = 31;
                        }
                        TopRightBannerContainerComponent topRightBannerContainerComponent = new TopRightBannerContainerComponent();
                        topRightBannerContainerComponent.type = i2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(i2);
                        sbLIZ.append(':');
                        sbLIZ.append(j);
                        topRightBannerContainerComponent.frequencyKey = C2188811AlT.LIZIZ(sbLIZ);
                        BannerIcon bannerIcon2 = banner.icon;
                        if (bannerIcon2 != null) {
                            imageModel = bannerIcon2.icon;
                        }
                        topRightBannerContainerComponent.image = imageModel;
                        topRightBannerContainerComponent.schema = banner.schema;
                        Text text = new Text();
                        text.defaultPattern = banner.text;
                        topRightBannerContainerComponent.titleText = text;
                        topRightBannerContainerComponent.extra = C2097608Jq.LJIIJ(new Pair("reward_amount", str));
                        return topRightBannerContainerComponent;
                    }
                }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00Xj
                    @Override // X.InterfaceC1487280oo2
                    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return null;
                    }
                }).LJJLL(new AfS181S0100000_12(awS591S0100000_12, 196), new AfS181S0100000_12(awS591S0100000_12, 197)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G1(int i, View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int iLIZIZ;
        C770230UJh.LIZ.getClass();
        if (C770230UJh.LIZLLL()) {
            if (C770230UJh.LIZLLL() && C770230UJh.LJ()) {
                iLIZIZ = (int) C497740JfY.LIZIZ(C770230UJh.LIZ());
            } else {
                iLIZIZ = -1;
            }
            View view2 = this.contentView;
            if (view2 != null) {
                C500260Jjc.LJLJLLL(iLIZIZ, view2);
            }
        }
        View view3 = this.contentView;
        C0ULX c0ulx = null;
        if ((view3 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view3) != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        View view4 = this.contentView;
        if ((view4 instanceof ViewGroup) && (viewGroup = (ViewGroup) view4) != null) {
            C19ME c19me = new C19ME(-1, -2);
            c19me.topToTop = 0;
            c19me.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = i;
            c19me.horizontalBias = 0.0f;
            viewGroup.addView(view, c19me);
        }
        if (view instanceof C0ULX) {
            c0ulx = (C0ULX) view;
        }
        this.LLILZ = c0ulx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if ((r5 instanceof X.C0ULX) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(android.view.View r9, webcast.data.TopRightBannerContainerComponent r10) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewBannerWidget.H1(android.view.View, webcast.data.TopRightBannerContainerComponent):void");
    }

    public final void M1(int i, Object obj) {
        boolean zLLZLLLL;
        Integer num = this.LLILZLL;
        if (num == null || num.intValue() != 2) {
            G1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), new C0ULZ(this.context));
            this.LLILZLL = 2;
            this.LLILZIL = Integer.valueOf(i);
        }
        C0ULX c0ulx = this.LLILZ;
        if (c0ulx != null) {
            zLLZLLLL = c0ulx.LLZLLLL(i, obj);
        } else {
            zLLZLLLL = false;
        }
        this.LLJIJIL = zLLZLLLL;
        if (zLLZLLLL) {
            show();
        } else {
            hide();
        }
    }
}
