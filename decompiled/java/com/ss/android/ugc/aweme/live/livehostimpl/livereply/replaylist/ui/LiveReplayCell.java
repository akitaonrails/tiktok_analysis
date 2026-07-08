package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0XQ7;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C1161920gLG;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1833570xoZ;
import X.C1833770xot;
import X.C1834240xpe;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1782300wTs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS12S0101000_27;
import irm.AkS64S0200000_27;
import irm.AkS94S0100000_27;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.HighlightCollection;
import tikcast.api.anchor.HighlightCollectionElement;
import tikcast.api.anchor.HighlightCollectionVideo;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayCell extends PowerCell<C1833770xot> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplayCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylist/data/LiveReplayListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveReplayCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveReplayListViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 339);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(102);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 473), awS560S0100000_16, AFwS216S0000000_27.get$arr$(136), new AwS560S0100000_16((C03K6) this, 348), new AwS560S0100000_16((C03K6) this, 350), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 456), aFwS269S0000000_27, new AwS560S0100000_16((C03K6) this, 332), null, new AwS560S0100000_16((C03K6) this, 334));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 349);
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 476);
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(c19719912DlLIZ, 455);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS560S0100000_162, 22));
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16(c01gwLIZIZ, 333);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16(c01gwLIZIZ, 335);
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 336);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 337);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 338);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_272, awS560S0100000_16, new C452080Ho6(), awS560S0100000_163, awS560S0100000_164, awS571S0100000_27, aFwS269S0000000_27, awS560S0100000_165, awS560S0100000_166, awS560S0100000_167);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 463), awS560S0100000_16, AFwS216S0000000_27.get$arr$(134), new AwS560S0100000_16((C03K6) this, 340), new AwS560S0100000_16((C03K6) this, 341), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 467), aFwS269S0000000_27, new AwS560S0100000_16((C03K6) this, 342), null, new AwS560S0100000_16((C03K6) this, 343));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 468), awS560S0100000_16, AFwS216S0000000_27.get$arr$(135), new AwS560S0100000_16((C03K6) this, 344), new AwS560S0100000_16((C03K6) this, 345), new AwS560S0100000_16((C03K6) this, 346), aFwS269S0000000_27, null, null, new AwS560S0100000_16((C03K6) this, 347));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 471));
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 475));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 470));
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 469));
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 474));
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 472));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 466));
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 465));
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 464));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 461));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 460));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 459));
        this.LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 458));
        this.LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 457));
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 462));
    }

    public final LiveReplayListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (LiveReplayListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view = this.itemView;
        C786410Ut5.I7(new AkS64S0200000_27(this, view, 1), (View) this.LLILLJJLI.getValue());
        C786410Ut5.I7(new AkS94S0100000_27(this, 10), (View) this.LLIZLLLIL.getValue());
        Iterator it2 = new C1077420e8y((ConstraintLayout) this.LLJI.getValue(), 6).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (c1077410e8x.hasNext()) {
                Object next = c1077410e8x.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C786410Ut5.I7(new AkS12S0101000_27(this, i2, 0), (View) next);
                i2 = i3;
            } else {
                Iterator it3 = new C1077420e8y((ConstraintLayout) this.LLJJI.getValue(), 7).iterator();
                while (true) {
                    C1077410e8x c1077410e8x2 = (C1077410e8x) it3;
                    if (!c1077410e8x2.hasNext()) {
                        LiveReplayHighlightPageRefactorSetting liveReplayHighlightPageRefactorSetting = LiveReplayHighlightPageRefactorSetting.INSTANCE;
                        if (liveReplayHighlightPageRefactorSetting.enable()) {
                            C500260Jjc.LLFFF((View) this.LLJILLL.getValue());
                            C786410Ut5.I7(new AkS94S0100000_27(this, 11), (View) this.LLJIJIL.getValue());
                        } else {
                            C500260Jjc.LJIILIIL((View) this.LLJILLL.getValue());
                        }
                        if (liveReplayHighlightPageRefactorSetting.isV1()) {
                            C500260Jjc.LJIILIIL((View) this.LLJJI.getValue());
                            return;
                        } else {
                            C500260Jjc.LLFFF((View) this.LLJJI.getValue());
                            return;
                        }
                    }
                    Object next2 = c1077410e8x2.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    C786410Ut5.I7(new AkS12S0101000_27(this, i, 1), ((ViewGroup) this.LLJJ.getValue()).getChildAt(i));
                    C786410Ut5.I7(new AkS12S0101000_27(this, i, 2), (View) next2);
                    i = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r21) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayCell.onBindItemView(X.0zJl):void");
    }

    public final void N5(int i, String str) {
        List<LiveFragmentDetail> list;
        LiveFragmentDetail liveFragmentDetail;
        String str2;
        String str3;
        String strLJJLIIIJ;
        List<LiveFragmentDetail> list2;
        RoomReplay roomReplay;
        RoomReplay roomReplay2;
        RoomReplay roomReplay3;
        String str4;
        Long lValueOf;
        List<LiveFragmentDetail> list3;
        LiveFragmentDetail liveFragmentDetail2;
        RoomReplay roomReplay4;
        C1833770xot item = getItem();
        if (item != null && (list = item.LLILLJJLI) != null && (liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLZIJ(i, list)) != null) {
            I5().LLILLJJLI = getItem();
            String str5 = null;
            if (LiveReplayHighlightPageRefactorSetting.INSTANCE.enable()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//webcast_highlight_page");
                smartRouteBuildRoute.withParam("fragment_id", String.valueOf(liveFragmentDetail.fragmentId));
                C1833770xot item2 = getItem();
                if (item2 != null && (roomReplay4 = item2.LL) != null) {
                    str4 = roomReplay4.id;
                } else {
                    str4 = null;
                }
                smartRouteBuildRoute.withParam("replay_room_id", String.valueOf(str4));
                smartRouteBuildRoute.withParam("tab_id", EnumC1782300wTs.HIGHLIGHT.getValue());
                smartRouteBuildRoute.withParam("click_position", "highlights_and_clips");
                smartRouteBuildRoute.withParam("last_page", "live_replay");
                smartRouteBuildRoute.withParam("enter_method", str);
                C1833570xoZ.LIZ.getClass();
                smartRouteBuildRoute.withParam("enter_from_page", C1833570xoZ.LIZIZ);
                smartRouteBuildRoute.withParam("enter_from", "live_replay");
                C1833770xot c1833770xot = I5().LLILLJJLI;
                if (c1833770xot != null && (list3 = c1833770xot.LLILLJJLI) != null && (liveFragmentDetail2 = (LiveFragmentDetail) C13LP.LJJJLL(list3)) != null) {
                    lValueOf = Long.valueOf(liveFragmentDetail2.ownerUserId);
                } else {
                    lValueOf = null;
                }
                smartRouteBuildRoute.withParam("anchor_id", String.valueOf(lValueOf));
                smartRouteBuildRoute.open();
            } else {
                Uri.Builder builderAppendQueryParameter = C1834240xpe.LIZIZ("live_highlight_page_url", "sslocal://webcast_lynxview?trans_navigation_bar=1&hide_nav_bar=1&hide_status_bar=0&use_spark=1&url=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_fundamental_live_replay/pages/highlight-list/template.js&should_full_screen=1&status_bar_bg_color=000000&status_font_mode=light&container_bg_color=000000&loading_bg_color=000000&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=highlight&starling_channel=3588__38137&starling_fallback=1").appendQueryParameter("fragment_id", String.valueOf(liveFragmentDetail.fragmentId));
                C1833770xot item3 = getItem();
                if (item3 == null || (roomReplay2 = item3.LL) == null || (str2 = roomReplay2.title) == null) {
                    str2 = "";
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("replay_title", str2);
                C1833770xot item4 = getItem();
                if (item4 != null && (roomReplay = item4.LL) != null) {
                    str3 = roomReplay.id;
                } else {
                    str3 = null;
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("replay_room_id", String.valueOf(str3)).appendQueryParameter("fragment_list_scene", "7");
                C1833770xot item5 = getItem();
                if (item5 != null && (list2 = item5.LLILLJJLI) != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, AFwS269S0000000_27.get$arr$(369), 31);
                } else {
                    strLJJLIIIJ = null;
                }
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("fragment_id_list", strLJJLIIIJ).appendQueryParameter("last_page", "live_replay");
                C1833570xoZ.LIZ.getClass();
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.itemView.getContext(), builderAppendQueryParameter4.appendQueryParameter("enter_from_page", C1833570xoZ.LIZIZ).appendQueryParameter("enter_from", C1833570xoZ.LIZJ).appendQueryParameter("click_position", "highlights_and_clips").build().toString());
            }
            C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
            C1833770xot item6 = getItem();
            if (item6 != null && (roomReplay3 = item6.LL) != null) {
                str5 = roomReplay3.id;
            }
            String strValueOf = String.valueOf(str5);
            c1833570xoZ.getClass();
            C1833570xoZ.LIZ("highlight", strValueOf, str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.db5, false, 4, null);
    }

    public final void L5(int i, String str, String str2) {
        HighlightCollection highlightCollection;
        List<HighlightCollectionElement> list;
        HighlightCollectionElement highlightCollectionElement;
        String str3;
        Long lValueOf;
        List<LiveFragmentDetail> list2;
        LiveFragmentDetail liveFragmentDetail;
        RoomReplay roomReplay;
        RoomReplay roomReplay2;
        String str4;
        C1833770xot item = getItem();
        if (item != null && (highlightCollection = item.LLILLL) != null && (list = highlightCollection.elementList) != null && (highlightCollectionElement = (HighlightCollectionElement) C13LP.LJJJLZIJ(i, list)) != null) {
            I5().LLILLJJLI = getItem();
            LiveReplayHighlightPageRefactorSetting liveReplayHighlightPageRefactorSetting = LiveReplayHighlightPageRefactorSetting.INSTANCE;
            String str5 = null;
            if (liveReplayHighlightPageRefactorSetting.isV1() || liveReplayHighlightPageRefactorSetting.isV3() || (liveReplayHighlightPageRefactorSetting.isV2() && Intrinsics.LJFF(str, "view_all"))) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//webcast_highlight_page");
                smartRouteBuildRoute.withParam("fragment_id", String.valueOf(highlightCollectionElement.id));
                C1833770xot item2 = getItem();
                if (item2 != null && (roomReplay = item2.LL) != null) {
                    str3 = roomReplay.id;
                } else {
                    str3 = null;
                }
                smartRouteBuildRoute.withParam("replay_room_id", String.valueOf(str3));
                smartRouteBuildRoute.withParam("tab_id", EnumC1782300wTs.AUTOCUT.getValue());
                smartRouteBuildRoute.withParam("click_position", str);
                smartRouteBuildRoute.withParam("enter_method", str2);
                smartRouteBuildRoute.withParam("last_page", "live_replay");
                C1833570xoZ.LIZ.getClass();
                smartRouteBuildRoute.withParam("enter_from_page", C1833570xoZ.LIZIZ);
                smartRouteBuildRoute.withParam("enter_from", "live_replay");
                smartRouteBuildRoute.withParam("is_quick_post", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(liveReplayHighlightPageRefactorSetting.isV3())) ? 1 : 0));
                C1833770xot c1833770xot = I5().LLILLJJLI;
                if (c1833770xot != null && (list2 = c1833770xot.LLILLJJLI) != null && (liveFragmentDetail = (LiveFragmentDetail) C13LP.LJJJLL(list2)) != null) {
                    lValueOf = Long.valueOf(liveFragmentDetail.ownerUserId);
                } else {
                    lValueOf = null;
                }
                smartRouteBuildRoute.withParam("anchor_id", String.valueOf(lValueOf));
                smartRouteBuildRoute.open();
            } else {
                VideoMetaInfo videoMetaInfo = highlightCollectionElement.originalVideoMetaInfo;
                if (videoMetaInfo != null) {
                    str4 = videoMetaInfo.url;
                } else {
                    str4 = null;
                }
                String strValueOf = String.valueOf(highlightCollectionElement.id);
                if (!liveReplayHighlightPageRefactorSetting.isV2()) {
                    HighlightCollectionVideo highlightCollectionVideo = (HighlightCollectionVideo) C13LP.LJJJLZIJ(0, highlightCollectionElement.videoList);
                    if (highlightCollectionVideo == null) {
                        return;
                    }
                    str4 = highlightCollectionVideo.url;
                    strValueOf = highlightCollectionVideo.fragmentId;
                }
                IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                Context context = this.itemView.getContext();
                String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), highlightCollectionElement);
                String strValueOf2 = String.valueOf(highlightCollectionElement.type);
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                C1833570xoZ.LIZ.getClass();
                iGameService.Ut(context, str4, "livesdk_anchor_highlight_post_click", ".mp4", strValueOf, 1, "", "", "", json, strValueOf2, curUserId, "", "", null, "", C1833570xoZ.LIZIZ, C2097608Jq.LJ(), null);
            }
            C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
            C1833770xot item3 = getItem();
            if (item3 != null && (roomReplay2 = item3.LL) != null) {
                str5 = roomReplay2.id;
            }
            String strValueOf3 = String.valueOf(str5);
            c1833570xoZ.getClass();
            C1833570xoZ.LIZ("auto_cut", strValueOf3, str2);
        }
    }
}
