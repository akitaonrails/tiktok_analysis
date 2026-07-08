package com.ss.android.ugc.profile.business.live.notificationlive.adapter;

import X.AbstractC666100QAu;
import X.C01GW;
import X.C0HX6;
import X.C10E1;
import X.C10E7;
import X.C10EU;
import X.C10F0;
import X.C10F8;
import X.C11DP;
import X.C11EA;
import X.C11GO;
import X.C11RK;
import X.C1252120igk;
import X.C1260870iur;
import X.C1265420j2C;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1389890mGx;
import X.C13LE;
import X.C15O7;
import X.C1908030zkf;
import X.C19296410eQ;
import X.C19328310jZ;
import X.C19332210kC;
import X.C19332510kF;
import X.C19335310kh;
import X.C19465311Dn;
import X.C19572211ho;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C993750by1;
import X.InterfaceC1766500w4O;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS85S0300000_19;
import Y.ACallableS431S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS270S0000000_28;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS677S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PushSettingFollowListAdapter extends C11DP<InterfaceC1891350zJl> {
    public final LifecycleOwner LLILLL;
    public final String LLILZ;
    public boolean LLILZIL;

    public final class CampaignItemViewSwitchHolder extends JediBaseViewHolder<SubSpaceItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // X.C10F0
        public final void A() {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onChangeSuccess(live_campaign_push, ");
            sbLIZ.append(C19328310jZ.LIZIZ.LIZLLL("live_sub_space_push"));
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 0));
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            boolean z = c19328310jZ.LIZLLL("live_campaign_push") == 1;
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendRequest(live_campaign_push, ");
            sbLIZ.append(c19328310jZ.LIZLLL("live_sub_space_push"));
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public CampaignItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ecv, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l2o);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C15O7.LIZJ(new ACallableS431S0100000_28(pushSettings, 17)).LJ(new C19335310kh(this, 6), C15O7.LJIIIIZZ, null);
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, C1265420j2C> {
        public final C0HX6 LLJI;
        public final TextView LLJIJIL;
        public final TuxIconView LLJILJIL;
        public final TuxIconView LLJILJILJ;
        public boolean LLJILLL;
        public final C01GW LLJJ;

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public final NotificationLiveViewModel V5() {
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(349);
            JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
            if (jediViewHolderProxy == null) {
                throw new IllegalStateException("proxy not bound to viewHolder yet");
            }
            C10E7 c10e7 = new C10E7(this.LLJ, jediViewHolderProxy.LLILZ.getValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(FollowItemViewHolder.class.getName());
            sbLIZ.append('_');
            sbLIZ.append(NotificationLiveViewModel.class.getName());
            JediViewModel jediViewModel = (JediViewModel) c10e7.LIZ(C2188811AlT.LIZIZ(sbLIZ), NotificationLiveViewModel.class);
            InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(NotificationLiveViewModel.class);
            if (interfaceC1766500w4OCreate != null) {
                interfaceC1766500w4OCreate.LIZ();
            }
            jediViewModel.JQ2(aFwS257S0000000_19);
            return (NotificationLiveViewModel) jediViewModel;
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            View viewFindViewById = this.itemView.findViewById(R.id.c39);
            C384050F3z c384050F3z = new C384050F3z();
            Integer numValueOf = Integer.valueOf(R.attr.zq);
            c384050F3z.LIZIZ = numValueOf;
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            View viewFindViewById2 = this.itemView.findViewById(R.id.c3f);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
            viewFindViewById2.setBackground(c384050F3z2.LIZ(viewFindViewById2.getContext()));
            AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 324);
            JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
            if (jediViewHolderProxy == null) {
                throw new IllegalStateException("proxy not bound to viewHolder yet");
            }
            C10E7 c10e7 = new C10E7(this.LLJ, jediViewHolderProxy.LLILZ.getValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(FollowItemViewHolder.class.getName());
            sbLIZ.append('_');
            sbLIZ.append(UserViewModel.class.getName());
            JediViewModel jediViewModel = (JediViewModel) c10e7.LIZ(C2188811AlT.LIZIZ(sbLIZ), UserViewModel.class);
            InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(UserViewModel.class);
            if (interfaceC1766500w4OCreate != null) {
                interfaceC1766500w4OCreate.LIZ();
            }
            jediViewModel.JQ2(awS598S0100000_19);
            C11EA.LJIIL(this, jediViewModel, AFwS315S0000000_28.get$arr$(34));
            C11EA.LJII(this, (JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.10Dx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
                }
            }, new AwS642S0100000_28(PushSettingFollowListAdapter.this, 55));
        }

        public final void W5(User user) {
            this.LLJI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LLJI.LIZ();
            ACListenerS85S0300000_19 aCListenerS85S0300000_19 = new ACListenerS85S0300000_19(user, this, PushSettingFollowListAdapter.this, 7);
            C786410Ut5.C9(this.LLJI, aCListenerS85S0300000_19);
            C786410Ut5.T7(this.LLJIJIL, aCListenerS85S0300000_19);
            C786410Ut5.I7(new ACListenerS85S0300000_19(user, this, PushSettingFollowListAdapter.this, 6), this.itemView);
            this.LLJIJIL.setText(C10EU.LIZJ(user));
            C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LLJIJIL);
            X5(user.getLivePushNotificationStatus());
            a6(PushSettingFollowListAdapter.this.LLILZIL);
            C1252120igk.LIZ(V5(), user.getSecUid());
            C11EA.LJIIIIZZ(this, V5(), new C2217381BqS() { // from class: X.0ii4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ResponseState) obj).getCacheEvent();
                }
            }, new C2217381BqS() { // from class: X.0ii3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((ResponseState) obj).getPushState());
                }
            }, new AwS677S0100000_28(user, 1));
            if (this.LLILLL == 2) {
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.c39));
            } else {
                C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.c39));
            }
            if (this.LLILLL == PushSettingFollowListAdapter.this.getItemCount() - 2) {
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.c3f));
            } else {
                C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.c3f));
            }
        }

        public final void X5(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LLJILJIL.setIconRes(R.raw.icon_bell_slash);
                        this.LLJILJIL.setTintColorRes(R.attr.a1h);
                        return;
                    }
                    return;
                }
                this.LLJILJIL.setIconRes(R.raw.icon_bell);
                this.LLJILJIL.setTintColorRes(R.attr.a1h);
                return;
            }
            this.LLJILJIL.setIconRes(R.raw.icon_bell_activation);
            this.LLJILJIL.setTintColorRes(R.attr.a1h);
        }

        public final void a6(boolean z) {
            float f;
            float f2;
            float f3;
            C0HX6 c0hx6 = this.LLJI;
            float f4 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hx6);
            c0hx6.setAlpha(f);
            TextView textView = this.LLJIJIL;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            C786410Ut5.S4(f2, textView);
            TuxIconView tuxIconView = this.LLJILJIL;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.34f;
            }
            C786410Ut5.x5(tuxIconView, f3);
            TuxIconView tuxIconView2 = this.LLJILJILJ;
            if (!z) {
                f4 = 0.34f;
            }
            C786410Ut5.x5(tuxIconView2, f4);
        }

        public FollowItemViewHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ed6, viewGroup, false));
            this.LLJI = (C0HX6) this.itemView.findViewById(R.id.l9h);
            this.LLJIJIL = (TextView) this.itemView.findViewById(R.id.txt_user_name);
            this.LLJILJIL = (TuxIconView) this.itemView.findViewById(R.id.bv8);
            this.LLJILJILJ = (TuxIconView) this.itemView.findViewById(R.id.b8t);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PushSettingNotificationChoiceViewModel.class);
            this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 100));
        }
    }

    public final class FollowItemViewSwitchHolder extends JediBaseViewHolder<FollowItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;
        public final C01GW LLJILJIL;

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 1));
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
            C11EA.LJII(this, (JediViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.10Dw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
                }
            }, new AwS642S0100000_28(PushSettingFollowListAdapter.this, 54));
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        @Override // X.C10F0
        public final void A() {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LIZ(((C11GO) this.LLJI.getAccessory()).LJIILIIL());
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            boolean z;
            boolean z2 = true;
            try {
                PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) this.LLJILJIL.getValue();
                pushSettingNotificationChoiceViewModel.getClass();
                pushSettingNotificationChoiceViewModel.setState(new AwS41S0010000_29(true, 92));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (pushSettings.livePush == 1 && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIIZ()) {
                z = true;
            } else {
                z = false;
            }
            try {
                PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel2 = (PushSettingNotificationChoiceViewModel) this.LLJILJIL.getValue();
                pushSettingNotificationChoiceViewModel2.getClass();
                pushSettingNotificationChoiceViewModel2.setState(new AwS41S0010000_29(z, 92));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
            if (pushSettings.livePush != 1) {
                z2 = false;
            }
            c10e1M4.LIZ(z2);
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }

        public FollowItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ed8, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3a);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PushSettingNotificationChoiceViewModel.class);
            this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 101));
        }
    }

    public final class LiveCustomizedItemViewSwitchHolder extends JediBaseViewHolder<LiveCustomizedItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F0
        public final void A() {
        }

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 2));
            PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
            if (pushSettingsLJ != null) {
                boolean z = pushSettingsLJ.LJ() == 1;
                C127M accessory = this.LLJI.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(z);
                }
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public LiveCustomizedItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ecw, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3b);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C11GO c11go;
            boolean z = true;
            if (pushSettings.LJ() != 1) {
                z = false;
            }
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class LiveOutMultiGuestPushItemViewSwitchHolder extends JediBaseViewHolder<LiveOutMultiGuestPushItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F0
        public final void A() {
        }

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 3));
            PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
            if (pushSettingsLJ != null) {
                boolean z = pushSettingsLJ.LJI() == 1;
                C127M accessory = this.LLJI.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(z);
                }
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public LiveOutMultiGuestPushItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eda, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3f);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C11GO c11go;
            boolean z = true;
            if (pushSettings.LJI() != 1) {
                z = false;
            }
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class LiveTransactionItemViewSwitchHolder extends JediBaseViewHolder<LiveTransactionItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F0
        public final void A() {
        }

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 4));
            PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
            if (pushSettingsLJ != null) {
                boolean z = pushSettingsLJ.LJIILIIL() == 1;
                C127M accessory = this.LLJI.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(z);
                }
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public LiveTransactionItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.edx, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3e);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C11GO c11go;
            boolean z = true;
            if (pushSettings.LJIILIIL() != 1) {
                z = false;
            }
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class RewardItemViewSwitchHolder extends JediBaseViewHolder<RewardItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F0
        public final void A() {
        }

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            C127A c127a = (C127A) this.LLJI.getAccessory();
            c127a.LJIILLIIL(new C19332210kC(this, c127a, 5));
            PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
            if (pushSettingsLJ != null) {
                boolean z = pushSettingsLJ.liveRewardPush == 1;
                C127M accessory = this.LLJI.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(z);
                }
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public RewardItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.edp, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3c);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C11GO c11go;
            boolean z = true;
            if (pushSettings.liveRewardPush != 1) {
                z = false;
            }
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class SubSpaceItemViewSwitchHolder extends JediBaseViewHolder<SubSpaceItemViewSwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final C127K LLJI;
        public C11RK<C127K> LLJIJIL;

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // X.C10F0
        public final void A() {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onChangeSuccess(live_sub_space_push, ");
            sbLIZ.append(C19328310jZ.LIZIZ.LIZLLL("live_sub_space_push"));
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            this.LLJI.LJ(true, true);
            ((C11GO) this.LLJI.getAccessory()).LJIILLIIL(new C19332510kF(this, 11));
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            boolean z = c19328310jZ.LIZLLL("live_sub_space_push") == 1;
            C127M accessory = this.LLJI.getAccessory();
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILJJIL(z);
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendRequest(live_sub_space_push, ");
            sbLIZ.append(c19328310jZ.LIZLLL("live_sub_space_push"));
            sbLIZ.append(')');
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        public SubSpaceItemViewSwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.edw, viewGroup, false));
            this.LLJI = (C127K) this.itemView.findViewById(R.id.l3d);
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            C15O7.LIZJ(new ACallableS431S0100000_28(pushSettings, 18)).LJ(new C19335310kh(this, 7), C15O7.LJIIIIZZ, null);
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public final class FollowItemViewTitleHolder extends JediBaseViewHolder<FollowItemViewTitleHolder, C993750by1> {
        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public FollowItemViewTitleHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ed9, viewGroup, false));
        }
    }

    @Override // X.C11DY
    public final void LLLFZ(C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS135S0101000_29(0, this, 12), new AwS605S0100000_26(this, 432), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(7, this, 12), AFwS271S0000000_28.get$arr$(406), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(9, this, 12), AFwS271S0000000_28.get$arr$(407), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(12, this, 12), AFwS271S0000000_28.get$arr$(408), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(17, this, 12), new AwS270S0000000_28(this, 3), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(18, this, 12), new AwS605S0100000_26(this, 433), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(19, this, 12), new AwS270S0000000_28(this, 4), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(21, this, 12), new AwS270S0000000_28(this, 5), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(22, this, 12), new AwS270S0000000_28(this, 6), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(23, this, 12), new AwS270S0000000_28(this, 0), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(24, this, 12), new AwS270S0000000_28(this, 1), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(60, this, 12), new AwS270S0000000_28(this, 2), null);
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType != 0) {
            return basicItemViewType;
        }
        return this.LL.LIZIZ(i);
    }

    public PushSettingFollowListAdapter(String str, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, new C19572211ho(), 4);
        this.LLILLL = lifecycleOwner;
        this.LLILZ = str;
        this.LLILZIL = true;
    }
}
