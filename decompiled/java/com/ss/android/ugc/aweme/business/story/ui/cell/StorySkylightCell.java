package com.ss.android.ugc.aweme.business.story.ui.cell;

import X.AbstractC1597860rgO;
import X.AbstractC2211791BhR;
import X.C01GW;
import X.C0S1B;
import X.C0ZP4;
import X.C10EU;
import X.C1243240iSQ;
import X.C13LP;
import X.C1439480nYw;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1572230r13;
import X.C1596360rdy;
import X.C1596370rdz;
import X.C1596560reI;
import X.C1597880rgQ;
import X.C1597900rgS;
import X.C1597910rgT;
import X.C1605320rsQ;
import X.C1605390rsX;
import X.C1606280rty;
import X.C1606290rtz;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1608750rxx;
import X.C1618440sDa;
import X.C1620910sHZ;
import X.C1A5L;
import X.C2097608Jq;
import X.C2211751BhN;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C278330AvX;
import X.C294120Bfu;
import X.C319860CgK;
import X.C418440Gaw;
import X.C452501pT;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C729510SjV;
import X.C735620StM;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC1595080rbu;
import X.InterfaceC1595200rc6;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1605330rsR;
import X.InterfaceC1608860ry8;
import X.InterfaceC1891350zJl;
import X.InterfaceC426680GoE;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class StorySkylightCell extends BaseSkylightCell<C1596360rdy> implements InterfaceC1605330rsR, InterfaceC1595200rc6 {
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 226));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 235));
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 233));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 232));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 384));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 227));
    public final C1620910sHZ LLIZLLLIL = new C1620910sHZ(this, 12);
    public final C1620910sHZ LLJ = new C1620910sHZ(this, 11);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(58));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 228));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(90));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 234));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(91));

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())), new Pair("head_type", "story"));
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return this.LLJJI ? EnumC1605560rso.ADD_STORY : EnumC1605560rso.MUTE_STORIES;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return (View) this.LLILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1595200rc6
    public final C1605390rsX LLLLLLL() {
        String strValueOf = String.valueOf(getBindingAdapterPosition() + 1);
        String strValueOf2 = String.valueOf(b6());
        C1596360rdy c1596360rdy = (C1596360rdy) getItem();
        return new C1605390rsX(strValueOf, strValueOf2, null, null, null, null, null, null, String.valueOf(c1596360rdy != null ? c1596360rdy.LLILZIL : 0), null);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    /* JADX INFO: renamed from: V5, reason: merged with bridge method [inline-methods] */
    public final AvatarComponentView Hy1() {
        return (AvatarComponentView) this.LLILLJJLI.getValue();
    }

    public final HomeTabAbility W5() {
        return (HomeTabAbility) this.LLIZ.getValue();
    }

    public final int X5() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final boolean c6() {
        return ((Boolean) this.LLJILJILJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onItemViewCreated();
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue();
        if (iSkylightListAbility != null) {
            iSkylightListAbility.kf1((TuxTextView) this.LLILLL.getValue());
        }
        C1605320rsQ.LIZ(this, this);
        C1607400rvm.LIZIZ.LIZIZ(a6(), new C1608320rxG(this.itemView, Hy1(), (View) null, (View) this.LLILLL.getValue(), (TuxIconView) null, 52), false);
        AvatarComponentView avatarComponentViewHy1 = Hy1();
        C1608750rxx config = avatarComponentViewHy1.getConfig();
        new AwS603S0100000_24(this, 35).invoke(config.LIZ);
        if (c6()) {
            config.LIZJ(new C1606280rty(new C735620StM(a6())));
        }
        InterfaceC1608860ry8<? extends InterfaceC426680GoE>[] interfaceC1608860ry8Arr = new InterfaceC1608860ry8[2];
        interfaceC1608860ry8Arr[0] = new C737760Swo(new C1606750ruj(a6(), new C1606770rul(null, new AwS638S0100000_24(this, 17), new AwS603S0100000_24(this, 36), new AwS638S0100000_24(this, 18), AFwS213S0000000_24.get$arr$(89), new AwS568S0100000_24(this, 229), null, null, Boolean.valueOf(X5() == 0 && C319860CgK.LIZ()), 193), 4));
        interfaceC1608860ry8Arr[1] = new C1606290rtz(0);
        config.LIZLLL(interfaceC1608860ry8Arr);
        new AwS603S0100000_24(this, 37).invoke(config.LIZJ);
        avatarComponentViewHy1.LJFF(avatarComponentViewHy1.getConfig());
        if (C294120Bfu.LIZJ()) {
            View view = (View) this.LLILLL.getValue();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = iLIZIZ;
                }
                view.requestLayout();
            }
        }
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 7), this.itemView);
        Hy1().getClickListener().setOnNodeClickListener(new AwS638S0100000_24(this, 19));
        if (Y() || c6()) {
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 231);
            Hy1().LIZ(3, new ACListenerS158S0100000_24(awS568S0100000_24, 8));
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(awS568S0100000_24, 0));
        }
        if (c6()) {
            C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0rkW
                public Function0<String> LJ;
                public final boolean LJFF = true;
                public final boolean LJI = true;
                public final int LJII = 100;
                public final C1620890sHX LJIIIIZZ;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJIIIIZZ;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIIZZ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIZ() {
                    return this.LJFF;
                }

                {
                    this.LJ = new AwS568S0100000_24(this, 230);
                    this.LJIIIIZZ = new C1620890sHX(this, 0);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        }
        EventBus.LIZLLL().LJIJJ(this);
        View view2 = (View) this.LLILZ.getValue();
        if (view2 != null) {
            C2271391DvN.LIZ(view2, (C1A5L) C2271381DvM.LLJLL.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        String strLIZ;
        Aweme aweme;
        User author;
        TextView textView = (TextView) this.LLILLL.getValue();
        if (this.LLJJI) {
            int iX5 = X5();
            String str = iX5 != 1 ? iX5 != 2 ? iX5 != 3 ? "" : "inbox" : "follow" : "fyp";
            strLIZ = this.itemView.getContext().getString((C278330AvX.LIZ(str) && ((Boolean) C278330AvX.LIZLLL.getValue()).booleanValue() && (X5() == 3 || X5() == 2 || X5() == 1)) ? 2131856811 : (C278330AvX.LIZ(str) && (X5() == 3 || X5() == 2 || X5() == 1)) ? 2131856810 : !this.LLJJIII ? 2131849136 : 2131849137);
        } else {
            C1596360rdy c1596360rdy = (C1596360rdy) getItem();
            if (c1596360rdy == null || (aweme = c1596360rdy.LLILLJJLI) == null || (author = aweme.getAuthor()) == null) {
                strLIZ = null;
            } else {
                C1243240iSQ.LIZ.getClass();
                strLIZ = C1243240iSQ.LIZ(author, true);
            }
        }
        textView.setText(strLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        C1596360rdy c1596360rdy = (C1596360rdy) getItem();
        if (c1596360rdy != null) {
            return c1596360rdy.getUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return Hy1();
    }

    public final EnumC1606080rte a6() {
        EnumC1606080rte enumC1606080rte;
        int iUH2 = uH2();
        if (iUH2 == 0) {
            enumC1606080rte = EnumC1606080rte.FRIENDS_SKYLIGHT;
        } else {
            if (iUH2 != 1) {
                if (iUH2 == 2) {
                    enumC1606080rte = EnumC1606080rte.FOLLOW_SKYLIGHT;
                }
                return EnumC1606080rte.FRIENDS_SKYLIGHT;
            }
            enumC1606080rte = EnumC1606080rte.FYP_SKYLIGHT;
        }
        if (enumC1606080rte != null) {
            return enumC1606080rte;
        }
        return EnumC1606080rte.FRIENDS_SKYLIGHT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b6() {
        Fragment fragmentLIZ;
        ISkylightListAbility iSkylightListAbility;
        LifecycleOwner parent = getParent();
        if (parent == null || (fragmentLIZ = C1596560reI.LIZ(parent)) == null || (iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), ISkylightListAbility.class, null)) == null) {
            return 0;
        }
        return iSkylightListAbility.t51((C1596360rdy) getItem());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d6() {
        C1597900rgS c1597900rgSLIZIZ;
        boolean zLIZ;
        ISkylightListAbility iSkylightListAbility;
        C1596360rdy c1596360rdy = (C1596360rdy) getItem();
        if (c1596360rdy == null || !c1596360rdy.LL) {
            int iX5 = X5();
            if (iX5 == 0) {
                c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
            } else if (iX5 != 2) {
                return;
            } else {
                c1597900rgSLIZIZ = C1597910rgT.LIZ();
            }
            if (c1597900rgSLIZIZ != null) {
                C1597880rgQ c1597880rgQ = c1597900rgSLIZIZ.LIZIZ;
                int i = 3;
                if (c1597880rgQ.LIZLLL || c1597880rgQ.LIZIZ >= 3) {
                    return;
                }
                C1596360rdy c1596360rdy2 = (C1596360rdy) getItem();
                if (c1596360rdy2 != null) {
                    zLIZ = c1596360rdy2.LIZ(c1597900rgSLIZIZ.LIZJ);
                    if (zLIZ) {
                        i = 0;
                    }
                } else {
                    zLIZ = false;
                }
                c1597900rgSLIZIZ.LIZLLL(i, zLIZ, false);
                if (this.LLJIJIL && (iSkylightListAbility = (ISkylightListAbility) this.LLILZIL.getValue()) != null && iSkylightListAbility.p11()) {
                    AbstractC1597860rgO.LJI(c1597900rgSLIZIZ.LIZIZ, zLIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return (uH2() == 0 && C319860CgK.LIZ()) ? R.layout.c79 : R.layout.c7g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        HomeTabAbility homeTabAbilityW5 = W5();
        if (homeTabAbilityW5 != null) {
            homeTabAbilityW5.tx0(this.LLIZLLLIL);
        }
        HomeTabAbility homeTabAbilityW52 = W5();
        if (homeTabAbilityW52 != null) {
            homeTabAbilityW52.Ik0(this.LLJ);
        }
        C1572230r13.LIZ((List) this.LLJILJIL.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        this.LLJIJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C0ZP4 c0zp4YQ2;
        super.onViewAttachedToWindow();
        HomeTabAbility homeTabAbilityW5 = W5();
        if (homeTabAbilityW5 != null) {
            homeTabAbilityW5.ao(this.LLIZLLLIL);
        }
        HomeTabAbility homeTabAbilityW52 = W5();
        if (homeTabAbilityW52 != null) {
            homeTabAbilityW52.UC1(this.LLJ);
        }
        this.LLJI = true;
        this.LLJIJIL = true;
        FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) this.LLILZLL.getValue();
        if (feedSkylightContainerViewModel != null && (c0zp4YQ2 = feedSkylightContainerViewModel.yQ2(this, new AwS603S0100000_24(this, 439))) != null) {
            ((List) this.LLJILJIL.getValue()).add(c0zp4YQ2);
        }
        d6();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        HomeTabAbility homeTabAbilityW5 = W5();
        if (homeTabAbilityW5 != null) {
            homeTabAbilityW5.tx0(this.LLIZLLLIL);
        }
        HomeTabAbility homeTabAbilityW52 = W5();
        if (homeTabAbilityW52 != null) {
            homeTabAbilityW52.Ik0(this.LLJ);
        }
        this.LLJI = false;
        this.LLJIJIL = false;
        C1572230r13.LIZ((List) this.LLJILJIL.getValue());
    }

    public final int uH2() {
        Fragment fragmentLIZ;
        ISkylightListAbility iSkylightListAbility;
        LifecycleOwner parent = getParent();
        if (parent == null || (fragmentLIZ = C1596560reI.LIZ(parent)) == null || (iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), ISkylightListAbility.class, null)) == null) {
            return -1;
        }
        return iSkylightListAbility.uH2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U5(C1596360rdy c1596360rdy) {
        boolean z;
        String authorUid;
        Aweme aweme;
        boolean z2 = c1596360rdy.LL;
        this.LLJJI = z2;
        if (z2 && !C729510SjV.LJJII(c1596360rdy.LLILLJJLI)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIII = z;
        C0S1B.LIZ(Hy1(), AwemeExtKt.getAuthorUid(c1596360rdy.LLILLJJLI), c1596360rdy.LLILLJJLI.getAuthor(), this, true, null, 40);
        AvatarComponentView avatarComponentViewHy1 = Hy1();
        C1596360rdy c1596360rdy2 = (C1596360rdy) getItem();
        if (c1596360rdy2 == null || (aweme = c1596360rdy2.LLILLJJLI) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        avatarComponentViewHy1.setTag(R.id.w9c, authorUid);
        q6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f6(int i) {
        boolean z;
        Fragment fragmentLIZ;
        ISkylightListAbility iSkylightListAbility;
        LifecycleOwner parent = getParent();
        if (parent != null && (fragmentLIZ = C1596560reI.LIZ(parent)) != null && (iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), ISkylightListAbility.class, null)) != null) {
            getItem();
            iSkylightListAbility.QY0(i);
        }
        e6(101, (C1596360rdy) getItem());
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        h6(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h6(boolean z) {
        String str;
        String str2;
        String authorUid;
        C1597900rgS c1597900rgSLIZIZ;
        boolean zLIZ;
        Aweme aweme;
        int iUH2 = uH2();
        if (z) {
            str = "plus";
        } else {
            str = "head";
        }
        InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
        String strLIZIZ = C1596560reI.LIZIZ(iUH2);
        if (this.LLJJI) {
            str2 = "create";
        } else {
            str2 = "story";
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        C1596360rdy c1596360rdy = (C1596360rdy) getItem();
        if (c1596360rdy == null || (aweme = c1596360rdy.LLILLJJLI) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        interfaceC1595080rbuLIZJ.LJI(bindingAdapterPosition, strLIZIZ, null, str2, str, authorUid, null);
        if (iUH2 != 0) {
            if (iUH2 == 2) {
                c1597900rgSLIZIZ = C1597910rgT.LIZ();
            } else {
                return;
            }
        } else {
            c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
        }
        if (c1597900rgSLIZIZ != null) {
            C1596360rdy c1596360rdy2 = (C1596360rdy) getItem();
            if (c1596360rdy2 != null) {
                zLIZ = c1596360rdy2.LIZ(c1597900rgSLIZIZ.LIZJ);
            } else {
                zLIZ = false;
            }
            AbstractC1597860rgO.LJ(c1597900rgSLIZIZ.LIZIZ, zLIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZJ("story_feed_top_cell", viewGroup.getContext(), null, getLayoutId(), null, viewGroup, false, true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        this.LLJIJIL = true;
        if (!this.LLJI) {
            return;
        }
        d6();
    }

    @C14EU
    public final void onStoryPublishAnimFinishEvent(C1439480nYw c1439480nYw) {
        if (!this.LLJJI) {
            return;
        }
        if (Intrinsics.LJFF(c1439480nYw.LIZ, "friends_top_cell") || Intrinsics.LJFF(c1439480nYw.LIZ, "hot_top_cell")) {
            C1618440sDa.LIZIZ.LJJJLZIJ().LIZIZ(Hy1().getAvatar());
        }
    }

    public final void e6(int i, C1596360rdy c1596360rdy) {
        String str;
        ISkylightMafService iSkylightMafService;
        if (c1596360rdy == null || !c6() || !C10EU.LJIILJJIL(c1596360rdy.LLILLJJLI.getAuthor())) {
            return;
        }
        if (uH2() == 1) {
            str = "homepage_hot";
        } else {
            str = "homepage_friends";
        }
        if (i == 101 && (iSkylightMafService = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null)) != null) {
            iSkylightMafService.LJ();
        }
        ((InterfaceC1597970rgZ) this.LLJILLL.getValue()).LIZIZ(i, c1596360rdy.LLILLJJLI.getAuthor(), str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1596360rdy c1596360rdy = (C1596360rdy) interfaceC1891350zJl;
        super.onBindItemView(c1596360rdy, list);
        if (list.isEmpty()) {
            U5(c1596360rdy);
            return;
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C1596370rdz) || !((C1596370rdz) objLJJJLZIJ).LIZ) {
            return;
        }
        U5(c1596360rdy);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i6(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r4 = "Following"
            java.lang.String r3 = "HOME"
            r2 = 1
            r1 = 0
            if (r8 == 0) goto L3b
            boolean r0 = android.text.TextUtils.equals(r7, r4)
            if (r0 == 0) goto L52
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r5.W5()
            if (r0 == 0) goto L52
            boolean r0 = r0.ft0(r3)
            if (r0 != r2) goto L52
        L1a:
            boolean r0 = android.text.TextUtils.equals(r6, r4)
        L1e:
            if (r2 == 0) goto L24
            r5.onResume(r1)
        L23:
            return
        L24:
            if (r0 == 0) goto L23
            r5.onPause()
            boolean r0 = X.C296550Bjp.LIZ()
            if (r0 == 0) goto L23
            X.01GW r0 = r5.LLJILLL
            java.lang.Object r0 = r0.getValue()
            X.0rgZ r0 = (X.InterfaceC1597970rgZ) r0
            r0.LJII()
            return
        L3b:
            boolean r0 = android.text.TextUtils.equals(r7, r3)
            if (r0 == 0) goto L52
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r5.W5()
            if (r0 == 0) goto L52
            boolean r0 = r0.ft0(r4)
            if (r0 != r2) goto L52
        L4d:
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            goto L1e
        L52:
            r2 = 0
            if (r8 == 0) goto L4d
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.story.ui.cell.StorySkylightCell.i6(java.lang.String, java.lang.String, boolean):void");
    }
}
