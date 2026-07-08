package com.ss.android.ugc.aweme.feed.adapter;

import X.C0RD4;
import X.C0RF0;
import X.C1C7U;
import X.C21516719In;
import X.C444960Hcc;
import X.C786410Ut5;
import X.InterfaceC20673515v3;
import X.InterfaceC420801kM;
import X.InterfaceC472850IgV;
import X.ViewTreeObserverOnGlobalLayoutListenerC2189681Ams;
import Y.ALAdapterS9S0200000_12;
import Y.AObjectS386S0100000_11;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;
import com.ss.android.ugc.aweme.feed.cell.FullFollowRootAssem;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public class FollowLiveVideoViewHolder extends FullFeedVideoViewHolder {
    public static final /* synthetic */ int j1 = 0;
    public RoomStruct V0;
    public boolean W0;
    public boolean X0;
    public FeedLiveWindowWidget Y0;
    public final View Z0;
    public View a1;
    public Animator b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public Room g1;
    public InterfaceC420801kM h1;
    public final Handler i1;

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.x1():void");
    }

    public final boolean C1() {
        RoomStruct roomStruct = this.V0;
        return roomStruct != null && roomStruct.isPullUrlValid();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void LLJJLIIIJLLLLLLLZ() {
        if (this.LLJJIJI != null) {
            return;
        }
        this.LLJJIJI = new FullFollowRootAssem(this.f363e0, new AObjectS386S0100000_11(this, 25), this.C0);
    }

    public final void y1() {
        long liveWindowShowTime = this.LLJJ.getLiveWindowShowTime() * 1000;
        if (liveWindowShowTime <= 0) {
            return;
        }
        if (liveWindowShowTime < 2000) {
            liveWindowShowTime = 2000;
        }
        Handler handler = this.i1;
        C786410Ut5.LJLJLJ(handler, handler.obtainMessage(100), liveWindowShowTime);
    }

    public final void D1() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        if (C1() && (interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4()) != null) {
            InterfaceC420801kM interfaceC420801kM = this.h1;
            if (interfaceC420801kM != null) {
                if (!interfaceC420801kM.isDisposed()) {
                    this.h1.dispose();
                }
                this.h1 = null;
            }
            RoomStruct roomStruct = this.V0;
            if (roomStruct != null) {
                this.h1 = interfaceC20673515v3K4.LJI("", "", roomStruct.id, new InterfaceC472850IgV() { // from class: X.1AA5
                    @Override // X.InterfaceC472850IgV
                    public final void onFailed() {
                    }

                    @Override // X.InterfaceC472850IgV
                    public final void LIZ(FilterInfoData filterInfoData, boolean z) {
                        FollowLiveVideoViewHolder followLiveVideoViewHolder = this.LIZ;
                        if (z != followLiveVideoViewHolder.W0) {
                            followLiveVideoViewHolder.W0 = z;
                            followLiveVideoViewHolder.LLZL.zQ2(Boolean.valueOf(!z), "live_has_end");
                            FollowLiveVideoViewHolder followLiveVideoViewHolder2 = this.LIZ;
                            if (followLiveVideoViewHolder2.X0) {
                                followLiveVideoViewHolder2.x1();
                            }
                        }
                        if (!z) {
                            this.LIZ.B1(false);
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLLLL() {
        super.LLLLLLL();
        x1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLLLLLL() {
        super.LLLLLLLLL();
        DataCenter dataCenter = this.LLZL;
        dataCenter.yQ2("dismiss_live_window", this, false);
        dataCenter.yQ2("live_window_clicked", this, false);
        FeedLiveWindowWidget feedLiveWindowWidget = new FeedLiveWindowWidget();
        this.Y0 = feedLiveWindowWidget;
        WidgetManager widgetManager = this.LLZLI;
        if (widgetManager != null) {
            widgetManager.MR(R.id.mc4, feedLiveWindowWidget);
        }
        this.a1 = this.Y0.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        this.i1.removeMessages(100);
        Animator animator = this.b1;
        if (animator != null) {
            animator.cancel();
            this.b1 = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onPause() {
        super.onPause();
        this.c1 = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onResume() {
        super.onResume();
        D1();
        if (this.e1) {
            y1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
        this.W0 = false;
        this.g1 = null;
        this.f1 = false;
        Animator animator = this.b1;
        if (animator != null) {
            animator.cancel();
            this.b1 = null;
        }
        InterfaceC420801kM interfaceC420801kM = this.h1;
        if (interfaceC420801kM != null) {
            if (!interfaceC420801kM.isDisposed()) {
                this.h1.dispose();
            }
            this.h1 = null;
        }
        View view = this.a1;
        if (view != null && view.getVisibility() == 0) {
            C786410Ut5.LJLLLLLL(4, this.a1);
            C786410Ut5.Jc(this.a1, 0.0f);
        }
        if (this.Z0.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, this.Z0);
            C786410Ut5.Jc(this.Z0, 0.0f);
        }
    }

    public FollowLiveVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.i1 = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                FeedLiveWindowWidget feedLiveWindowWidget;
                C21516719In c21516719In;
                C1C7U.LIZ("FollowLiveVideoViewHolder@b316.<field>$1");
                FollowLiveVideoViewHolder followLiveVideoViewHolder = FollowLiveVideoViewHolder.this;
                if (!followLiveVideoViewHolder.X0) {
                    C1C7U.LIZIZ("FollowLiveVideoViewHolder@b316.<field>$1");
                    return;
                }
                if (message.what == 100) {
                    if (!followLiveVideoViewHolder.W0) {
                        C1C7U.LIZIZ("FollowLiveVideoViewHolder@b316.<field>$1");
                        return;
                    }
                    if (followLiveVideoViewHolder.C1()) {
                        FollowLiveVideoViewHolder followLiveVideoViewHolder2 = FollowLiveVideoViewHolder.this;
                        if (followLiveVideoViewHolder2.W0 && followLiveVideoViewHolder2.X0 && !followLiveVideoViewHolder2.d1 && (((feedLiveWindowWidget = followLiveVideoViewHolder2.Y0) == null || ((c21516719In = feedLiveWindowWidget.LLJ) != null && c21516719In.LLIZ != null)) && followLiveVideoViewHolder2.C1() && !followLiveVideoViewHolder2.c1)) {
                            followLiveVideoViewHolder2.c1 = true;
                            View view = followLiveVideoViewHolder2.a1;
                            if (view != null) {
                                if (view.getVisibility() == 8) {
                                    C786410Ut5.LJLLLLLL(0, followLiveVideoViewHolder2.a1);
                                    C786410Ut5.x3(followLiveVideoViewHolder2.a1.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(followLiveVideoViewHolder2, 7));
                                } else {
                                    C786410Ut5.LJLLLLLL(0, followLiveVideoViewHolder2.a1);
                                    View view2 = followLiveVideoViewHolder2.a1;
                                    C786410Ut5.Jc(view2, FollowLiveVideoViewHolder.z1(view2));
                                }
                            }
                        }
                    }
                }
                C1C7U.LIZIZ("FollowLiveVideoViewHolder@b316.<field>$1");
            }
        };
        this.Z0 = c0rf0.LIZ.findViewById(R.id.bm5);
    }

    public static float z1(View view) {
        if (view.getContext() != null && C444960Hcc.LIZJ(view.getContext())) {
            return view.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f = -view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return (f - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
    }

    public final void B1(boolean z) {
        View view = this.a1;
        if (view == null) {
            return;
        }
        if (z) {
            View view2 = this.Z0;
            Animator animator = this.b1;
            if (animator != null) {
                animator.cancel();
                this.b1 = null;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.b1 = animatorSet;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationX", z1(view2), 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, z1(view));
            objectAnimatorOfFloat2.setDuration(300L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new ALAdapterS9S0200000_12(view, view2, 6));
            animatorSet.start();
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.LJLLLLLL(0, this.Z0);
        C786410Ut5.Jc(this.Z0, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.X0 = true;
        D1();
        if (C1() && !this.d1) {
            y1();
        } else {
            B1(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r5) {
        /*
            r4 = this;
            super.onChanged(r5)
            if (r5 == 0) goto L13
            java.lang.String r1 = r5.LIZ
            r1.getClass()
            int r0 = r1.hashCode()
            r3 = 0
            r2 = 1
            switch(r0) {
                case -906007925: goto L1e;
                case -162745511: goto L14;
                case 1471092846: goto L7c;
                default: goto L13;
            }
        L13:
            return
        L14:
            java.lang.String r0 = "feed_internal_event"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 1
            goto L27
        L1e:
            java.lang.String r0 = "live_window_clicked"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r0 = 0
        L27:
            r1 = 0
            switch(r0) {
                case 0: goto L41;
                case 1: goto L2c;
                case 2: goto L85;
                default: goto L2b;
            }
        L2b:
            return
        L2c:
            java.lang.Object r0 = r5.LIZIZ
            if (r0 == 0) goto L31
            r1 = r0
        L31:
            X.0Svd r1 = (X.C737030Svd) r1
            if (r1 == 0) goto L13
            int r1 = r1.LIZ
            r0 = 19
            if (r1 != r0) goto L13
            r4.B1(r3)
            r4.e1 = r2
            return
        L41:
            android.view.View r0 = r4.a1
            if (r0 == 0) goto L4e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L4e
            r4.B1(r2)
        L4e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLJJ
            if (r0 == 0) goto L13
            java.lang.String r3 = r0.getAid()
            if (r3 == 0) goto L13
            r4.d1 = r2
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r4.LLZL
            java.lang.String r2 = "key_open_live_aweme_list"
            java.lang.Object r1 = r0.get(r2, r1)
            if (r1 != 0) goto L72
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r3)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r4.LLZL
            r0.zQ2(r1, r2)
            return
        L72:
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto L13
            java.util.Set r1 = (java.util.Set) r1
            r1.add(r3)
            return
        L7c:
            java.lang.String r0 = "dismiss_live_window"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L85
            return
        L85:
            r4.B1(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.onChanged(X.0RD4):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        this.X0 = false;
        B1(false);
        this.c1 = false;
        this.e1 = false;
        this.i1.removeMessages(100);
        Animator animator = this.b1;
        if (animator != null) {
            animator.cancel();
            this.b1 = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C0RD4) obj);
    }
}
