package com.ss.android.ugc.aweme.story.inbox.view;

import X.C1320700kTM;
import X.C1324840ka2;
import X.C1387040mCM;
import X.C13LP;
import X.C1429810nJL;
import X.C14EU;
import X.C1595350rcL;
import X.C1598870ri1;
import X.C1599200riY;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C19727912Gn;
import X.C201955140j;
import X.C2188811AlT;
import X.C295190Bhd;
import X.C422770Ghv;
import X.C604440NnG;
import X.C786410Ut5;
import X.EnumC1606080rte;
import X.InterfaceC1330440kj4;
import X.InterfaceC1891350zJl;
import Y.ACListenerS137S0100000_2;
import Y.ARunnableS93S0200000_24;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.onthisday.RefreshLocalMediasEvent;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryOnThisDayInboxCell extends PowerCell<C1598870ri1> {
    public C422770Ghv LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public C19727912Gn LLILZIL;
    public TuxTextView LLILZLL;
    public boolean LLIZ;
    public final WeakReference<StoryOnThisDayInboxCell> LL = new WeakReference<>(this);
    public final boolean LLIZLLLIL = ((ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class)).needJumpToOnThisDayPreviewPage();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            r9 = this;
            r2 = r9
            super.onViewAttachedToWindow()
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell> r0 = r2.LL
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L1d
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZLLL()
            boolean r0 = r0.LJIIJ(r1)
            if (r0 != 0) goto L1d
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZLLL()
            r0.LJIJJ(r1)
        L1d:
            boolean r0 = r2.LLIZLLLIL
            r7 = 0
            if (r0 == 0) goto L55
            X.0zJl r0 = r2.getItem()
            X.0ri1 r0 = (X.C1598870ri1) r0
            if (r0 == 0) goto L66
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.LLILZLL
            if (r1 == 0) goto L66
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L66
            java.lang.String r6 = r0.getAid()
        L3b:
            java.lang.String r3 = "on_this_day"
            r4 = 0
            r5 = 0
            if (r6 != 0) goto L43
            java.lang.String r6 = ""
        L43:
            X.0zJl r0 = r2.getItem()
            X.0ri1 r0 = (X.C1598870ri1) r0
            if (r0 == 0) goto L4f
            java.util.Map r7 = I5(r0)
        L4f:
            r8 = 30
            X.C1595350rcL.LIZJ(r2, r3, r4, r5, r6, r7, r8)
            return
        L55:
            X.0zJl r0 = r2.getItem()
            X.0ri1 r0 = (X.C1598870ri1) r0
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LL
            if (r0 == 0) goto L66
            java.lang.String r6 = r0.getAid()
            goto L3b
        L66:
            r6 = r7
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell.onViewAttachedToWindow():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell.N5():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LL.get();
        if (storyOnThisDayInboxCell == null || !EventBus.LIZLLL().LJIIJ(storyOnThisDayInboxCell)) {
            return;
        }
        EventBus.LIZLLL().LJJI(storyOnThisDayInboxCell);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1595350rcL.LIZ.LIZLLL(this, AFwS264S0000000_24.get$arr$(401));
        this.LLILLJJLI = (C422770Ghv) this.itemView.findViewById(R.id.f5e);
        this.LLILLL = this.itemView.findViewById(R.id.f5f);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.nkz);
        this.LLILZIL = (C19727912Gn) this.itemView.findViewById(R.id.w28);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.p0w);
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 47), this.itemView);
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        View view = this.itemView;
        C422770Ghv c422770Ghv = this.LLILLJJLI;
        if (c422770Ghv == null) {
            c422770Ghv = null;
        }
        View viewFindViewById = view.findViewById(R.id.bi2);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C19727912Gn c19727912Gn = this.LLILZIL;
        C19727912Gn c19727912Gn2 = c19727912Gn != null ? c19727912Gn : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("on_this_day_ring_view", this.itemView.findViewById(R.id.bjy));
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, viewFindViewById, c422770Ghv, tuxTextView, c19727912Gn2, linkedHashMap), C295190Bhd.LIZIZ());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LL.get();
        if (storyOnThisDayInboxCell == null || !EventBus.LIZLLL().LJIIJ(storyOnThisDayInboxCell)) {
            return;
        }
        EventBus.LIZLLL().LJJI(storyOnThisDayInboxCell);
    }

    public static Map I5(C1598870ri1 c1598870ri1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", c1598870ri1.LLJ);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Aweme> list = c1598870ri1.LLILZLL;
        if (list != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getIsTikTokStory()) {
                    linkedHashSet.add("story");
                } else {
                    linkedHashSet.add("post");
                }
            }
        }
        if (c1598870ri1.LLIZ != null && (!r0.isEmpty())) {
            linkedHashSet.add("local");
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.add("no_content");
        }
        linkedHashMap.put("on_this_day_content_type_list", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final UrlModel cover;
        Aweme aweme;
        Video video;
        final C1598870ri1 c1598870ri1 = (C1598870ri1) interfaceC1891350zJl;
        super.onBindItemView(c1598870ri1);
        C422770Ghv c422770Ghv = null;
        if (C1599200riY.LIZ() == 1) {
            C19727912Gn c19727912Gn = this.LLILZIL;
            if (c19727912Gn == null) {
                c19727912Gn = null;
            }
            C786410Ut5.d0(c19727912Gn, 4);
        } else if (C1599200riY.LIZ() == 2) {
            C604440NnG.LIZ.getClass();
            if (C604440NnG.LIZIZ()) {
                C19727912Gn c19727912Gn2 = this.LLILZIL;
                if (c19727912Gn2 == null) {
                    c19727912Gn2 = null;
                }
                C786410Ut5.d0(c19727912Gn2, 0);
            }
        }
        Aweme aweme2 = c1598870ri1.LL;
        if (aweme2 != null) {
            cover = aweme2.getVideo().getCover();
        } else {
            List<Aweme> list = c1598870ri1.LLILZLL;
            if (list != null && (aweme = (Aweme) C13LP.LJJJLZIJ(0, list)) != null && (video = aweme.getVideo()) != null) {
                cover = video.getCover();
            } else {
                cover = null;
            }
        }
        C1387040mCM.LIZ(this.itemView, new AwS638S0100000_24(this, 205));
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (cover != null) {
            C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show videoCover:");
            sbLIZ.append(cover);
            C201955140j.LIZJ(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C422770Ghv c422770Ghv2 = this.LLILLJJLI;
            if (c422770Ghv2 != null) {
                c422770Ghv = c422770Ghv2;
            }
            C1324840ka2.LJIIIIZZ(c422770Ghv, cover, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0rkh
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str, Throwable th) {
                    TuxIconView tuxIconView = this.LIZIZ.LLILZ;
                    C422770Ghv c422770Ghv3 = null;
                    if (tuxIconView == null) {
                        tuxIconView = null;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 4);
                    StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LIZIZ;
                    C1598870ri1 c1598870ri12 = c1598870ri1;
                    C422770Ghv c422770Ghv4 = storyOnThisDayInboxCell.LLILLJJLI;
                    if (c422770Ghv4 == null) {
                        c422770Ghv4 = null;
                    }
                    c422770Ghv4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    C422770Ghv c422770Ghv5 = storyOnThisDayInboxCell.LLILLJJLI;
                    if (c422770Ghv5 != null) {
                        c422770Ghv3 = c422770Ghv5;
                    }
                    HandlerHook.viewPost(c422770Ghv3, new ARunnableS93S0200000_24(storyOnThisDayInboxCell, c1598870ri12, 62));
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str, Object obj, Animatable animatable) {
                    TuxIconView tuxIconView = null;
                    if (C1599200riY.LIZ() == 1) {
                        StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LIZIZ;
                        TuxIconView tuxIconView2 = storyOnThisDayInboxCell.LLILZ;
                        if (tuxIconView2 == null) {
                            tuxIconView2 = null;
                        }
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_replay_fill;
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(storyOnThisDayInboxCell.itemView.getContext());
                        C12P5 c12p5 = new C12P5();
                        c12p5.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                        c12p5.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                        c12p5.LIZLLL = Integer.valueOf(R.attr.e1);
                        c12p5.LJ = Float.valueOf(0.25f);
                        c12p5.LJFF = Float.valueOf(0.0f);
                        c12p5.LJI = C12KQ.RADIAL;
                        c12p5.LJII = EnumC197015126j.EASE_IN_OUT;
                        tuxIconView2.setBackground(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c12p5.LIZ(storyOnThisDayInboxCell.itemView.getContext())));
                    }
                    TuxIconView tuxIconView3 = this.LIZIZ.LLILZ;
                    if (tuxIconView3 != null) {
                        tuxIconView = tuxIconView3;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C1890800zIs.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, cover.getUri(), "inbox-skylight-avatar");
                }
            });
            return;
        }
        List<MediaModel> list2 = c1598870ri1.LLIZ;
        if (list2 != null && !list2.isEmpty()) {
            C201955140j.LIZJ(C1429810nJL.LIZIZ, "show local media");
            C422770Ghv c422770Ghv3 = this.LLILLJJLI;
            if (c422770Ghv3 == null) {
                c422770Ghv3 = null;
            }
            c422770Ghv3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C422770Ghv c422770Ghv4 = this.LLILLJJLI;
            if (c422770Ghv4 != null) {
                c422770Ghv = c422770Ghv4;
            }
            HandlerHook.viewPost(c422770Ghv, new ARunnableS93S0200000_24(this, c1598870ri1, 62));
            return;
        }
        C201955140j.LIZJ(C1429810nJL.LIZIZ, "show low activity");
        C422770Ghv c422770Ghv5 = this.LLILLJJLI;
        if (c422770Ghv5 != null) {
            c422770Ghv = c422770Ghv5;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C1697810uHb.LJIILJJIL("https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsJ-ojllwZ-hahK/ljhwZthlaukjlkulzlp/past_memory_skylight_cover.png"));
        C1324840ka2.LJIIIIZZ(c422770Ghv, urlModel, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0rjj
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) {
                View view2 = this.LIZIZ.LLILLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.fbo, viewGroup, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(RefreshLocalMediasEvent refreshLocalMediasEvent) {
        C1598870ri1 item = getItem();
        if (item != null && item.LLIZ == null) {
            setItem(C1598870ri1.LIZ(item, refreshLocalMediasEvent.getLocalMedias(), false, null, 447));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object L5(int r4, java.util.List r5, X.InterfaceC1364105Vn r6) {
        /*
            X.099m r3 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r3.<init>(r0)
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L79
            int r1 = r2.getAwemeType()
            r0 = 150(0x96, float:2.1E-43)
            if (r1 != r0) goto L60
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r2.getPhotoModeImageInfo()
            if (r0 == 0) goto L79
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L79
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r0
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.displayImageNoWatermark
            if (r0 == 0) goto L79
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L79
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
        L3d:
            if (r0 == 0) goto L79
            X.0kl3 r2 = X.C1331660kl2.LJIIIZ(r0)
            X.01yx r1 = new X.01yx
            r0 = 3
            r1.<init>(r3, r0)
            r2.LJJII(r1)
        L4c:
            java.lang.Object r1 = r3.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L59
            X.C099Q.LIZJ(r6)
        L59:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L82
            return r1
        L60:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r2.getVideo()
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            if (r0 == 0) goto L79
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L79
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L3d
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
            goto L4c
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell.L5(int, java.util.List, X.05Vn):java.lang.Object");
    }
}
