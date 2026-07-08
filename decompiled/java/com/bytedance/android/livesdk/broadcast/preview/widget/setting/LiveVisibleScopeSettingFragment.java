package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C098200Yq;
import X.C0IJT;
import X.C0JYM;
import X.C0TZ2;
import X.C0TZ3;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1685300txQ;
import X.C16F5;
import X.C1819620xS4;
import X.C1841350y17;
import X.C189200o6;
import X.C19322110iZ;
import X.C19EG;
import X.C19GS;
import X.C20484615Do;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C238400w2;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C473420IhQ;
import X.C474500IjA;
import X.C494680Jac;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C500260Jjc;
import X.C755620TkW;
import X.C755630TkX;
import X.C758100ToW;
import X.C758220Toi;
import X.C782110Um9;
import X.C785810Us7;
import X.C785830Us9;
import X.C786410Ut5;
import X.C931350aLN;
import X.EnumC1841290y11;
import X.InterfaceC743640TFa;
import Y.ACListenerS41S0210000_12;
import Y.ARunnableS81S0200000_12;
import Y.AcS105S0101000_12;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS65S0210000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS162S0110000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveVisibleScopeSettingFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZjYpPTs6JiJiBSYlLRMlOiYxJCAfKiAjLRYpPTs6JiIKOy40JSAiPQ==";
    public DataChannel LL;
    public String LLILLJJLI;
    public boolean LLILLL = true;
    public C758100ToW LLILZ;
    public C1841350y17 LLILZIL;
    public C1841350y17 LLILZLL;
    public C1841350y17 LLIZ;
    public C1841350y17 LLIZLLLIL;
    public C16F5 LLJ;
    public FrameLayout LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public C16F5 LLJJ;
    public long LLJJI;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C758100ToW c758100ToW = this.LLILZ;
        if (c758100ToW != null) {
            c758100ToW.invoke();
        }
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        C758220Toi c758220Toi;
        C758220Toi c758220Toi2;
        C16F5 c16f5;
        super.onViewCreated(view, bundle);
        C20484615Do c20484615DoLIZJ = C19322110iZ.LIZJ(view);
        if (c20484615DoLIZJ != null) {
            j = c20484615DoLIZJ.LJIIIZ;
        } else {
            j = 0;
        }
        this.LLJJI = j;
        this.LLILZIL = (C1841350y17) view.findViewById(R.id.visible_scope_everyone_item);
        this.LLILZLL = (C1841350y17) view.findViewById(R.id.visible_scope_followers_item);
        this.LLIZ = (C1841350y17) view.findViewById(R.id.visible_scope_friends_item);
        this.LLIZLLLIL = (C1841350y17) view.findViewById(R.id.visible_scope_specific_item);
        this.LLJ = (C16F5) view.findViewById(R.id.visible_scope_specific_item_desc);
        this.LLJI = (FrameLayout) view.findViewById(R.id.visible_scope_specific_item_selected_container);
        this.LLJIJIL = view.findViewById(R.id.visible_scope_everyone_item_layout);
        this.LLJILJIL = view.findViewById(R.id.visible_scope_followers_item_layout);
        this.LLJILJILJ = view.findViewById(R.id.visible_scope_friends_item_layout);
        this.LLJILLL = view.findViewById(R.id.visible_scope_spec_item_layout);
        this.LLJJ = (C16F5) view.findViewById(R.id.visible_scope_description);
        C1841350y17 c1841350y17 = this.LLILZIL;
        if (c1841350y17 != null) {
            c1841350y17.setSize(EnumC1841290y11.Medium);
        }
        C1841350y17 c1841350y172 = this.LLILZLL;
        if (c1841350y172 != null) {
            c1841350y172.setSize(EnumC1841290y11.Medium);
        }
        C1841350y17 c1841350y173 = this.LLIZ;
        if (c1841350y173 != null) {
            c1841350y173.setSize(EnumC1841290y11.Medium);
        }
        C1841350y17 c1841350y174 = this.LLIZLLLIL;
        if (c1841350y174 != null) {
            c1841350y174.setSize(EnumC1841290y11.Medium);
        }
        String str = this.LLILLJJLI;
        if (str != null && (c16f5 = this.LLJJ) != null) {
            c16f5.setText(str);
        }
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.visible_scope_friends_item_desc);
        int allMUFIMUserSize = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getAllMUFIMUserSize();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131856083));
        sbLIZ.append(" ·");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C497740JfY.LJIIL(2131755980, allMUFIMUserSize, Integer.valueOf(allMUFIMUserSize)));
        spannableStringBuilder.append((CharSequence) " ");
        final int iLIZIZ = (int) C497740JfY.LIZIZ(5.0f);
        C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(iLIZIZ) { // from class: X.0UUP
            public final int LL;

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            }

            {
                this.LL = iLIZIZ;
            }

            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return this.LL;
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = C20736316Cj.LJ(R.attr.d3k, c16f52.getContext());
        c419910GdJ.LJ = Integer.valueOf(R.attr.ezt);
        c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(14.0f);
        c419910GdJ.LIZJ = (int) C497740JfY.LIZIZ(14.0f);
        C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, c16f52.getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new C785810Us7(c16f52, 1), length, spannableStringBuilder.length(), 33);
        c16f52.setText(spannableStringBuilder);
        c16f52.setMovementMethod(C431260Gvc.LIZ);
        final boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        if (zIsPrivateAccount) {
            C500260Jjc.LJIILIIL(this.LLJIJIL);
            C16F5 c16f53 = this.LLJJ;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131841191));
            }
            C500260Jjc.LLFFF(this.LLJILJIL);
            C1841350y17 c1841350y175 = this.LLILZLL;
            if (c1841350y175 != null) {
                c1841350y175.setChecked(true);
            }
            C1841350y17 c1841350y176 = this.LLILZLL;
            if (c1841350y176 != null) {
                c1841350y176.setClickable(false);
            }
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                C786410Ut5.I7(new AbS694S0100000_12(this, 19), view2);
            }
        } else {
            C1841350y17 c1841350y177 = this.LLILZIL;
            if (c1841350y177 != null) {
                c1841350y177.setClickable(false);
            }
            View view3 = this.LLJIJIL;
            if (view3 != null) {
                C786410Ut5.I7(new AbS162S0110000_12(this, zIsPrivateAccount, 2), view3);
            }
        }
        C1841350y17 c1841350y178 = this.LLIZ;
        if (c1841350y178 != null) {
            c1841350y178.setClickable(false);
        }
        View view4 = this.LLJILJILJ;
        if (view4 != null) {
            C786410Ut5.I7(new AbS162S0110000_12(this, zIsPrivateAccount, 3), view4);
        }
        final C238400w2 c238400w2 = new C238400w2();
        C1841350y17 c1841350y179 = this.LLIZLLLIL;
        if (c1841350y179 != null) {
            c1841350y179.setClickable(false);
        }
        View view5 = this.LLJILLL;
        if (view5 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Toh
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view6) {
                    FrameLayout frameLayout;
                    if (view6 != null) {
                        C1841350y17 c1841350y1710 = this.LLILZ.LLIZLLLIL;
                        boolean z = true;
                        if (c1841350y1710 != null && c1841350y1710.isChecked()) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C238400w2 c238400w22 = c238400w2;
                        if (jCurrentTimeMillis - c238400w22.element < 2000) {
                            return;
                        }
                        c238400w22.element = jCurrentTimeMillis;
                        AwS130S0110000_12 awS130S0110000_12 = new AwS130S0110000_12(this.LLILZ, zIsPrivateAccount, 3);
                        FrameLayout frameLayout2 = this.LLILZ.LLJI;
                        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
                            z = false;
                        }
                        if (z && (frameLayout = this.LLILZ.LLJI) != null && frameLayout.getChildCount() > 0) {
                            AwS130S0110000_12 awS130S0110000_122 = new AwS130S0110000_12(this.LLILZ, zIsPrivateAccount, 2);
                            if (this.LLILZ.MR(null, 2, awS130S0110000_122, true)) {
                                return;
                            }
                            awS130S0110000_122.invoke();
                            return;
                        }
                        if (this.LLILZ.MR(null, 2, awS130S0110000_12, false)) {
                            return;
                        }
                        awS130S0110000_12.invoke();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, view5);
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, VisibleScopeSelectedChannel.class, new AwS65S0210000_12(this, c238400w2, zIsPrivateAccount, 1));
        }
        DataChannel dataChannel2 = this.LL;
        Integer numValueOf = null;
        if (dataChannel2 != null) {
            c758220Toi = (C758220Toi) dataChannel2.gg0(VisibleScopeSelectedChannel.class);
        } else {
            c758220Toi = null;
        }
        RR(this, zIsPrivateAccount, c238400w2, c758220Toi);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        final DataChannel dataChannel3 = this.LL;
        dataChannelGlobal.JQ2(C931350aLN.class, new C0JYM(dataChannel3) { // from class: X.0JhC
            public final DataChannel LIZ;

            @Override // X.C0JYM
            public final Integer LIZ() {
                C758220Toi c758220Toi3;
                DataChannel dataChannel4 = this.LIZ;
                if (dataChannel4 == null || (c758220Toi3 = (C758220Toi) dataChannel4.gg0(VisibleScopeSelectedChannel.class)) == null) {
                    return null;
                }
                return Integer.valueOf(c758220Toi3.LIZ);
            }

            @Override // X.C0JYM
            public final void LIZIZ() {
                DataChannel dataChannel4 = this.LIZ;
                if (dataChannel4 != null) {
                    dataChannel4.zW(VisibleScopeSelectedChannel.class, new C758220Toi(-1, (List) null, (List) null, (List) null, 30));
                }
            }

            {
                this.LIZ = dataChannel3;
            }
        });
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 != null && (c758220Toi2 = (C758220Toi) dataChannel4.gg0(VisibleScopeSelectedChannel.class)) != null) {
            numValueOf = Integer.valueOf(c758220Toi2.LIZ);
        }
        OR(numValueOf, "show", zIsPrivateAccount);
    }

    public static void PR(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_distribution_scope_pop_up");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "event_action_type");
        c474500IjALIZ.LJJII(str2, "distribution_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "anchor_decision");
        }
        c474500IjALIZ.LIZ();
    }

    public final void OR(Integer num, String str, boolean z) {
        C758100ToW c758100ToW = new C758100ToW(str, z, this, num);
        if (!this.LLILLL && !Intrinsics.LJFF(str, "show")) {
            this.LLILZ = c758100ToW;
        } else {
            c758100ToW.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hx9, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static final void RR(LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment, boolean z, C238400w2 c238400w2, C758220Toi c758220Toi) {
        Integer numValueOf;
        List<Pair<String, String>> list;
        int size;
        String strLJIIL;
        int i;
        Pair pair;
        C1841350y17 c1841350y17;
        int i2 = 0;
        if (c758220Toi != null) {
            numValueOf = Integer.valueOf(c758220Toi.LIZ);
        } else if (z) {
            numValueOf = 3;
        } else if (C494680Jac.LIZJ()) {
            numValueOf = null;
        } else {
            numValueOf = 0;
        }
        C1841350y17 c1841350y172 = liveVisibleScopeSettingFragment.LLILZIL;
        if (c1841350y172 != null) {
            c1841350y172.setChecked(false);
        }
        C1841350y17 c1841350y173 = liveVisibleScopeSettingFragment.LLILZLL;
        if (c1841350y173 != null) {
            c1841350y173.setChecked(false);
        }
        C1841350y17 c1841350y174 = liveVisibleScopeSettingFragment.LLIZ;
        if (c1841350y174 != null) {
            c1841350y174.setChecked(false);
        }
        C1841350y17 c1841350y175 = liveVisibleScopeSettingFragment.LLIZLLLIL;
        if (c1841350y175 != null) {
            c1841350y175.setChecked(false);
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                C1841350y17 c1841350y176 = liveVisibleScopeSettingFragment.LLILZIL;
                if (c1841350y176 != null) {
                    c1841350y176.setChecked(true);
                }
            } else if (numValueOf.intValue() == 3) {
                C1841350y17 c1841350y177 = liveVisibleScopeSettingFragment.LLILZLL;
                if (c1841350y177 != null) {
                    c1841350y177.setChecked(true);
                }
            } else if (numValueOf.intValue() == 1) {
                C1841350y17 c1841350y178 = liveVisibleScopeSettingFragment.LLIZ;
                if (c1841350y178 != null) {
                    c1841350y178.setChecked(true);
                }
            } else if (numValueOf.intValue() == 2 && (c1841350y17 = liveVisibleScopeSettingFragment.LLIZLLLIL) != null) {
                c1841350y17.setChecked(true);
            }
        }
        if (c758220Toi != null && (list = c758220Toi.LJ) != null && (!list.isEmpty())) {
            C16F5 c16f5 = liveVisibleScopeSettingFragment.LLJ;
            if (c16f5 != null) {
                List<Pair<String, String>> list2 = c758220Toi.LJ;
                if (list2 != null && list2.size() == 1) {
                    List<Pair<String, String>> list3 = c758220Toi.LJ;
                    if (list3 == null || (pair = (Pair) C13LP.LJJJLZIJ(0, list3)) == null || (strLJIIL = (String) pair.getFirst()) == null) {
                        strLJIIL = "";
                    }
                } else {
                    List<Long> list4 = c758220Toi.LIZIZ;
                    if (list4 != null) {
                        size = list4.size();
                    } else {
                        size = 0;
                    }
                    strLJIIL = C497740JfY.LJIIL(2131755981, size, Integer.valueOf(size));
                }
                c16f5.setText(strLJIIL);
                Context context = c16f5.getContext();
                if (C497740JfY.LJJ()) {
                    i = R.attr.d39;
                } else {
                    i = R.attr.d3k;
                }
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(i, context);
                if (c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezt, c16f5.getContext()));
                    float f = 14;
                    c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f));
                } else {
                    c20743516FdLIZLLL = null;
                }
                c16f5.setCompoundDrawablesRelative(null, null, c20743516FdLIZLLL, null);
                C786410Ut5.l8(c16f5, new ACListenerS41S0210000_12(liveVisibleScopeSettingFragment, c238400w2, z, 0));
            }
            FrameLayout frameLayout = liveVisibleScopeSettingFragment.LLJI;
            if (frameLayout != null) {
                C500260Jjc.LLFFF(frameLayout);
                C786410Ut5.LJJJJIZL(frameLayout);
                ArrayList<Pair> arrayList = new ArrayList();
                List<Pair<String, String>> list5 = c758220Toi.LJ;
                if (list5 != null) {
                    Iterator<Pair<String, String>> it2 = list5.iterator();
                    while (it2.hasNext()) {
                        ListProtector.add(arrayList, 0, it2.next());
                        if (arrayList.size() >= 3) {
                            break;
                        }
                    }
                }
                for (Pair pair2 : arrayList) {
                    FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
                    float f2 = 28;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2));
                    layoutParams.gravity = 8388661;
                    layoutParams.setMarginEnd((int) C497740JfY.LIZIZ(i2));
                    i2 += 22;
                    frameLayout.addView(frameLayout2, layoutParams);
                    frameLayout2.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezo, frameLayout.getContext()));
                    frameLayout2.setOutlineProvider(new C785830Us9(1));
                    frameLayout2.setClipToOutline(true);
                    C1324720kZq c1324720kZq = new C1324720kZq(frameLayout.getContext());
                    float f3 = 24;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(f3), (int) C497740JfY.LIZIZ(f3));
                    layoutParams2.gravity = 17;
                    frameLayout2.addView(c1324720kZq, layoutParams2);
                    C1324610kZf url = C1819620xS4.LIZ().setUrl((String) pair2.getSecond());
                    url.LJIILIIL = Boolean.TRUE;
                    int iLIZIZ = (int) C497740JfY.LIZIZ(f3);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(f3);
                    url.LJ = iLIZIZ;
                    url.LJFF = iLIZIZ2;
                    url.LJJI(c1324720kZq);
                }
            }
        }
    }

    public final boolean MR(final C1841350y17 c1841350y17, final int i, final Function0<Unit> function0, final boolean z) {
        if (!C494680Jac.LIZJ()) {
            return false;
        }
        C782110Um9 c782110Um9 = new C782110Um9(requireContext());
        c782110Um9.LJIIZILJ(2131856054);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131856056));
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131856055);
        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0Tog
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                if (z) {
                    C494680Jac.LJIJJ(false);
                    C494680Jac.LJIL(true);
                    C494680Jac.LJIJ(false);
                }
                LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = this;
                String strLIZ = C473420IhQ.LIZ(Integer.valueOf(i));
                liveVisibleScopeSettingFragment.getClass();
                LiveVisibleScopeSettingFragment.PR("click", strLIZ, "change");
                liveDialog.dismiss();
                C473410IhP.LIZIZ(new ARunnableS81S0200000_12(function0, c1841350y17, 34));
            }
        };
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131856053);
        c755630TkX.LIZJ = new AcS105S0101000_12(i, this, 1);
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 1;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        PR("show", C473420IhQ.LIZ(Integer.valueOf(i)), null);
        return true;
    }
}
