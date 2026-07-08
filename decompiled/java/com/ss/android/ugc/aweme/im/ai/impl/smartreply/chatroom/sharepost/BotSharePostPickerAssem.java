package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.AbstractC1255880imo;
import X.AbstractC214823195h;
import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0ZEM;
import X.C0ZEP;
import X.C0ZEQ;
import X.C0ZES;
import X.C1255920ims;
import X.C13LE;
import X.C1400340mXo;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1767006w0;
import X.C19719912Dl;
import X.C21673919s1;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C896290ZEd;
import X.C896300ZEe;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS137S0100000_2;
import Y.ARunnableS114S0100000_14;
import Y.AsS41S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class BotSharePostPickerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public BotSharePostPickerAssem$initList$1$gridLayoutManager$1 LLJ;
    public final C1722300uv6 LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotSharePostPickerAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/chatroom/sharepost/BotSharePostPickerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BotSharePostPickerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BotSharePostPickerViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 208), AFwS248S0000000_14.get$arr$(58), null, true);
        this.LLJI = new C1722300uv6();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 206));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 209));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 207));
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 205));
    }

    public final TuxSkeletonLayout Ho() {
        return (TuxSkeletonLayout) this.LLJILJILJ.getValue();
    }

    public final C1749280vcc Jo() {
        return (C1749280vcc) this.LLJILJIL.getValue();
    }

    public final BotSharePostPickerViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (BotSharePostPickerViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            r5 = this;
            X.0vcc r3 = r5.Jo()
            if (r3 != 0) goto L7
            return
        L7:
            r0 = 1
            r3.setLayoutVariant(r0)
            android.view.View r0 = r5.LJJIJL()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r0
            int r4 = (int) r1
            X.01GW r0 = r5.LLJILLL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r2 = 0
            if (r0 == 0) goto L64
            int r0 = r0.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L64
            int r1 = r1.intValue()
        L3f:
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r1 = r1 + r0
            int r4 = r4 - r1
            if (r4 < 0) goto L52
            r2 = r4
        L52:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r0 = r0.height
            if (r0 == r2) goto L63
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r0.height = r2
            X.C786410Ut5.U6(r3, r0)
        L63:
            return
        L64:
            r0 = 96
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem.Go():void");
    }

    public final void No() {
        C1749280vcc c1749280vccJo = Jo();
        if (c1749280vccJo != null) {
            C786410Ut5.LLLZLZ(c1749280vccJo, 8);
            C786410Ut5.l9(c1749280vccJo, null);
            c1749280vccJo.setClickable(false);
            c1749280vccJo.setTouchDelegate(null);
            c1749280vccJo.setStatus(this.LLJI);
            if (c1749280vccJo.getLayoutParams().height != -1) {
                ViewGroup.LayoutParams layoutParams = c1749280vccJo.getLayoutParams();
                layoutParams.height = -1;
                C786410Ut5.U6(c1749280vccJo, layoutParams);
            }
        }
    }

    public final void Oo() {
        BotSharePostPickerAssem$initList$1$gridLayoutManager$1 botSharePostPickerAssem$initList$1$gridLayoutManager$1;
        int size;
        C0ZEQ c0zeq;
        C0ZES state = Lo().getState();
        C0ZEP c0zep = state.LLILZIL;
        if (!c0zep.LIZIZ || c0zep.LIZ) {
            return;
        }
        C0ZEM c0zem = state.LL;
        C896290ZEd c896290ZEd = C896290ZEd.LIZ;
        if (!Intrinsics.LJFF(c0zem, c896290ZEd) || (botSharePostPickerAssem$initList$1$gridLayoutManager$1 = this.LLJ) == null || (size = state.LLILLJJLI.size()) <= 0 || botSharePostPickerAssem$initList$1$gridLayoutManager$1.findLastVisibleItemPosition() < (size - 1) - 3) {
            return;
        }
        BotSharePostPickerViewModel botSharePostPickerViewModelLo = Lo();
        C0ZES state2 = botSharePostPickerViewModelLo.getState();
        C0ZEP c0zep2 = state2.LLILZIL;
        if (c0zep2.LIZIZ && !c0zep2.LIZ && Intrinsics.LJFF(state2.LL, c896290ZEd)) {
            C0ZEQ c0zeq2 = botSharePostPickerViewModelLo.LLILLJJLI;
            if ((c0zeq2 == null || !c0zeq2.LJIIL()) && (c0zeq = botSharePostPickerViewModelLo.LLILLJJLI) != null) {
                Object[] objArr = new Object[6];
                objArr[0] = 4;
                objArr[1] = Boolean.TRUE;
                C0I0B c0i0b = C0I0B.LJFF;
                String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                objArr[2] = curUserId;
                objArr[3] = 0;
                objArr[4] = 7000;
                User currentUser = ((C1400340mXo) c0i0b.LIZ()).getCurrentUser();
                objArr[5] = currentUser != null ? currentUser.getSecUid() : null;
                if (c0zeq.LIZJ(objArr)) {
                    botSharePostPickerViewModelLo.setState(AFwS248S0000000_14.get$arr$(389));
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ValueAnimator animator;
        super.onDestroy();
        TuxSkeletonLayout tuxSkeletonLayoutHo = Ho();
        if (tuxSkeletonLayoutHo == null || (animator = tuxSkeletonLayoutHo.getAnimator()) == null) {
            return;
        }
        animator.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.0ZEQ, X.0iur] */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem$initList$1$gridLayoutManager$1] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC1255880imo<Aweme, ?> abstractC1255880imoCreateAwemeModel;
        BotSharePostPickerFragment botSharePostPickerFragment;
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.c_u);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 59));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
        }
        TuxSkeletonLayout tuxSkeletonLayoutHo = Ho();
        if (tuxSkeletonLayoutHo != null) {
            tuxSkeletonLayoutHo.setPreviewItemRes(R.layout.cf0);
            tuxSkeletonLayoutHo.setAnimationDuration(800L);
        }
        final ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != 0) {
            powerList.setClipToPadding(false);
            final Context context = powerList.getContext();
            ?? r1 = new GridLayoutManager(context) { // from class: com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem$initList$1$gridLayoutManager$1
                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                    super.onLayoutCompleted(c21673919s1);
                    if (c21673919s1 != null && c21673919s1.LIZIZ() > 0) {
                        HandlerHook.viewPost(powerList, new ARunnableS114S0100000_14(this, 9));
                    }
                }
            };
            this.LLJ = r1;
            r1.LLIZ = new AbstractC214823195h() { // from class: X.0ZEf
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    List<InterfaceC1891350zJl> listLJII = powerList.getState().LJII();
                    if (i < 0 || i >= listLJII.size() || !(ListProtector.get(listLJII, i) instanceof C06XM)) {
                        return 1;
                    }
                    return 3;
                }
            };
            powerList.setLayoutManager(r1);
            powerList.LJIILJJIL(BotSharePostAwemeCell.class, BotSharePostLoadMoreFooterCell.class);
            ViewOnAttachStateChangeListenerC20604515jv powerList2 = getPowerList();
            if (powerList2 != null) {
                powerList2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
            }
            powerList.addItemDecoration(new C1767006w0(this, 7));
            powerList.addOnScrollListener(new AsS41S0100000_14(this, 3));
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        AbstractC1255880imo<Aweme, ?> abstractC1255880imo = null;
        if ((fragmentLJI instanceof BotSharePostPickerFragment) && (botSharePostPickerFragment = (BotSharePostPickerFragment) fragmentLJI) != null) {
            botSharePostPickerFragment.LLIZ = new AwS558S0100000_14(this, 1338);
        }
        BotSharePostPickerViewModel botSharePostPickerViewModelLo = Lo();
        selectSubscribe(botSharePostPickerViewModelLo, new C2217381BqS() { // from class: X.0ZEj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0ZEW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0ZEb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0ZEg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0ZEh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(botSharePostPickerViewModelLo.usedInReusedScene), null, new C896300ZEe(this));
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ZEi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLIZ;
            }
        }, null, AFwS284S0000000_1.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ZEX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLIZLLLIL;
            }
        }, null, AnonymousClass0208.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ZEU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLJ;
            }
        }, null, AnonymousClass0208.get$arr$(29), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ZEV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZES) obj).LLJI;
            }
        }, null, AnonymousClass0208.get$arr$(30), 6);
        final BotSharePostPickerViewModel botSharePostPickerViewModelLo2 = Lo();
        if (botSharePostPickerViewModelLo2.LLILLJJLI == null) {
            IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpiForReal(IProfileService.class);
            if (iProfileService != null) {
                abstractC1255880imoCreateAwemeModel = iProfileService.createAwemeModel();
            } else {
                abstractC1255880imoCreateAwemeModel = null;
            }
            if (abstractC1255880imoCreateAwemeModel instanceof AbstractC1255880imo) {
                abstractC1255880imo = abstractC1255880imoCreateAwemeModel;
            }
            botSharePostPickerViewModelLo2.LLILLL = abstractC1255880imo;
            if (abstractC1255880imo == null) {
                botSharePostPickerViewModelLo2.setState(AFwS248S0000000_14.get$arr$(61));
                return;
            }
            ?? r12 = new C1255920ims<AbstractC1255880imo<Aweme, ?>>() { // from class: X.0ZEQ
                @Override // X.C1255920ims, X.C1260870iur
                public final void LJIILIIL() {
                    if (this.LL == 0) {
                        return;
                    }
                    super.LJIILIIL();
                }

                @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                public final void onSuccess() {
                    AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                    if (abstractC1255880imo2 == null) {
                        return;
                    }
                    boolean z = false;
                    if (abstractC1255880imo2.mListQueryType != 4) {
                        if (abstractC1255880imo2.isDataEmpty()) {
                            botSharePostPickerViewModelLo2.wQ2(C13BV.INSTANCE, false);
                            return;
                        } else {
                            botSharePostPickerViewModelLo2.wQ2(abstractC1255880imo2.getItems(), abstractC1255880imo2.isHasMore());
                            return;
                        }
                    }
                    BotSharePostPickerViewModel botSharePostPickerViewModel = botSharePostPickerViewModelLo2;
                    List<? extends Aweme> items = abstractC1255880imo2.getItems();
                    if (abstractC1255880imo2.isHasMore() && !abstractC1255880imo2.isNewDataEmpty()) {
                        z = true;
                    }
                    List<Aweme> listVQ2 = botSharePostPickerViewModel.vQ2(items);
                    if (listVQ2 == null) {
                        listVQ2 = C13BV.INSTANCE;
                    }
                    if (!listVQ2.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Aweme aweme : botSharePostPickerViewModel.LLILZ) {
                            String aid = aweme.getAid();
                            if (aid != null) {
                                linkedHashMap.put(aid, aweme);
                            }
                        }
                        for (Aweme aweme2 : listVQ2) {
                            String aid2 = aweme2.getAid();
                            if (aid2 != null) {
                                linkedHashMap.put(aid2, aweme2);
                            }
                        }
                        botSharePostPickerViewModel.LLILZ = C13LP.LLIIII(linkedHashMap.values());
                    }
                    botSharePostPickerViewModel.setState(new C0ZEL(!botSharePostPickerViewModel.LLILZ.isEmpty(), botSharePostPickerViewModel.yQ2(botSharePostPickerViewModel.LLILZ), C13LP.LLIIJI(botSharePostPickerViewModel.LLILZIL), z));
                }

                @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                public final void onFailed(Exception exc) {
                    AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                    if (abstractC1255880imo2 == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("presenter onFailed, listQueryType=");
                    sbLIZ.append(abstractC1255880imo2.mListQueryType);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (abstractC1255880imo2.mListQueryType == 4) {
                        botSharePostPickerViewModelLo2.setState(AFwS248S0000000_14.get$arr$(59));
                    } else {
                        botSharePostPickerViewModelLo2.setState(new AwS593S0100000_14(exc, 21));
                    }
                }
            };
            r12.LJIIJ(abstractC1255880imo);
            botSharePostPickerViewModelLo2.LLILLJJLI = r12;
            botSharePostPickerViewModelLo2.refresh();
        }
    }

    public final void So(TuxSkeletonLayout tuxSkeletonLayout, boolean z) {
        int iLIZIZ;
        int paddingLeft = tuxSkeletonLayout.getPaddingLeft();
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = 0;
        }
        tuxSkeletonLayout.setPadding(paddingLeft, iLIZIZ, tuxSkeletonLayout.getPaddingRight(), tuxSkeletonLayout.getPaddingBottom());
        tuxSkeletonLayout.setLoading(z);
    }
}
