package com.ss.android.ugc.profile.business.ur.platform.business;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0C38;
import X.C0H1U;
import X.C0OBG;
import X.C0XPD;
import X.C0XQ7;
import X.C0ZP4;
import X.C10EU;
import X.C1176850gjL;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1248230iaT;
import X.C1249160iby;
import X.C1249170ibz;
import X.C1250210idf;
import X.C1251330ifT;
import X.C1253930ijf;
import X.C1265680j2c;
import X.C1265690j2d;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19252910Tv;
import X.C19474211Gy;
import X.C19EG;
import X.C19ME;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2537109wv;
import X.C267780AeW;
import X.C268330AfP;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C497820Jfg;
import X.C627150Oin;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1251790igD;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC487330J9f;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileAddFriendsRedPointsVM;
import com.ss.android.ugc.profile.business.ur.experiment.NewFollowerNotificationSetting;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS15S1210000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationFollowerProtocol extends ProfilePlatformProtocol<RelationData> implements INotifyAbility, InterfaceC724530SbT, InterfaceC487330J9f {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2409));
    public final C736950SvV LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public Integer LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;

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

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "relation_info_follower";
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

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        Integer newFollowerCount;
        UserAccountInfo userAccountInfo;
        Integer newFollowerCount2;
        C1251330ifT c1251330ifT = this.LLJIJIL;
        String string = null;
        if (c1251330ifT == null || c1251330ifT.LIZ == null) {
            return;
        }
        boolean zLJJZZI = LJJZZI();
        RelationData relationData = (RelationData) this.LLJILJIL;
        boolean z = zLJJZZI & ((relationData == null || (newFollowerCount2 = relationData.getNewFollowerCount()) == null || newFollowerCount2.intValue() <= 0) ? false : true);
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        if (z && (!((profileCommonInfoLJIILIIL == null || (userAccountInfo = profileCommonInfoLJIILIIL.getUserAccountInfo()) == null) ? false : Intrinsics.LJFF(userAccountInfo.isSecret(), Boolean.TRUE)))) {
            String str = C1249160iby.LIZIZ;
            Keva keva = C1249170ibz.LIZ().LIZ;
            keva.storeInt("unclick_times", keva.getInt("unclick_times", 0) + 1);
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            RelationData relationData2 = (RelationData) this.LLJILJIL;
            if (relationData2 != null && (newFollowerCount = relationData2.getNewFollowerCount()) != null) {
                string = newFollowerCount.toString();
            }
            c1253930ijf.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("new_fans_count", string);
            C20684815ws.LJIILLIIL("show_new_fans_reminder", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final View LJIIJJI() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        C786410Ut5.m6(constraintLayout, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92)), -2));
        Context context2 = getContext();
        this.LLJLLIL = context2 != null ? new TuxTextView(context2, null, 6, 0) : null;
        C19ME c19me = new C19ME(-2, -2);
        if (!C268330AfP.LJIIIZ()) {
            c19me.endToEnd = 0;
        }
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null) {
            tuxTextView.setGravity(17);
            tuxTextView.setMaxLines(1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
            tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
            this.LLJJJJJIL.getValue().getClass();
            tuxTextView.setTuxFont(C268330AfP.LIZLLL() ? 42 : 33);
            tuxTextView.setId(R.id.s5x);
            if (C2537109wv.LIZ() && !C0C38.LIZ() && !C268330AfP.LIZLLL()) {
                C0H1U.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d))), tuxTextView);
                if (((Boolean) C267780AeW.LIZ.getValue()).booleanValue()) {
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), tuxTextView);
                } else {
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(-2.5d))), tuxTextView);
                }
            } else if (((Boolean) C267780AeW.LIZ.getValue()).booleanValue() && C268330AfP.LIZLLL()) {
                C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-1)), tuxTextView);
            }
        }
        TuxTextView tuxTextView2 = this.LLJLLIL;
        if (tuxTextView2 != null) {
            C786410Ut5.R6(tuxTextView2, c19me);
        }
        Context context3 = getContext();
        this.LLJLLL = context3 != null ? new TuxTextView(context3, null, 6, 0) : null;
        C19ME c19me2 = new C19ME(-1, -2);
        if (C268330AfP.LJIIIZ()) {
            c19me2.startToStart = 0;
        } else if (C2537109wv.LIZ()) {
            c19me2.endToEnd = 0;
            c19me2.startToStart = 0;
        } else {
            c19me2.leftToLeft = 0;
        }
        c19me2.topToBottom = R.id.s5x;
        TuxTextView tuxTextView3 = this.LLJLLL;
        if (tuxTextView3 != null) {
            C786410Ut5.R6(tuxTextView3, c19me2);
        }
        TuxTextView tuxTextView4 = this.LLJLLL;
        if (tuxTextView4 != null) {
            Context context4 = tuxTextView4.getContext();
            C2537109wv.LIZ();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context4);
            tuxTextView4.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
            if (!C2537109wv.LIZ() && !C0C38.LIZ()) {
                C426750GoL.LJIIIZ(tuxTextView4, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)))), 0, 0, false, 16);
            }
            if (C0C38.LIZ()) {
                C0H1U.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), tuxTextView4);
            }
            tuxTextView4.setGravity(17);
            this.LLJJJJJIL.getValue().getClass();
            tuxTextView4.setTuxFont(C268330AfP.LIZLLL() ? 71 : 61);
            tuxTextView4.setId(R.id.s5w);
            if (C268330AfP.LIZLLL()) {
                C426750GoL.LJIIIZ(tuxTextView4, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-1))), 0, 0, false, 16);
            }
        }
        if (q1()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            C19ME c19me3 = new C19ME(-2, -2);
            c19me3.bottomToBottom = R.id.s5x;
            c19me3.startToEnd = R.id.s5x;
            C786410Ut5.d6(linearLayout, c19me3);
            linearLayout.setGravity(1);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0);
            C426750GoL.LJIIIZ(linearLayout, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C268330AfP.LJIIIZ() ? 12 : 16))), false, 16);
            linearLayout.setId(R.id.s57);
            Context context5 = getContext();
            TuxIconView tuxIconView = context5 != null ? new TuxIconView(context5, null, 0, 6, null) : null;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            if (tuxIconView != null) {
                C786410Ut5.M6(tuxIconView, layoutParams);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_plus_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            if (tuxIconView != null) {
                tuxIconView.setTuxIcon(c419910GdJ);
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            }
            Context context6 = getContext();
            TuxTextView tuxTextView5 = context6 != null ? new TuxTextView(context6, null, 6, 0) : null;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            if (tuxTextView5 != null) {
                C786410Ut5.R6(tuxTextView5, layoutParams2);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a04, tuxTextView5.getContext());
                tuxTextView5.setTextColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
                this.LLJJJJJIL.getValue().getClass();
                tuxTextView5.setTuxFont(C268330AfP.LIZLLL() ? 82 : 62);
                tuxTextView5.setId(R.id.s56);
            }
            linearLayout.addView(tuxIconView);
            linearLayout.addView(tuxTextView5);
            constraintLayout.addView(linearLayout);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJLIIL(this.LLJLLIL, this.LLJLLL, null, null);
        constraintLayout.addView(this.LLJLLIL);
        constraintLayout.addView(this.LLJLLL);
        if (!C268330AfP.LJIIIZ()) {
            constraintLayout.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110)));
        }
        if (C268330AfP.LJIIIZ()) {
            C786410Ut5.m6(constraintLayout, new LinearLayout.LayoutParams(-2, -2));
            C426750GoL.LJIIL(constraintLayout, Integer.valueOf(((C1248230iaT) this.LLJJJJJIL.getValue()).LJIJI()), 0, Integer.valueOf(((C1248230iaT) this.LLJJJJJIL.getValue()).LJIJI()), 0, 16);
            constraintLayout.setClipChildren(false);
            constraintLayout.setClipToPadding(false);
            return constraintLayout;
        }
        if (!C2537109wv.LIZ()) {
            return constraintLayout;
        }
        C786410Ut5.m6(constraintLayout, new LinearLayout.LayoutParams(-2, -2));
        if (!C2537109wv.LJII() || !this.LLJI) {
            constraintLayout.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
            constraintLayout.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110)));
            return constraintLayout;
        }
        constraintLayout.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
        Context context7 = getContext();
        constraintLayout.setMaxWidth(context7 != null ? (C497820Jfg.LIZIZ(context7) - (((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61))) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))) * 3))) / 3 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110)));
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0146  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData, com.ss.android.ugc.profile.platform.base.data.BizBaseData] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData, com.ss.android.ugc.profile.platform.base.data.BizBaseData] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowerProtocol.LJJLIIIJILLIZJL():boolean");
    }

    public final void LJJLIIIJLJLI() {
        int iIntValue;
        TextView textView;
        String text;
        Resources resources;
        Describe describe;
        Integer newFollowerCount;
        Describe describe2;
        T t = this.LLJILJIL;
        String quantityString = null;
        if (Intrinsics.LJFF(null, (t == 0 || (describe2 = t.getDescribe()) == null) ? null : describe2.getText())) {
            RelationData relationData = (RelationData) this.LLJILJIL;
            if (Intrinsics.LJFF(null, relationData != null ? relationData.getFollowerCount() : null)) {
                RelationData relationData2 = (RelationData) this.LLJILJIL;
                if (Intrinsics.LJFF(null, relationData2 != null ? relationData2.getNewFollowerCount() : null)) {
                    return;
                }
            }
        }
        T t2 = this.LLJILJIL;
        if (t2 != 0) {
            Integer followerCount = ((RelationData) t2).getFollowerCount();
            int iIntValue2 = followerCount != null ? followerCount.intValue() : 0;
            RelationData relationData3 = (RelationData) this.LLJILJIL;
            iIntValue = iIntValue2 - ((relationData3 == null || (newFollowerCount = relationData3.getNewFollowerCount()) == null) ? 0 : newFollowerCount.intValue());
            if (iIntValue < 0) {
                iIntValue = 0;
            }
        } else {
            iIntValue = 1;
        }
        View view = this.LLILZLL;
        if (!(view instanceof ConstraintLayout) || view == null || (textView = (TextView) view.findViewById(R.id.s5w)) == null) {
            return;
        }
        T t3 = this.LLJILJIL;
        if (t3 == 0 || (describe = t3.getDescribe()) == null || (text = describe.getText()) == null || text.length() == 0) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755639, iIntValue);
            }
            text = quantityString;
        }
        textView.setText(text);
    }

    public final String LJJLL() {
        Integer newFollowerCount;
        T t = this.LLJILJIL;
        if (t == 0) {
            return "";
        }
        RelationData relationData = (RelationData) t;
        if (relationData != null && (newFollowerCount = relationData.getNewFollowerCount()) != null && newFollowerCount.intValue() == 0) {
            return "";
        }
        RelationData relationData2 = (RelationData) this.LLJILJIL;
        return String.valueOf(relationData2 != null ? relationData2.getNewFollowerCount() : null);
    }

    public final boolean q1() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            return iProfilePlatformVM.isMyProfile();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelationFollowerProtocol() {
        AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(464);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(ProfileAddFriendsRedPointsVM.class), aFwS207S0000000_19, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(450), null, null, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2408));
        this.LLJJJJLIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS207S0000000_19.get$arr$(465));
        this.LLJLILLLLZIIL = -1;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        Context context;
        Activity activityLIZ;
        if (q1()) {
            if (C1265690j2d.LIZLLL.getValue().booleanValue() || C1265680j2c.LIZIZ()) {
                String str = C1249160iby.LIZIZ;
                C1249170ibz.LIZ().LIZ.storeInt("unclick_times_threshold", 50);
            } else {
                String str2 = C1249160iby.LIZIZ;
                C1249160iby c1249160ibyLIZ = C1249170ibz.LIZ();
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel = NewFollowerNotificationSetting.LIZ;
                NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel2 = (NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel) settingsManagerLIZLLL.LJIIIIZZ("new_follower_notification_setting_on_profile", NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel.class, newFollowerNotificationSettingOnProfileModel);
                if (newFollowerNotificationSettingOnProfileModel2 != null) {
                    newFollowerNotificationSettingOnProfileModel = newFollowerNotificationSettingOnProfileModel2;
                }
                c1249160ibyLIZ.LIZ.storeInt("unclick_times_threshold", newFollowerNotificationSettingOnProfileModel.unclickTimesThreshold);
            }
            C1249160iby c1249160ibyLIZ2 = C1249170ibz.LIZ();
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel3 = NewFollowerNotificationSetting.LIZ;
            NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel4 = (NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel) settingsManagerLIZLLL2.LJIIIIZZ("new_follower_notification_setting_on_profile", NewFollowerNotificationSetting.NewFollowerNotificationSettingOnProfileModel.class, newFollowerNotificationSettingOnProfileModel3);
            if (newFollowerNotificationSettingOnProfileModel4 != null) {
                newFollowerNotificationSettingOnProfileModel3 = newFollowerNotificationSettingOnProfileModel4;
            }
            c1249160ibyLIZ2.LIZ.storeInt("without_notice_days_threshold", newFollowerNotificationSettingOnProfileModel3.withoutNoticeDaysThreshold);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), this, INotifyAbility.class, null, null);
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 399));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJIFFI() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getString(2131837644);
    }

    public final boolean LJJZZI() {
        boolean z;
        boolean zLIZ;
        UserAccountInfo userAccountInfo;
        Integer followerCount;
        Integer friendCount;
        UserAccountInfo userAccountInfo2;
        Integer followerCount2;
        if (!q1()) {
            return false;
        }
        if (C1265690j2d.LIZJ.getValue().booleanValue() || C1265680j2c.LIZIZ()) {
            RelationData relationData = (RelationData) this.LLJILJIL;
            boolean z2 = relationData == null || (followerCount = relationData.getFollowerCount()) == null || followerCount.intValue() < 1000;
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            if (profileCommonInfoLJIILIIL != null && (userAccountInfo = profileCommonInfoLJIILIIL.getUserAccountInfo()) != null) {
                zLJFF = Intrinsics.LJFF(userAccountInfo.isSecret(), Boolean.TRUE);
            }
            z = z2 & (!zLJFF);
            String str = C1249160iby.LIZIZ;
            zLIZ = C1249170ibz.LIZ().LIZ();
        } else {
            RelationData relationData2 = (RelationData) this.LLJILJIL;
            boolean z3 = relationData2 == null || (followerCount2 = relationData2.getFollowerCount()) == null || followerCount2.intValue() < 1000;
            ProfileCommonInfo profileCommonInfoLJIILIIL2 = LJIILIIL();
            boolean z4 = z3 & (!((profileCommonInfoLJIILIIL2 == null || (userAccountInfo2 = profileCommonInfoLJIILIIL2.getUserAccountInfo()) == null) ? false : Intrinsics.LJFF(userAccountInfo2.isSecret(), Boolean.TRUE)));
            RelationData relationData3 = (RelationData) this.LLJILJIL;
            z = z4 & (relationData3 == null || (friendCount = relationData3.getFriendCount()) == null || friendCount.intValue() <= 60);
            String str2 = C1249160iby.LIZIZ;
            zLIZ = C1249170ibz.LIZ().LIZ();
        }
        return z & zLIZ;
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.business.INotifyAbility
    public final void El1(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        boolean zIsMyProfile;
        String str;
        C19EG activity;
        if (C0OBG.LIZIZ(this.LLILZLL)) {
            return false;
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            zIsMyProfile = iProfilePlatformVM.isMyProfile();
        } else {
            zIsMyProfile = false;
        }
        if (zIsMyProfile) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(activity, "personal_homepage", "follower_list", new C627150Oin().LIZ, null);
            return false;
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJJIL.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIJJ(assemViewModel, new AwS15S1210000_19(activity, this, zIsMyProfile, str, 1));
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        RelationData relationData;
        try {
            relationData = (RelationData) C1250210idf.LIZ(nVar.toString(), RelationData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            relationData = null;
        }
        this.LLJILJIL = relationData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        TextView textView;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            LJJJLZIJ(nVar);
            LJJLIIIJILLIZJL();
        }
        if (profileComponents.bizData == null && ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LJFF()) {
            View view = this.LLILZLL;
            if ((view instanceof ConstraintLayout) && view != null && (textView = (TextView) view.findViewById(R.id.s5x)) != null) {
                textView.setText("-");
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(boolean r12) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowerProtocol.LJJLJLI(boolean):void");
    }

    public final void LJL(int i) {
        TextView textView;
        TextView textView2;
        Integer num = this.LLJJL;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.LLJJL = Integer.valueOf(i);
        long j = i;
        C1251330ifT c1251330ifT = this.LLJIJIL;
        User user = null;
        if (c1251330ifT != null) {
            user = c1251330ifT.LIZ;
        }
        long j2 = 0;
        if (C10EU.LJIILLIIL(user) && C10EU.LJIIIIZZ()) {
            j = 0;
        }
        if (j == -1) {
            View view = this.LLILZLL;
            if ((view instanceof ConstraintLayout) && view != null && (textView2 = (TextView) view.findViewById(R.id.s5x)) != null) {
                textView2.setText("-");
                return;
            }
            return;
        }
        if (j >= 0) {
            j2 = j;
        }
        View view2 = this.LLILZLL;
        if ((view2 instanceof ConstraintLayout) && view2 != null && (textView = (TextView) view2.findViewById(R.id.s5x)) != null) {
            textView.setText(C1176850gjL.LIZ(1, Long.valueOf(j2), "-"));
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.business.INotifyAbility
    public final void hf0(FollowStatus followStatus) {
        User user;
        String uid;
        Integer numValueOf;
        Integer followerCount;
        UserAccountInfo userAccountInfo;
        Integer numValueOf2;
        Integer followerCount2;
        UserAccountInfo userAccountInfo2;
        UserProfileInfo userProfileInfo;
        UserProfileAbility userProfileAbility;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null)) != null) {
            user = userProfileAbility.getUser();
        } else {
            user = null;
        }
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        String userId = followStatus.getUserId();
        if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
            uid = userProfileInfo.getUid();
        } else {
            uid = null;
        }
        if (TextUtils.equals(userId, uid)) {
            if (profileCommonInfoLJIILIIL != null) {
                UserRelationInfo userRelationInfo = profileCommonInfoLJIILIIL.getUserRelationInfo();
                if (userRelationInfo != null) {
                    int followStatus2 = followStatus.getFollowStatus();
                    Integer followStatus3 = userRelationInfo.getFollowStatus();
                    if (followStatus3 != null && followStatus2 == followStatus3.intValue()) {
                        return;
                    }
                }
                UserRelationInfo userRelationInfo2 = profileCommonInfoLJIILIIL.getUserRelationInfo();
                if (userRelationInfo2 != null) {
                    userRelationInfo2.setFollowStatus(Integer.valueOf(followStatus.getFollowStatus()));
                }
            }
            if (user != null) {
                user.setFollowStatus(followStatus.getFollowStatus());
            }
            if (followStatus.getFollowStatus() == 0) {
                if (profileCommonInfoLJIILIIL == null || (userAccountInfo2 = profileCommonInfoLJIILIIL.getUserAccountInfo()) == null || !Intrinsics.LJFF(userAccountInfo2.isSecret(), Boolean.TRUE)) {
                    RelationData relationData = (RelationData) this.LLJILJIL;
                    if (relationData != null && (followerCount2 = relationData.getFollowerCount()) != null) {
                        numValueOf2 = Integer.valueOf(followerCount2.intValue() - 1);
                    } else {
                        numValueOf2 = null;
                    }
                    RelationData relationData2 = (RelationData) this.LLJILJIL;
                    if (relationData2 != null) {
                        relationData2.setFollowerCount(numValueOf2);
                    }
                    if (numValueOf2 != null && user != null) {
                        user.setFollowerCount(numValueOf2.intValue());
                    }
                    LJJLJLI(false);
                    LJJLIIIJLJLI();
                }
            } else if (followStatus.getFollowStatus() == 1 && (profileCommonInfoLJIILIIL == null || (userAccountInfo = profileCommonInfoLJIILIIL.getUserAccountInfo()) == null || !Intrinsics.LJFF(userAccountInfo.isSecret(), Boolean.TRUE))) {
                RelationData relationData3 = (RelationData) this.LLJILJIL;
                if (relationData3 != null && (followerCount = relationData3.getFollowerCount()) != null) {
                    numValueOf = Integer.valueOf(followerCount.intValue() + 1);
                } else {
                    numValueOf = null;
                }
                RelationData relationData4 = (RelationData) this.LLJILJIL;
                if (relationData4 != null) {
                    relationData4.setFollowerCount(numValueOf);
                }
                if (numValueOf != null && user != null) {
                    user.setFollowerCount(numValueOf.intValue());
                }
                LJJLJLI(false);
                LJJLIIIJLJLI();
            }
            UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility2 == null) {
                return;
            }
            userProfileAbility2.sA2(user, EnumC1251790igD.NORMAL);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJLIIL(this.LLJLLIL, this.LLJLLL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
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
