package com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0DSB;
import X.C1153880g8I;
import X.C123100dR;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1561220qjI;
import X.C1637806bA;
import X.C1637906bB;
import X.C1853010yJv;
import X.C1853300yKO;
import X.C1855940yOe;
import X.C197039127h;
import X.C19719912Dl;
import X.C20230914Dz;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C423520Gj8;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC988103tf;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS96S0200000_27;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.picker.TakoGalleryPickerActivity;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateFragmentViewModel;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS489S0200000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomSelectedMediaAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2315));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 842));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2317));
    public TuxTextView LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public C197039127h LLJJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJIL;
    public View LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public final AssemVMLazy LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomSelectedMediaAssem.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BottomSelectedMediaAssem.class, "takoMenuWindowViewModel", "getTakoMenuWindowViewModel()Lcom/ss/android/ugc/aweme/tako/menuwindow/TakoMenuWindowViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BottomSelectedMediaAssem.class, "recordFragmentVM", "getRecordFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoRecordFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BottomSelectedMediaAssem.class, "createFragmentVM", "getCreateFragmentVM()Lcom/ss/android/ugc/aweme/tako/otherpage/image/create/TakoImageCreateFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BottomSelectedMediaAssem.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public BottomSelectedMediaAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 2320), AFwS269S0000000_27.get$arr$(254), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMenuWindowViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 2314), AFwS269S0000000_27.get$arr$(255), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoRecordFragmentViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ3, 2316), AFwS269S0000000_27.get$arr$(256), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoImageCreateFragmentViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ4, 2318), AFwS269S0000000_27.get$arr$(257), null, true);
        this.LLJL = new C1559260qg8(new C723580SZw(this, C1153880g8I.class, null), checkSupervisorPrepared());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(TemplateListViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ5, 2319), AFwS269S0000000_27.get$arr$(258), null, true);
        this.LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C1853010yJv.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fmc;
    }

    public final TakoImageCreateFragmentViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (TakoImageCreateFragmentViewModel) assemVMLazy.getValue();
    }

    public final TakoRecordFragmentViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (TakoRecordFragmentViewModel) assemVMLazy.getValue();
    }

    public final TakoPhotoChooseViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    public final TemplateListViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    public final void sp() {
        int iLIZ;
        String str = (String) this.LLJJIJI.getValue();
        if (str != null && str.length() > 0) {
            TuxTextView tuxTextView = this.LLJJIJIIJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
                return;
            }
            return;
        }
        if (kp().LLILLL >= 0) {
            iLIZ = kp().LLILLL;
        } else {
            C1855940yOe.LIZ.getClass();
            iLIZ = C1855940yOe.LIZ();
            if (iLIZ <= 0) {
                iLIZ = 4;
            }
        }
        TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(LJJIJL().getContext().getResources().getQuantityString(2131755040, iLIZ, Integer.valueOf(iLIZ)));
        }
    }

    public final Map<String, String> getCommonParams() {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        return (iTakoContextAbility == null || (commonParams = iTakoContextAbility.getCommonParams()) == null) ? C2097608Jq.LJ() : commonParams;
    }

    public final boolean mp() {
        int iLJJLIIIIJ;
        InterfaceC988103tf interfaceC988103tfLJJLI;
        if (C724240Sb0.LJI(this) instanceof PreviewPhotoFragment) {
            return true;
        }
        FragmentManager fragmentManagerLIZIZ = C20230914Dz.LIZIZ(C724240Sb0.LJI(this), C724240Sb0.LIZ(this));
        if (fragmentManagerLIZIZ == null || (iLJJLIIIIJ = fragmentManagerLIZIZ.LJJLIIIIJ()) == 0) {
            return false;
        }
        String name = null;
        if (fragmentManagerLIZIZ != null && (interfaceC988103tfLJJLI = fragmentManagerLIZIZ.LJJLI(iLJJLIIIIJ - 1)) != null) {
            name = interfaceC988103tfLJJLI.getName();
        }
        return Intrinsics.LJFF(name, "PreviewPhotoFragment");
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C1153880g8I c1153880g8I = (C1153880g8I) this.LLJL.getValue();
        if (c1153880g8I != null && c1153880g8I.LL) {
            return LJJIJL().getContext();
        }
        super.Eo(context);
        return context;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h;
        TuxTextView tuxTextView;
        LinearLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.ukm);
        this.LLJJIJIL = (C197039127h) view.findViewById(R.id.f6h);
        this.LLJJJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ume);
        C1561220qjI.LIZ.getClass();
        View view2 = null;
        if (C1561220qjI.LIZ() && lp().xQ2()) {
            C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.gr9);
            if (c197039127h2 != null) {
                c197039127h2.LJJJJL(new AwS227S0300000_18(c197039127h2, view, this, 69));
                c197039127h2.setBackgroundRadius(10);
                C0DSB.LIZJ(c197039127h2);
            } else {
                c197039127h2 = null;
            }
            this.LLJJJ = c197039127h2;
            C197039127h c197039127h3 = this.LLJJIJIL;
            if (c197039127h3 != null) {
                c197039127h3.setText(view.getContext().getString(2131822548));
                c197039127h3.setBackgroundRadius(10);
                c197039127h3.setButtonStartIcon(Integer.valueOf(R.raw.icon_twinkle_star_fill));
                ViewGroup.LayoutParams layoutParams2 = c197039127h3.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.weight = 1.0f;
                    layoutParams.width = 0;
                    layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                c197039127h3.requestLayout();
            }
            C0DSB.LIZIZ(this.LLJJIJIIJIL);
        }
        View viewFindViewById = view.findViewById(R.id.cgj);
        if (viewFindViewById != null) {
            C1153880g8I c1153880g8I = (C1153880g8I) this.LLJL.getValue();
            if (c1153880g8I != null && c1153880g8I.LL) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zd);
                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            }
            view2 = viewFindViewById;
        }
        this.LLJJJJ = view2;
        C1153880g8I c1153880g8I2 = (C1153880g8I) this.LLJL.getValue();
        if (c1153880g8I2 != null && c1153880g8I2.LL && (tuxTextView = this.LLJJIJIIJIL) != null) {
            tuxTextView.setTextColor(ColorProtector.parseColor("#99FFFFFF"));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context) { // from class: X.0yKE
                {
                    setOrientation(0);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
                    final Context context2 = recyclerView.getContext();
                    C21674119s3 c21674119s3 = new C21674119s3(context2) { // from class: X.0yKF
                        @Override // X.C21674119s3
                        public final float LJIIJJI(DisplayMetrics displayMetrics) {
                            return 200.0f / displayMetrics.densityDpi;
                        }

                        @Override // X.C21674119s3
                        public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                            return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                        }
                    };
                    c21674119s3.LIZ = i;
                    startSmoothScroll(c21674119s3);
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SelectedCell.class);
            C423520Gj8 c423520Gj8 = new C423520Gj8();
            c423520Gj8.LLILLL = 0L;
            c423520Gj8.LLILZIL = 250L;
            c423520Gj8.LLILZ = 0L;
            c423520Gj8.LLILZLL = 250L;
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(c423520Gj8);
        }
        C736680Sv4.LJIIIZ(this, kp(), new C2217381BqS() { // from class: X.0yKL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0yK8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LL;
            }
        }, null, new AwS489S0200000_27(this, view, 1), 12);
        HandlerHook.viewPost(LJJIJL(), new ARunnableS96S0200000_27(this, view, 11));
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0yK9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853060yK0) obj).LLJJI;
            }
        }, C736820SvI.LIZLLL(), new AwS462S0200000_27(this, view, 6), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yKI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPX) obj).LLILZIL;
            }
        }, null, AFwS302S0000000_18.get$arr$(13), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0yKH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C593380NPc) obj).LLILLJJLI;
            }
        }, null, AFwS302S0000000_18.get$arr$(14), 6);
        TemplateListViewModel templateListViewModelLp = lp();
        String str = (String) this.LLJJI.getValue();
        if (C123100dR.LIZ(str)) {
            templateListViewModelLp.LLILLJJLI = str;
        }
        C197039127h c197039127h4 = this.LLJJIJIL;
        if (c197039127h4 != null) {
            C786410Ut5.I7(new AkS64S0200000_27(this, c197039127h4, 8), c197039127h4);
        }
        if (C1561220qjI.LIZ() && (c197039127h = this.LLJJJ) != null) {
            C786410Ut5.I7(new AkS64S0200000_27(this, c197039127h, 9), c197039127h);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yKG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853320yKQ) obj).LLILZ;
            }
        }, null, AFwS302S0000000_18.get$arr$(15), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yKJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853320yKQ) obj).LLILZLL;
            }
        }, null, AFwS302S0000000_18.get$arr$(16), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0yKK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853320yKQ) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 57), 4);
    }

    public final void op(PreviewMediaState previewMediaState, List<? extends TikTokMediaModel> list, boolean z, View view) {
        boolean z2;
        boolean z3;
        BottomSheetBehavior<View> bottomSheetBehavior;
        boolean z4;
        BottomSheetBehavior<View> bottomSheetBehavior2;
        boolean z5;
        C20600815jK<InterfaceC1891350zJl> state;
        String str;
        TikTokMediaModel media;
        BottomSheetBehavior<View> bottomSheetBehavior3;
        if (list.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        BottomSheetBehavior<View> bottomSheetBehavior4 = ((TakoMenuWindowViewModel) assemVMLazy.getValue()).LLILLJJLI;
        if (bottomSheetBehavior4 != null && bottomSheetBehavior4.getState() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || ((bottomSheetBehavior3 = ((TakoMenuWindowViewModel) this.LLJJJJLIIL.getValue()).LLILLJJLI) != null && bottomSheetBehavior3.getState() == 4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zMp = mp();
        boolean zXQ2 = lp().xQ2();
        BottomSheetBehavior<View> bottomSheetBehavior5 = ip().LLILLJJLI;
        if ((bottomSheetBehavior5 != null && bottomSheetBehavior5.getState() == 3) || ((bottomSheetBehavior = ip().LLILLJJLI) != null && bottomSheetBehavior.getState() == 4)) {
            z4 = true;
        } else {
            z4 = false;
        }
        BottomSheetBehavior<View> bottomSheetBehavior6 = hp().LLILLJJLI;
        if ((bottomSheetBehavior6 != null && bottomSheetBehavior6.getState() == 3) || ((bottomSheetBehavior2 = hp().LLILLJJLI) != null && bottomSheetBehavior2.getState() == 4)) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z6 = C724240Sb0.LIZ(this) instanceof TakoGalleryPickerActivity;
        if (!zXQ2 && !z3 && !zMp && !z4 && !z5 && !z6 && !z) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        TemplateListViewModel templateListViewModelLp = lp();
        ((ArrayList) templateListViewModelLp.LL).clear();
        ((ArrayList) templateListViewModelLp.LL).addAll(list);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LJLLLLLL(0, viewOnAttachStateChangeListenerC20604515jv);
        }
        C197039127h c197039127h = this.LLJJIJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
        }
        sp();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (previewMediaState != null && (media = previewMediaState.getMedia()) != null) {
                str = ((MediaModel) media).id;
            } else {
                str = null;
            }
            arrayList.add(new C1853300yKO(tikTokMediaModel, Intrinsics.LJFF(str, ((MediaModel) tikTokMediaModel).id)));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(arrayList, new ARunnableS96S0200000_27(this, view, 12));
        }
    }
}
