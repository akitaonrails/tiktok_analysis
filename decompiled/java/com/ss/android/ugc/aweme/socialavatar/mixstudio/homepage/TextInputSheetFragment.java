package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0DSS;
import X.C0H6Q;
import X.C0H6S;
import X.C0H7H;
import X.C0H7I;
import X.C0HGK;
import X.C0HGL;
import X.C0HI6;
import X.C0HNF;
import X.C0HNG;
import X.C0HNH;
import X.C0HNL;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1237360iIw;
import X.C1272904yV;
import X.C1308910kAL;
import X.C13LE;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697820uHc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C21578619ce;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C338520DOw;
import X.C418440Gaw;
import X.C420500GeG;
import X.C428740GrY;
import X.C435650H6l;
import X.C439980HNc;
import X.C440190HNx;
import X.C440370HOp;
import X.C440480HPa;
import X.C441660HTo;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC441640HTm;
import X.InterfaceC0148002o;
import X.InterfaceC1237370iIx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC440090HNn;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.TextSuggestionRepository;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TextInputSheetFragment extends Fragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJCQ6KDsyOmshIDHELIOScgPDAoICB9ICohLD8yLyBiHSorPAwiOTonGy0pLDsVOiQrJCo9PA==";
    public C0H7I LL;
    public SmartImageView LLILZIL;
    public C1237360iIw LLILZLL;
    public AnonymousClass0956 LLIZ;
    public FrameLayout LLIZLLLIL;
    public C420500GeG LLJ;
    public C420500GeG LLJI;
    public C439980HNc LLJJIJIL;
    public int LLJJJ;
    public C0H7H LLJJJIL;
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public final C736950SvV LLILLJJLI = new C736950SvV(C13LE.LIZ(MixStudioHomePageViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(318), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 624));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 625));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 627));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(249));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(250));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(248));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(251));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(252));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(253));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(255));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(254));

    static {
        new C0HI6();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final EnumC441640HTm MR() {
        return (EnumC441640HTm) this.LLILLL.getValue();
    }

    public final int NR() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final boolean isNewUser() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1237360iIw c1237360iIw = this.LLILZLL;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DSS(c1237360iIw != null ? (EditText) c1237360iIw.findViewById(R.id.xl8) : null, this, null), 3);
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmMR = MR();
        boolean zIsNewUser = isNewUser();
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTmMR);
        c2344009Gk.LIZJ(zIsNewUser ? 1 : 0, "is_new_user");
        C20684815ws.LJIILLIIL("imagine_studio_enter_text_prompt_panel", c2344009Gk.LIZ);
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final ViewOnAttachStateChangeListenerC20604515jv OR(Context context) {
        ?? r2;
        List<String> listLIZ;
        ArrayList arrayList;
        C0HGL c0hglLIZJ;
        try {
            if (C0H6Q.LIZ()) {
                r2 = 0;
                ElementsRepository elementsRepository = (ElementsRepository) PluggableExtentionKt.pluggableSpi$default(ElementsRepository.class, false, false, false, 14, null);
                if (elementsRepository != null && (c0hglLIZJ = elementsRepository.LIZJ(this.LLJJJ)) != null) {
                    List<InterfaceC440090HNn> listLIZ2 = c0hglLIZJ.LIZ(new C0H6S((Integer) 2, 2));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : (ArrayList) listLIZ2) {
                        if (obj instanceof C0HGK) {
                            arrayList2.add(obj);
                        }
                    }
                    List listLIZLLL = C1697820uHc.LIZLLL(arrayList2);
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                    Iterator it2 = listLIZLLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C1272904yV(((C0HGK) it2.next()).LIZ));
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
                        Class<? extends PowerCell<?>>[] clsArr = new Class[1];
                        clsArr[r2] = TextSuggestionCell.class;
                        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(clsArr);
                        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, r2, r2));
                        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv.getAdapter()).LLLLII(new C0HNH() { // from class: X.0HNG
                            @Override // X.C0HNH
                            public final void DC1(C1272904yV c1272904yV) {
                                EditText editText;
                                int length;
                                CharSequence message;
                                this.LL.PR(C0HNF.CLICK_TEXT_PROMPT);
                                TextInputSheetFragment textInputSheetFragment = this.LL;
                                textInputSheetFragment.LLJJJJ = true;
                                C1237360iIw c1237360iIw = textInputSheetFragment.LLILZLL;
                                if (c1237360iIw != null) {
                                    c1237360iIw.setMessage(c1272904yV.LL);
                                }
                                C1237360iIw c1237360iIw2 = this.LL.LLILZLL;
                                if (c1237360iIw2 != null && (editText = (EditText) c1237360iIw2.findViewById(R.id.xl8)) != null) {
                                    C1237360iIw c1237360iIw3 = this.LL.LLILZLL;
                                    if (c1237360iIw3 != null && (message = c1237360iIw3.getMessage()) != null) {
                                        length = message.length();
                                    } else {
                                        length = 0;
                                    }
                                    editText.setSelection(length);
                                }
                                this.LL.LLJJJJ = false;
                            }
                        }, C0HNG.class);
                        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL(arrayList, null);
                        return viewOnAttachStateChangeListenerC20604515jv;
                    }
                }
            } else {
                r2 = 0;
                TextSuggestionRepository textSuggestionRepository = (TextSuggestionRepository) PluggableExtentionKt.pluggableSpi$default(TextSuggestionRepository.class, false, false, false, 14, null);
                if (textSuggestionRepository != null && (listLIZ = textSuggestionRepository.LIZ()) != null) {
                    List listLIZLLL2 = C1697820uHc.LIZLLL(listLIZ);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = listLIZLLL2.iterator();
                    while (it3.hasNext()) {
                        String strLIZLLL = C428740GrY.LIZLLL(context, (String) it3.next());
                        if (strLIZLLL != null) {
                            arrayList3.add(strLIZLLL);
                        }
                    }
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new C1272904yV((String) it4.next()));
                    }
                    if (arrayList != null) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
                        Class<? extends PowerCell<?>>[] clsArr2 = new Class[1];
                        clsArr2[r2] = TextSuggestionCell.class;
                        viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(clsArr2);
                        viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(context, r2, r2));
                        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv2.getAdapter()).LLLLII(new C0HNH() { // from class: X.0HNG
                            @Override // X.C0HNH
                            public final void DC1(C1272904yV c1272904yV) {
                                EditText editText;
                                int length;
                                CharSequence message;
                                this.LL.PR(C0HNF.CLICK_TEXT_PROMPT);
                                TextInputSheetFragment textInputSheetFragment = this.LL;
                                textInputSheetFragment.LLJJJJ = true;
                                C1237360iIw c1237360iIw = textInputSheetFragment.LLILZLL;
                                if (c1237360iIw != null) {
                                    c1237360iIw.setMessage(c1272904yV.LL);
                                }
                                C1237360iIw c1237360iIw2 = this.LL.LLILZLL;
                                if (c1237360iIw2 != null && (editText = (EditText) c1237360iIw2.findViewById(R.id.xl8)) != null) {
                                    C1237360iIw c1237360iIw3 = this.LL.LLILZLL;
                                    if (c1237360iIw3 != null && (message = c1237360iIw3.getMessage()) != null) {
                                        length = message.length();
                                    } else {
                                        length = 0;
                                    }
                                    editText.setSelection(length);
                                }
                                this.LL.LLJJJJ = false;
                            }
                        }, C0HNG.class);
                        viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL(arrayList, null);
                        return viewOnAttachStateChangeListenerC20604515jv2;
                    }
                }
            }
        } catch (C0HNL e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public final void PR(C0HNF c0hnf) {
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmMR = MR();
        boolean zIsNewUser = isNewUser();
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTmMR);
        c2344009Gk.LIZJ(zIsNewUser ? 1 : 0, "is_new_user");
        c2344009Gk.LJIIIIZZ("action_type", c0hnf.getParam());
        C20684815ws.LJIILLIIL("imagine_studio_click_text_prompt_panel", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.0HNX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C440270HOf) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 81), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.19GS] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0iIw, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v30, types: [X.19ce, android.view.View] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Serializable serializable;
        C0H7H c0h7h;
        String string;
        int i;
        AttributeSet attributeSet;
        int iIntValue;
        int iIntValue2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOR;
        String string2;
        ?? r1;
        ?? r2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("TextInputSheetFragment_input_textType");
        } else {
            serializable = null;
        }
        if (serializable instanceof C0H7H) {
            c0h7h = (C0H7H) serializable;
        } else {
            c0h7h = null;
        }
        this.LLJJJIL = c0h7h;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString("TextInputSheetFragment_input_placeholder");
        } else {
            string = null;
        }
        this.LLJJJJJIL = string;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("TextInputSheetFragment_input_idType");
        } else {
            i = 0;
        }
        this.LLJJJ = i;
        Context context = getContext();
        if (context == null) {
            attributeSet = null;
            r1 = 0;
        } else {
            this.LLJJIJIL = new C439980HNc(context, this, LifecycleOwnerKt.getLifecycleScope(this), MR(), new AwS550S0100000_6(this, 626));
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            C786410Ut5.LJZ(8, frameLayout);
            this.LLIZLLLIL = frameLayout;
            ?? linearLayout = new LinearLayout(context);
            float fLIZIZ = C418440Gaw.LIZIZ(14);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            if (numLIZJ != null) {
                C440190HNx c440190HNx = new C440190HNx(numLIZJ.intValue());
                c440190HNx.LJ(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
                linearLayout.setBackground(c440190HNx);
            }
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            frameLayout.addView(linearLayout, C435650H6l.LIZ(-1, -2, 0, 0, ((Number) this.LLJIJIL.getValue()).intValue(), 220));
            if (!C440480HPa.LIZJ()) {
                SmartImageView smartImageView = new SmartImageView(context);
                smartImageView.setScaleType(ImageView.ScaleType.FIT_END);
                frameLayout.addView(smartImageView, C435650H6l.LIZ(NR(), NR(), 0, ((Number) this.LLJJI.getValue()).intValue(), 0, 236));
                this.LLILZIL = smartImageView;
            }
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setIconHeight(((Number) this.LLJILJIL.getValue()).intValue());
            tuxIconView.setIconWidth(((Number) this.LLJILJIL.getValue()).intValue());
            tuxIconView.setIconRes(R.raw.icon_x_mark_small);
            tuxIconView.setTintColorRes(R.attr.a1h);
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 70));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
            layoutParams.setMarginEnd(((Number) this.LLJILLL.getValue()).intValue());
            layoutParams.topMargin = ((Number) this.LLJILJILJ.getValue()).intValue() + ((Number) this.LLJIJIL.getValue()).intValue();
            frameLayout.addView(tuxIconView, layoutParams);
            final C013C c013c = new C013C();
            ?? c21578619ce = new C21578619ce(context);
            int iGenerateViewId = View.generateViewId();
            int iGenerateViewId2 = View.generateViewId();
            int iGenerateViewId3 = View.generateViewId();
            if (C440480HPa.LIZJ()) {
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setClipChildren(false);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                layoutParams2.gravity = 1;
                linearLayout.addView(constraintLayout, layoutParams2);
                C420500GeG c420500GeG = new C420500GeG(context);
                c420500GeG.setId(iGenerateViewId);
                c420500GeG.LLIZ = true;
                c420500GeG.invalidate();
                C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                c19me.startToStart = 0;
                c19me.endToStart = iGenerateViewId2;
                c19me.horizontalChainStyle = 2;
                constraintLayout.addView(c420500GeG, c19me);
                this.LLJ = c420500GeG;
                TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
                tuxIconView2.setId(iGenerateViewId2);
                tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                tuxIconView2.setIconRes(R.raw.icon_plus_fill);
                tuxIconView2.setTintColorRes(R.attr.a1k);
                C19ME c19me2 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c19me2.setMarginStart(iLIZIZ);
                c19me2.setMarginEnd(iLIZIZ);
                c19me2.startToEnd = iGenerateViewId;
                c19me2.topToTop = iGenerateViewId;
                c19me2.bottomToBottom = iGenerateViewId;
                c19me2.endToStart = iGenerateViewId3;
                c19me2.horizontalChainStyle = 2;
                constraintLayout.addView(tuxIconView2, c19me2);
                C420500GeG c420500GeG2 = new C420500GeG(context);
                c420500GeG2.setId(iGenerateViewId3);
                c420500GeG2.LLIZ = true;
                c420500GeG2.invalidate();
                C19ME c19me3 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                c19me3.startToEnd = iGenerateViewId2;
                c19me3.endToEnd = 0;
                c19me3.horizontalChainStyle = 2;
                constraintLayout.addView(c420500GeG2, c19me3);
                this.LLJI = c420500GeG2;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOR2 = OR(context);
                if (viewOnAttachStateChangeListenerC20604515jvOR2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                    marginLayoutParams.setMarginStart(iLIZIZ2);
                    marginLayoutParams.setMarginEnd(iLIZIZ2);
                    linearLayout.addView(viewOnAttachStateChangeListenerC20604515jvOR2, marginLayoutParams);
                }
            }
            ?? c1237360iIw = new C1237360iIw(context, null, 6);
            String string3 = this.LLJJJJJIL;
            if (string3 == null) {
                string3 = context.getString(2131835841);
            }
            c1237360iIw.setPlaceholder(string3);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1f, context);
            if (numLIZJ2 != null) {
                int iIntValue3 = numLIZJ2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iIntValue3);
                gradientDrawable.setCornerRadius(((Number) this.LLJJIJIIJIL.getValue()).floatValue());
                c1237360iIw.setCustomContainer(gradientDrawable);
            }
            int iIntValue4 = ((Number) this.LLJJIJI.getValue()).intValue();
            c1237360iIw.LLILZLL = false;
            c1237360iIw.LLJILLL = iIntValue4;
            c1237360iIw.LLJJ = Integer.MAX_VALUE;
            c1237360iIw.LIZIZ();
            c1237360iIw.setTuxFieldContentCallback(new InterfaceC1237370iIx() { // from class: X.0HMi
                @Override // X.InterfaceC1237370iIx
                public final void LJJII(int i2, CharSequence charSequence) {
                    if (!c013c.element && charSequence != null && charSequence.length() > 0) {
                        C440370HOp c440370HOp = C440370HOp.LIZ;
                        EnumC441640HTm enumC441640HTmMR = this.MR();
                        boolean zIsNewUser = this.isNewUser();
                        C0HGY c0hgy = C0HGY.TEXT;
                        C0H7H c0h7h2 = C0H7H.TEXT_PROMPT;
                        EnumC436720HAo enumC436720HAo = EnumC436720HAo.TEXT_EDITOR;
                        c440370HOp.getClass();
                        C440370HOp.LIZ(enumC441640HTmMR, zIsNewUser, c0hgy, c0h7h2, enumC436720HAo, null, null);
                        c013c.element = true;
                    }
                }
            });
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string2 = arguments4.getString("TextInputSheetFragment_input_textElement", "")) != null) {
                c1237360iIw.setMessage(string2);
                EditText editText = (EditText) c1237360iIw.findViewById(R.id.xl8);
                if (editText != null) {
                    editText.setSelection(string2.length());
                }
            }
            c1237360iIw.setTextChangedCallback(new AwS585S0100000_6(this, 179));
            if (C440480HPa.LIZJ()) {
                ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
                constraintLayout2.setBackground(C428740GrY.LIZ(Float.MAX_VALUE, context));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                layoutParams3.gravity = 8388613;
                C786410Ut5.m6(constraintLayout2, layoutParams3);
                C786410Ut5.Y7(constraintLayout2, new ACListenerS141S0100000_6(this, 68));
                int iGenerateViewId4 = View.generateViewId();
                int iGenerateViewId5 = View.generateViewId();
                TuxIconView tuxIconView3 = new TuxIconView(context, null, 0, 6, null);
                tuxIconView3.setId(iGenerateViewId4);
                tuxIconView3.setIconRes(R.raw.icon_twinkle_star_fill);
                tuxIconView3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                tuxIconView3.setTintColorRes(R.attr.z_);
                C19ME c19me4 = new C19ME(-2, -2);
                c19me4.startToStart = 0;
                c19me4.topToTop = 0;
                c19me4.endToStart = iGenerateViewId5;
                c19me4.bottomToBottom = 0;
                c19me4.horizontalChainStyle = 2;
                c19me4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
                constraintLayout2.addView(tuxIconView3, c19me4);
                attributeSet = null;
                TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, 0);
                tuxTextView.setId(iGenerateViewId5);
                tuxTextView.setText(2131831632);
                tuxTextView.setTuxFont(33);
                tuxTextView.setTextColorRes(R.attr.z_);
                C19ME c19me5 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                c19me5.startToEnd = iGenerateViewId4;
                c19me5.topToTop = 0;
                c19me5.endToEnd = 0;
                c19me5.bottomToBottom = 0;
                c19me5.horizontalChainStyle = 2;
                c19me5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
                constraintLayout2.addView(tuxTextView, c19me5);
                c1237360iIw.setTrailingView(constraintLayout2);
            } else {
                attributeSet = null;
            }
            c21578619ce.addView(c1237360iIw, new ViewGroup.LayoutParams(-1, -2));
            if (C440480HPa.LIZJ()) {
                iIntValue = -2;
            } else {
                iIntValue = ((Number) this.LLJJIJI.getValue()).intValue();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, iIntValue);
            marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            marginLayoutParams2.setMarginStart(iLIZIZ3);
            marginLayoutParams2.setMarginEnd(iLIZIZ3);
            if (C440480HPa.LIZJ()) {
                iIntValue2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            } else {
                iIntValue2 = ((Number) this.LLJJIII.getValue()).intValue();
            }
            marginLayoutParams2.topMargin = iIntValue2;
            linearLayout.addView(c21578619ce, marginLayoutParams2);
            this.LLILZLL = c1237360iIw;
            if (!C440480HPa.LIZJ() && (viewOnAttachStateChangeListenerC20604515jvOR = OR(context)) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                marginLayoutParams3.setMarginStart(iLIZIZ4);
                marginLayoutParams3.setMarginEnd(iLIZIZ4);
                linearLayout.addView(viewOnAttachStateChangeListenerC20604515jvOR, marginLayoutParams3);
            }
            r1 = frameLayout;
            if (!C440480HPa.LIZJ()) {
                ConstraintLayout constraintLayoutLIZIZ = C428740GrY.LIZIZ(context);
                C786410Ut5.I7(new ACListenerS141S0100000_6(this, 69), constraintLayoutLIZIZ);
                ViewGroup.MarginLayoutParams marginLayoutParamsLIZJ = C428740GrY.LIZJ();
                marginLayoutParamsLIZJ.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                marginLayoutParamsLIZJ.setMarginStart(iLIZIZ5);
                marginLayoutParamsLIZJ.setMarginEnd(iLIZIZ5);
                linearLayout.addView(constraintLayoutLIZIZ, marginLayoutParamsLIZJ);
                r1 = frameLayout;
            }
        }
        boolean z = r1 instanceof View;
        ?? r12 = r1;
        if (!z) {
            r12 = attributeSet;
        }
        if (r12 != 0) {
            try {
                ViewTreeLifecycleOwner.set(r12, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(r12, this);
                r12.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    r2 = (C19GS) activity;
                } else {
                    r2 = attributeSet;
                }
                C1685300txQ.LIZ(r2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return r12;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return r12;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
