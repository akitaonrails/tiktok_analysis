package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0C64;
import X.C0DHG;
import X.C0DTR;
import X.C0HTI;
import X.C0OL8;
import X.C0OLV;
import X.C0OOH;
import X.C0OOV;
import X.C0OPO;
import X.C0OPQ;
import X.C0ORG;
import X.C0OSB;
import X.C1220000hqw;
import X.C12ES;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C14EU;
import X.C14KQ;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1616706Ur;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C1720106oR;
import X.C1723500ux2;
import X.C19719212De;
import X.C19719912Dl;
import X.C1CRB;
import X.C20600815jK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C617790OKz;
import X.C619210OQl;
import X.C619220OQm;
import X.C632670Orh;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C770750ULh;
import X.C786410Ut5;
import X.C844470XAv;
import X.C985403tE;
import X.InterfaceC1554640qYg;
import X.InterfaceC21676019sM;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS144S0100000_9;
import Y.ALAdapterS6S0100000_9;
import Y.ARunnableS109S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinHybridMessageCardCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.UnreadIndicatorAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPageInteractionAssem extends UIContentAssem implements BulletinInteractionAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public C1CRB LLIZLLLIL;
    public View LLJ;
    public FrameLayout LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C736950SvV LLJJ;
    public final AssemVMLazy LLJJI;
    public BulletinEmojiAbility LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public View LLJJIJIL;
    public float LLJJJ;
    public final C619220OQm LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPageInteractionAssem.class, "publishVm", "getPublishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BulletinPageInteractionAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0)};
        C844470XAv.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = C14KQ.LIZLLL(C844470XAv.LIZ());
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1879009876) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0OQm] */
    public BulletinPageInteractionAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 293);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(184);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 296);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILJILJ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinPublishViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 294), AFwS240S0000000_9.get$arr$(182), null, true);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 290);
        this.LLJJ = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(185), new AwS553S0100000_9((AbstractC738140SxQ) this, 297), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 295), AFwS240S0000000_9.get$arr$(183), null, true);
        this.LLJJJIL = new InterfaceC21676019sM() { // from class: X.0OQm
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                return true;
            }
        };
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 291));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 292));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 289));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final void BM1() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator listener2;
        ObjectAnimator objectAnimatorOfFloat;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha3;
        ViewPropertyAnimator duration3;
        BulletinEmojiAbility bulletinEmojiAbility;
        if (this.LLJJIJI && (bulletinEmojiAbility = this.LLJJIII) != null) {
            bulletinEmojiAbility.Ez0();
        }
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        C1CRB c1crbJo = Jo();
        if (c1crbJo == null || c1crbJo.getVisibility() != 0) {
            return;
        }
        this.LLJJIII = null;
        C1CRB c1crbJo2 = Jo();
        if (c1crbJo2 != null) {
            View viewLo = Lo();
            ViewPropertyAnimator listener3 = (viewLo == null || (viewPropertyAnimatorAnimate3 = viewLo.animate()) == null || (viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(0.0f)) == null || (duration3 = viewPropertyAnimatorAlpha3.setDuration(250L)) == null) ? null : duration3.setListener(new ALAdapterS6S0100000_9(c1crbJo2, 5));
            View view = this.LLJJIJIL;
            if (view != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.addListener(new ALAdapterS6S0100000_9(this, 4));
            } else {
                objectAnimatorOfFloat = null;
            }
            if (listener3 != null) {
                listener3.start();
            }
            if (objectAnimatorOfFloat != null) {
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
        }
        if (So().getVisibility() == 0) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(So(), "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(250L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(So(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.1f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.1f));
            objectAnimatorOfPropertyValuesHolder.setDuration(250L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfPropertyValuesHolder);
            animatorSet.addListener(new ALAdapterS6S0100000_9(this, 6));
            animatorSet.start();
        }
        if (Go().getVisibility() == 0) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(Go(), "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(250L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(Go(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.1f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.1f));
            objectAnimatorOfPropertyValuesHolder2.setDuration(250L);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LIZLLL());
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfPropertyValuesHolder2);
            animatorSet2.addListener(new ALAdapterS6S0100000_9(this, 7));
            animatorSet2.start();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7074217708_emoji_panel_alignment", true, true)) {
            FrameLayout frameLayoutNo = No();
            if (frameLayoutNo != null && (viewPropertyAnimatorAnimate2 = frameLayoutNo.animate()) != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate2.translationY(this.LLJJJ)) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorTranslationY.alpha(0.0f)) != null && (interpolator2 = viewPropertyAnimatorAlpha2.setInterpolator(C1619980sG4.LJIILIIL())) != null && (duration2 = interpolator2.setDuration(300L)) != null && (listener2 = duration2.setListener(new ALAdapterS6S0100000_9(this, 8))) != null) {
                listener2.start();
            }
        } else {
            FrameLayout frameLayoutNo2 = No();
            if (frameLayoutNo2 != null && (viewPropertyAnimatorAnimate = frameLayoutNo2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (interpolator = viewPropertyAnimatorAlpha.setInterpolator(C1619980sG4.LJI())) != null && (duration = interpolator.setDuration(250L)) != null && (listener = duration.setListener(new ALAdapterS6S0100000_9(this, 9))) != null) {
                listener.start();
            }
        }
        Oo().animate().alpha(0.0f).setInterpolator(C1619980sG4.LJI()).setDuration(250L).setListener(new ALAdapterS6S0100000_9(this, 10)).start();
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d28) : null;
            this.LLJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.LLJJJIL);
        }
        UnreadIndicatorAbility unreadIndicatorAbility = (UnreadIndicatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UnreadIndicatorAbility.class, null);
        if (unreadIndicatorAbility != null) {
            unreadIndicatorAbility.TZ();
        }
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJLIIL.getValue();
    }

    public final C0OLV Ho() {
        return (C0OLV) this.LLJILJIL.getValue();
    }

    public final C1CRB Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d1g) : null;
            this.LLIZLLLIL = (C1CRB) viewFindViewById;
        }
        return (C1CRB) viewFindViewById;
    }

    public final View Lo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d1j) : null;
            this.LLJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final FrameLayout No() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d1s) : null;
            this.LLJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Oo() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv So() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
    }

    public final BulletinProfileViewModel Vo() {
        return (BulletinProfileViewModel) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        BM1();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final boolean AK2() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final boolean v20() {
        return this.LLJJIJIIJIL;
    }

    public final boolean Zo(C0OOV c0oov) {
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        String str;
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        if (bulletinCardInfo != null && (bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo) != null && (str = bulletinHybridCardConfigStruct.schema) != null) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
            C0OOH c0ooh = ((BulletinListViewModel) assemVMLazy.getValue()).LLJILJILJ;
            if (c0ooh != null) {
                int iLIZ = c0ooh.LIZ(str);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("listVm ");
                sbLIZ.append(iLIZ);
                C1720106oR.LJI("wwwzccc", C2188811AlT.LIZIZ(sbLIZ));
                if (iLIZ != -1) {
                    Oo().LJIJ(new C1723500ux2(iLIZ, BulletinHybridMessageCardCell.class));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0OL7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(12), 4);
        if (C1616706Ur.LIZ()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (view2 = fragmentLJI.getView()) != null) {
                view2.setFitsSystemWindows(true);
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.d27);
        if (viewGroup == null) {
            return;
        }
        C0OSB.LIZ(viewGroup, 0, 0, 0, null, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void tryShowPopup(C0ORG c0org) {
        Object objLIZIZ;
        if (!Vo().OQ2(c0org.LIZ)) {
            c0org.LJII.invoke();
            return;
        }
        if (!C1578630rBN.LJIIJ(this)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                objLIZIZ = C632670Orh.LIZIZ(context, new C19719212De(1089192657, new AwS658S0100000_9(c0org, 5), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZIZ(c0org.LIZIZ);
                c1397580mTM.LIZIZ(c0org.LIZJ);
                C985403tE.LIZ(c1397580mTM, new AwS588S0100000_9(c0org, 113));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                objLIZIZ = Unit.LIZ;
            }
            if (objLIZIZ != null) {
                return;
            }
        }
        c0org.LJII.invoke();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void tryUnsubscribeIntroSheet(C619210OQl c619210OQl) {
        Long l = Vo().LLILLJJLI;
        if (l != null) {
            long jLongValue = l.longValue();
            if (C1578630rBN.LJIIJ(this) && jLongValue == c619210OQl.LIZ && !Vo().To() && Vo().q11() && Vo().Nl()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : c619210OQl.LIZJ.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                rE1(String.valueOf(c619210OQl.LIZIZ), String.valueOf(c619210OQl.LIZJ.get("enter_method")), linkedHashMap);
            }
        }
    }

    public static final boolean ap(BulletinPageInteractionAssem bulletinPageInteractionAssem, BulletinBaseItem bulletinBaseItem) {
        if (C0OPO.LIZ() && bulletinPageInteractionAssem.Vo().q11() && bulletinBaseItem.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final void pc0(String str, String str2) {
        BulletinEmojiAbility bulletinEmojiAbility = this.LLJJIII;
        if (bulletinEmojiAbility != null) {
            bulletinEmojiAbility.if2(str, str2, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final void Vh1(final View view, final BulletinBaseItem bulletinBaseItem, BulletinEmojiAbility bulletinEmojiAbility) {
        float f;
        int iLIZJ;
        View view2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        this.LLJJIII = bulletinEmojiAbility;
        this.LLJJIJI = true;
        if ((bulletinBaseItem instanceof C0OOV) && !Zo((C0OOV) bulletinBaseItem)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.d0c);
        View viewFindViewById2 = view.findViewById(R.id.d1c);
        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0) {
            viewFindViewById = viewFindViewById2;
        }
        C1CRB c1crbJo = Jo();
        C786410Ut5.o9(c1crbJo, new ACListenerS144S0100000_9(this, 15));
        View viewLo = Lo();
        if (viewLo != null) {
            C786410Ut5.T4(viewLo, 0.0f);
        }
        View viewLo2 = Lo();
        if (viewLo2 != null && (viewPropertyAnimatorAnimate = viewLo2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.95f)) != null && (interpolator = viewPropertyAnimatorAlpha.setInterpolator(C1619980sG4.LJI())) != null && (duration = interpolator.setDuration(250L)) != null && (listener = duration.setListener(new ALAdapterS6S0100000_9(c1crbJo, 2))) != null) {
            listener.start();
        }
        final int[] iArr = new int[2];
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(iArr);
        }
        int[] iArr2 = new int[2];
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (view2 = fragmentLJI.getView()) != null) {
            view2.getLocationOnScreen(iArr2);
        }
        C12ES.LJIILL(0, Oo());
        C20600815jK.LIZJ(Oo().getState(), bulletinBaseItem);
        C0OLV c0olvHo = Ho();
        if (c0olvHo != null && c0olvHo.LLJ) {
            f = iArr[1];
            iLIZJ = iArr2[1];
        } else {
            f = iArr[1] - iArr2[1];
            iLIZJ = C497820Jfg.LIZJ(view.getContext());
        }
        final float f2 = f - iLIZJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = Oo();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jvOo);
        viewOnAttachStateChangeListenerC20604515jvOo.setTranslationY(f2);
        HandlerHook.viewPost(Oo(), new Runnable() { // from class: X.0OQo
            public final void LIZ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("itemLoc y  ");
                sbLIZ.append(iArr[1]);
                C1720106oR.LIZ("wwwzccc", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transY  ");
                sbLIZ2.append(f2);
                C1720106oR.LIZ("wwwzccc", C2188811AlT.LIZIZ(sbLIZ2));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1389340mG4.LIZLLL())));
                C0OR8 c0or8 = new C0OR8(this, (ViewGroup) this.Oo().getChildAt(0), iLIZIZ, view, bulletinBaseItem, f2, iArr);
                View viewFindViewById3 = this.Oo().findViewById(R.id.czv);
                if (viewFindViewById3 != null) {
                    HandlerHook.viewPostDelay(viewFindViewById3, new ARunnableS109S0100000_9(c0or8, 17), 50L);
                } else {
                    c0or8.invoke();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BulletinPageInteractionAssem@7878.showSubscriberMoreEmoji$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BulletinPageInteractionAssem@7878.showSubscriberMoreEmoji$2");
            }
        });
        C0DTR.LIZIZ(So());
        C0DTR.LIZIZ(Go());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    public final void rE1(String str, String str2, Map<String, String> map) {
        Fragment fragmentLJI;
        FragmentManager parentFragmentManager;
        String string;
        Context context = getContext();
        if (context != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (parentFragmentManager = fragmentLJI.getParentFragmentManager()) != null) {
            Long l = Vo().LLILLJJLI;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            C259800zU c259800zU = new C259800zU();
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.tp;
            c770750ULh.LIZ = c0hti.LIZ(context);
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = context.getText(2131828145);
            c770750ULh.LIZJ(context.getText(2131828144));
            c770750ULh.LJI(context.getText(2131828132), new C617790OKz(this, string, str, str2, map, c259800zU));
            c770750ULh.LJII(context.getText(2131828131), new C0OL8(string, str, str2, map));
            c770750ULh.LJIILLIIL = false;
            ?? r1 = c770750ULh.LIZIZ().LIZ;
            c259800zU.element = r1;
            r1.show(parentFragmentManager, "BulletinPageInteractionAssem");
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJ(string, str, str2, "show", null, map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VL1(final android.view.View r50, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r51, boolean r52, boolean r53, final com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r54, com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell r55, boolean r56, com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell r57) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem.VL1(android.view.View, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, boolean, boolean, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel, com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, boolean, com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell):void");
    }
}
