package com.bytedance.android.livesdk.game.chatroom.drawer.category.assem;

import X.C01D1;
import X.C036E;
import X.C0IZX;
import X.C0IZY;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C176600m4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C477950Ioj;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC477960Iok;
import X.InterfaceC2217461Bqa;
import X.InterfaceC471600IeU;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryViewModel;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IGameDrawerStateAbilityV1;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IGameDrawerStateAbilityV2;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryLoadAssem extends UIContentAssem implements InterfaceC471600IeU, IGameDrawerStateAbilityV1, IGameDrawerStateAbilityV2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public FrameLayout LLIZLLLIL;
    public C0IZX LLJ;
    public C0IZY LLJI;
    public final Map<EnumC477960Iok, View.OnClickListener> LLJIJIL = new LinkedHashMap();
    public final Set<EnumC477960Iok> LLJILJIL = new LinkedHashSet();
    public final AssemVMLazy LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final ACListenerS142S0100000_7 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameDrawerCategoryLoadAssem.class, "categoryViewModel", "getCategoryViewModel()Lcom/bytedance/android/livesdk/game/chatroom/drawer/category/GameDrawerCategoryViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GameDrawerCategoryLoadAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameDrawerCategoryViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 47), AFwS237S0000000_7.get$arr$(28), null, true);
        this.LLJJI = new ACListenerS142S0100000_7(this, 69);
    }

    @Override // X.InterfaceC471600IeU
    public final void refresh() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        ((GameDrawerCategoryViewModel) assemVMLazy.getValue()).vQ2(2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IGameDrawerStateAbilityV2.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (view instanceof FrameLayout) {
            this.LLIZLLLIL = (FrameLayout) view;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IGameDrawerStateAbilityV2.class, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [X.0IZY] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0IZX] */
    @Override // X.InterfaceC471600IeU
    public final void F1(int i, EnumC477960Iok enumC477960Iok) {
        FrameLayout frameLayout;
        boolean zLIZIZ;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        int i2 = C477950Ioj.LIZ[enumC477960Iok.ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 == 2) {
                this.LLJILLL = i;
            }
        } else {
            this.LLJJ = i;
        }
        Boolean boolValueOf = null;
        if ((this.LLJJ & this.LLJILLL) == 3) {
            this.LLJILJIL.clear();
            IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
            if (iDrawerCategoryFragmentAbility != null) {
                iDrawerCategoryFragmentAbility.xB1(false);
            }
            FrameLayout frameLayout4 = this.LLIZLLLIL;
            if (frameLayout4 != null) {
                C786410Ut5.LJJJJIZL(frameLayout4);
            }
            FrameLayout frameLayout5 = this.LLIZLLLIL;
            if (frameLayout5 != null) {
                C786410Ut5.LJZ(8, frameLayout5);
                return;
            }
            return;
        }
        if (i == 2) {
            getContext();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                final Context context = getContext();
                if (context == null) {
                    return;
                }
                IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility2 = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
                if (iDrawerCategoryFragmentAbility2 != null) {
                    iDrawerCategoryFragmentAbility2.xB1(false);
                }
                FrameLayout frameLayout6 = this.LLIZLLLIL;
                if ((frameLayout6 == null || frameLayout6.getVisibility() != 0) && (frameLayout3 = this.LLIZLLLIL) != null) {
                    C786410Ut5.LJZ(0, frameLayout3);
                }
                if (this.LLJI == null) {
                    ?? r1 = new FrameLayout(context) { // from class: X.0IZY
                        public final View LL;

                        {
                            int i3;
                            super(context);
                            LiveDrawerTabLandingCustomSetting liveDrawerTabLandingCustomSetting = LiveDrawerTabLandingCustomSetting.INSTANCE;
                            if (liveDrawerTabLandingCustomSetting.getValue()) {
                                i3 = R.layout.g3n;
                            } else {
                                i3 = R.layout.g3m;
                            }
                            LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
                            if (layoutInflaterNe != null) {
                                C786410Ut5.Td(layoutInflaterNe, i3, this, true);
                            }
                            View viewFindViewById = findViewById(R.id.hbb);
                            if (viewFindViewById instanceof LiveIconView) {
                                if (liveDrawerTabLandingCustomSetting.getValue()) {
                                    C470390IcX.LIZ((LiveIconView) viewFindViewById, R.attr.eoh);
                                } else {
                                    ((LiveIconView) viewFindViewById).setIconAttr(R.attr.dye);
                                }
                            }
                            View viewFindViewById2 = findViewById(R.id.hc4);
                            if (viewFindViewById2 instanceof C16F5) {
                                ((TextView) viewFindViewById2).setText(2131843669);
                            }
                            View viewFindViewById3 = findViewById(R.id.hb1);
                            if (viewFindViewById3 instanceof C16F5) {
                                ((TextView) viewFindViewById3).setText(2131843670);
                            }
                            View viewFindViewById4 = findViewById(R.id.hbk);
                            this.LL = viewFindViewById4;
                            if (liveDrawerTabLandingCustomSetting.getValue()) {
                                C470390IcX.LIZIZ(viewFindViewById4);
                            }
                        }

                        public final void setRetryOnClickListener(View.OnClickListener onClickListener) {
                            View view;
                            if (onClickListener != null && (view = this.LL) != null) {
                                C786410Ut5.I7(onClickListener, view);
                            }
                        }
                    };
                    r1.setRetryOnClickListener(this.LLJJI);
                    this.LLJI = r1;
                }
                this.LLJILJIL.add(enumC477960Iok);
                C0IZY c0izy = this.LLJI;
                if (c0izy != null) {
                    FrameLayout frameLayout7 = this.LLIZLLLIL;
                    if (frameLayout7 != null) {
                        if (frameLayout7.indexOfChild(c0izy) == -1) {
                            z = false;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    if (C176600m4.LIZIZ(boolValueOf)) {
                        return;
                    }
                }
                FrameLayout frameLayout8 = this.LLIZLLLIL;
                if (frameLayout8 != null) {
                    C786410Ut5.LJJJJIZL(frameLayout8);
                }
                FrameLayout frameLayout9 = this.LLIZLLLIL;
                if (frameLayout9 == null) {
                    return;
                }
                frameLayout9.addView(this.LLJI);
                return;
            }
            final Context context2 = getContext();
            if (context2 == null) {
                return;
            }
            IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility3 = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
            if (iDrawerCategoryFragmentAbility3 != null) {
                iDrawerCategoryFragmentAbility3.xB1(false);
            }
            FrameLayout frameLayout10 = this.LLIZLLLIL;
            if ((frameLayout10 == null || frameLayout10.getVisibility() != 0) && (frameLayout2 = this.LLIZLLLIL) != null) {
                C786410Ut5.LJZ(0, frameLayout2);
            }
            if (this.LLJ == null) {
                ?? r12 = new FrameLayout(context2) { // from class: X.0IZX
                    public final View LL;

                    {
                        int i3;
                        super(context2);
                        LiveDrawerTabLandingCustomSetting liveDrawerTabLandingCustomSetting = LiveDrawerTabLandingCustomSetting.INSTANCE;
                        if (liveDrawerTabLandingCustomSetting.getValue()) {
                            i3 = R.layout.g3n;
                        } else {
                            i3 = R.layout.g3m;
                        }
                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context2);
                        if (layoutInflaterNe != null) {
                            C786410Ut5.Td(layoutInflaterNe, i3, this, true);
                        }
                        View viewFindViewById = findViewById(R.id.hbb);
                        if (viewFindViewById instanceof LiveIconView) {
                            if (liveDrawerTabLandingCustomSetting.getValue()) {
                                C470390IcX.LIZ((LiveIconView) viewFindViewById, R.attr.eog);
                            } else {
                                ((LiveIconView) viewFindViewById).setIconAttr(R.attr.dy5);
                            }
                        }
                        View viewFindViewById2 = findViewById(R.id.hc4);
                        if (viewFindViewById2 instanceof C16F5) {
                            ((TextView) viewFindViewById2).setText(2131842856);
                        }
                        View viewFindViewById3 = findViewById(R.id.hb1);
                        if (viewFindViewById3 instanceof C16F5) {
                            ((TextView) viewFindViewById3).setText(2131842857);
                        }
                        View viewFindViewById4 = findViewById(R.id.hbk);
                        this.LL = viewFindViewById4;
                        if (liveDrawerTabLandingCustomSetting.getValue()) {
                            C470390IcX.LIZIZ(viewFindViewById4);
                        }
                    }

                    public final void setRetryOnClickListener(View.OnClickListener onClickListener) {
                        View view;
                        if (onClickListener != null && (view = this.LL) != null) {
                            C786410Ut5.I7(onClickListener, view);
                        }
                    }
                };
                r12.setRetryOnClickListener(this.LLJJI);
                this.LLJ = r12;
            }
            this.LLJILJIL.add(enumC477960Iok);
            C0IZX c0izx = this.LLJ;
            if (c0izx != null) {
                FrameLayout frameLayout11 = this.LLIZLLLIL;
                if (frameLayout11 != null) {
                    if (frameLayout11.indexOfChild(c0izx) == -1) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    return;
                }
            }
            FrameLayout frameLayout12 = this.LLIZLLLIL;
            if (frameLayout12 != null) {
                C786410Ut5.LJJJJIZL(frameLayout12);
            }
            FrameLayout frameLayout13 = this.LLIZLLLIL;
            if (frameLayout13 == null) {
                return;
            }
            frameLayout13.addView(this.LLJ);
            return;
        }
        if (i != 1) {
            return;
        }
        this.LLJILJIL.remove(enumC477960Iok);
        if (getContext() == null) {
            return;
        }
        IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility4 = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
        if (iDrawerCategoryFragmentAbility4 != null) {
            iDrawerCategoryFragmentAbility4.xB1(true);
        }
        FrameLayout frameLayout14 = this.LLIZLLLIL;
        if ((frameLayout14 == null || frameLayout14.getVisibility() != 0) && (frameLayout = this.LLIZLLLIL) != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        FrameLayout frameLayout15 = this.LLIZLLLIL;
        if (frameLayout15 == null) {
            return;
        }
        C786410Ut5.LJJJJIZL(frameLayout15);
    }

    @Override // X.InterfaceC471600IeU
    public final void X7(View.OnClickListener onClickListener, EnumC477960Iok enumC477960Iok) {
        this.LLJIJIL.put(enumC477960Iok, onClickListener);
    }
}
