package com.ss.android.ugc.profile.business.live.notificationpost;

import X.AbstractC666100QAu;
import X.C01GW;
import X.C0HX6;
import X.C10E1;
import X.C10E7;
import X.C10F0;
import X.C10F8;
import X.C11DP;
import X.C11EA;
import X.C11GO;
import X.C1216270hkv;
import X.C1260870iur;
import X.C1265420j2C;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1361400lX0;
import X.C1389890mGx;
import X.C13LE;
import X.C1908030zkf;
import X.C19211110Dt;
import X.C19296410eQ;
import X.C19328310jZ;
import X.C19332210kC;
import X.C19332510kF;
import X.C19465311Dn;
import X.C19572211ho;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C993750by1;
import X.InterfaceC1766500w4O;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS130S0200000_28;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AFwS350S0000000_28;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes29.dex */
public final class PostNotificationSettingsAdapter extends C11DP<InterfaceC1891350zJl> {
    public static boolean LLILZIL = true;
    public static boolean LLILZLL = true;
    public static final C01GW<C10E1> LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(419));
    public final LifecycleOwner LLILLL;
    public final String LLILZ;

    public static final class FriendOnlySwitchHolder extends JediBaseViewHolder<FriendOnlySwitchHolder, C993750by1> implements C10F0 {
        public final ViewGroup LLJI;
        public final C127K LLJIJIL;
        public final C01GW LLJILJIL;
        public final C01GW LLJILJILJ;

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public final PostNotificationSettingsViewModel V5() {
            return (PostNotificationSettingsViewModel) this.LLJILJIL.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C11GO c11go;
            C11GO c11go2;
            this.LLJIJIL.LJ(true, true);
            this.LLJIJIL.setCellEnabled(PostNotificationSettingsAdapter.LLILZIL);
            this.LLJIJIL.setTitle(C1216270hkv.LIZJ(2131845686));
            this.LLJIJIL.setSubtitle(C1216270hkv.LIZJ(2131845685));
            C127M accessory = this.LLJIJIL.getAccessory();
            if ((accessory instanceof C127A) && (c11go2 = (C11GO) accessory) != null) {
                c11go2.LJIILLIIL(new C19332510kF(this, 12));
                c11go2.LJI(new AwS572S0100000_28(this, 588));
            }
            PostNotificationSettingsAdapter.LLILZLL = C19328310jZ.LIZIZ.LIZLLL("follow_new_video_push_select") == 1;
            PostNotificationSettingsViewModel postNotificationSettingsViewModelV5 = V5();
            boolean z = PostNotificationSettingsAdapter.LLILZLL;
            postNotificationSettingsViewModelV5.getClass();
            postNotificationSettingsViewModelV5.setState(new AwS115S0110000_29(postNotificationSettingsViewModelV5, z, 11));
            C127M accessory2 = this.LLJIJIL.getAccessory();
            if ((accessory2 instanceof C127A) && (c11go = (C11GO) accessory2) != null) {
                c11go.LJIILJJIL(PostNotificationSettingsAdapter.LLILZLL);
            }
            C11EA.LJII(this, V5(), new C2217381BqS() { // from class: X.10Dy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((PostNotificationStatus) obj).getPushSwitchState());
                }
            }, AFwS315S0000000_28.get$arr$(35));
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        @Override // X.C10F0
        public final void A() {
            C11GO c11go;
            C10E1 c10e1LIZ = C19211110Dt.LIZ();
            C127M accessory = this.LLJIJIL.getAccessory();
            c10e1LIZ.LJIILLIIL((!(accessory instanceof C127A) || (c11go = (C11GO) accessory) == null) ? false : c11go.LJIILIIL());
        }

        public FriendOnlySwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(new C1361400lX0(viewGroup.getContext(), R.style.my)), R.layout.ei3, viewGroup, false));
            this.LLJI = viewGroup;
            this.LLJIJIL = (C127K) this.itemView;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostNotificationSettingsViewModel.class);
            this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 102));
            this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 589));
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public static final class OptionsItemHolder extends JediBaseViewHolder<OptionsItemHolder, C1265420j2C> {
        public final ViewGroup LLJI;
        public final PostNotificationSettingsAdapter LLJIJIL;
        public final C0HX6 LLJILJIL;
        public final TuxTextView LLJILJILJ;
        public final TuxTextView LLJILLL;
        public final TuxIconView LLJJ;
        public final View LLJJI;
        public final View LLJJIII;
        public boolean LLJJIJI;
        public boolean LLJJIJIIJIL;
        public User LLJJIJIL;
        public final C01GW LLJJJ;

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            this.LLJJI.setBackground(V5(true));
            this.LLJJIII.setBackground(V5(false));
            this.LLJILLL.setMaxWidth((int) (((double) (this.LLJI.getResources().getDisplayMetrics().widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) * 0.35d));
            AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 325);
            JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
            if (jediViewHolderProxy == null) {
                throw new IllegalStateException("proxy not bound to viewHolder yet");
            }
            C10E7 c10e7 = new C10E7(this.LLJ, jediViewHolderProxy.LLILZ.getValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(OptionsItemHolder.class.getName());
            sbLIZ.append('_');
            sbLIZ.append(UserViewModel.class.getName());
            JediViewModel jediViewModel = (JediViewModel) c10e7.LIZ(C2188811AlT.LIZIZ(sbLIZ), UserViewModel.class);
            InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(UserViewModel.class);
            if (interfaceC1766500w4OCreate != null) {
                interfaceC1766500w4OCreate.LIZ();
            }
            jediViewModel.JQ2(awS598S0100000_19);
            C11EA.LJIIL(this, jediViewModel, AFwS315S0000000_28.get$arr$(37));
            C11EA.LJIIIIZZ(this, (JediViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.10Dz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((PostNotificationStatus) obj).getPushSwitchState());
                }
            }, new C2217381BqS() { // from class: X.10E4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((PostNotificationStatus) obj).getFriendsPushSwitchState());
                }
            }, AFwS350S0000000_28.get$arr$(5));
        }

        public final LayerDrawable V5(boolean z) {
            View view;
            Drawable[] drawableArr = new Drawable[2];
            if (z) {
                view = this.LLJJI;
            } else {
                view = this.LLJJIII;
            }
            drawableArr[0] = view.getBackground();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            if (z) {
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            } else {
                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
            }
            drawableArr[1] = c384050F3z.LIZ(this.LLJJI.getContext());
            return new LayerDrawable(drawableArr);
        }

        public final void W5(User user) {
            int i;
            this.LLJILJIL.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.LLJILJIL.LIZ();
            ACListenerS130S0200000_28 aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(user, this, 33);
            C786410Ut5.C9(this.LLJILJIL, aCListenerS130S0200000_28);
            C786410Ut5.h9(this.LLJILJILJ, aCListenerS130S0200000_28);
            C786410Ut5.I7(new ACListenerS130S0200000_28(user, this, 32), this.itemView);
            this.LLJILJILJ.setText(user.getNickname());
            C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LLJILJILJ);
            a6(user.getPostNotificationStatus());
            View view = this.LLJJI;
            int i2 = 0;
            if (this.LLILLL == 2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
            View view2 = this.LLJJIII;
            if (this.LLILLL != this.LLJIJIL.getItemCount() - 2) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }

        public final void X5(boolean z) {
            float f;
            float f2;
            float f3;
            C0HX6 c0hx6 = this.LLJILJIL;
            float f4 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0hx6);
            c0hx6.setAlpha(f);
            TuxTextView tuxTextView = this.LLJILJILJ;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            C786410Ut5.B5(tuxTextView, f2);
            TuxTextView tuxTextView2 = this.LLJILLL;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.34f;
            }
            C786410Ut5.B5(tuxTextView2, f3);
            TuxIconView tuxIconView = this.LLJJ;
            if (!z) {
                f4 = 0.34f;
            }
            C786410Ut5.x5(tuxIconView, f4);
            this.LLJJIJIIJIL = z;
        }

        public final void a6(int i) {
            String strLIZJ;
            TuxTextView tuxTextView = this.LLJILLL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        strLIZJ = "";
                    } else {
                        strLIZJ = C1216270hkv.LIZJ(2131849288);
                    }
                } else {
                    strLIZJ = C1216270hkv.LIZJ(2131849287);
                }
            } else {
                strLIZJ = C1216270hkv.LIZJ(2131849286);
            }
            tuxTextView.setText(strLIZJ);
        }

        public OptionsItemHolder(ViewGroup viewGroup, PostNotificationSettingsAdapter postNotificationSettingsAdapter) {
            super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ei4, viewGroup, false));
            this.LLJI = viewGroup;
            this.LLJIJIL = postNotificationSettingsAdapter;
            this.LLJILJIL = (C0HX6) this.itemView.findViewById(R.id.rje);
            this.LLJILJILJ = (TuxTextView) this.itemView.findViewById(R.id.rjg);
            this.LLJILLL = (TuxTextView) this.itemView.findViewById(R.id.rjf);
            this.LLJJ = (TuxIconView) this.itemView.findViewById(R.id.b8t);
            this.LLJJI = this.itemView.findViewById(R.id.ybi);
            this.LLJJIII = this.itemView.findViewById(R.id.cer);
            this.LLJJIJIIJIL = true;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostNotificationSettingsViewModel.class);
            this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 103));
        }
    }

    public static final class SwitchHolder extends JediBaseViewHolder<SwitchHolder, C993750by1> implements C10F8, C10F0 {
        public final ViewGroup LLJI;
        public final C127K LLJIJIL;
        public final C01GW LLJILJIL;
        public final C01GW LLJILJILJ;

        @Override // X.C10F8
        public final void onFailed(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            C127A c127a;
            this.LLJIJIL.LJ(true, true);
            C127M accessory = this.LLJIJIL.getAccessory();
            if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != null) {
                c127a.LJIILLIIL(new C19332210kC(this, c127a, 6));
            }
            C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
            c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
            c1260870iurProvidePushSettingFetchPresenter.LIZJ(new Object[0]);
            C11EA.LJII(this, (JediViewModel) this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.10E0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((PostNotificationStatus) obj).getPushSwitchState());
                }
            }, AFwS315S0000000_28.get$arr$(36));
        }

        @Override // X.C10F0
        public final void rY() {
            C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }

        @Override // X.C10F0
        public final void A() {
            C11GO c11go;
            C10E1 c10e1LIZ = C19211110Dt.LIZ();
            C127M accessory = this.LLJIJIL.getAccessory();
            c10e1LIZ.LJII((!(accessory instanceof C127A) || (c11go = (C11GO) accessory) == null) ? false : c11go.LJIILIIL());
        }

        public SwitchHolder(ViewGroup viewGroup) {
            super(C786410Ut5.Td(C786410Ut5.ne(new C1361400lX0(viewGroup.getContext(), R.style.my)), R.layout.ei3, viewGroup, false));
            this.LLJI = viewGroup;
            this.LLJIJIL = (C127K) this.itemView;
            this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 590));
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PostNotificationSettingsViewModel.class);
            this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 104));
        }

        @Override // X.C10F8
        public final void Hl(PushSettings pushSettings) {
            boolean z;
            boolean z2 = true;
            try {
                PostNotificationSettingsViewModel postNotificationSettingsViewModel = (PostNotificationSettingsViewModel) this.LLJILJILJ.getValue();
                postNotificationSettingsViewModel.getClass();
                postNotificationSettingsViewModel.setState(new AwS41S0010000_29(true, 93));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (pushSettings.followNewVideoPush == 1 && C19211110Dt.LIZ().LJIIL()) {
                z = true;
            } else {
                z = false;
            }
            try {
                PostNotificationSettingsViewModel postNotificationSettingsViewModel2 = (PostNotificationSettingsViewModel) this.LLJILJILJ.getValue();
                postNotificationSettingsViewModel2.getClass();
                postNotificationSettingsViewModel2.setState(new AwS41S0010000_29(z, 93));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C10E1 c10e1LIZ = C19211110Dt.LIZ();
            if (pushSettings.followNewVideoPush != 1) {
                z2 = false;
            }
            c10e1LIZ.LJII(z2);
        }

        @Override // X.C10F0
        public final void t00(int i) {
            rY();
        }
    }

    public static final class TitleHolder extends JediBaseViewHolder<TitleHolder, C993750by1> {
        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public TitleHolder(ViewGroup viewGroup) {
            TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
            tuxTextView.setTuxFont(52);
            tuxTextView.setText(C1216270hkv.LIZJ(2131849306));
            tuxTextView.setTextColorRes(R.attr.a1k);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.R6(tuxTextView, marginLayoutParams);
            super(tuxTextView);
        }
    }

    @Override // X.C11DY
    public final void LLLFZ(C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS135S0101000_29(18, this, 14), AFwS271S0000000_28.get$arr$(231), null);
        c19465311Dn.LJFF(new AwS135S0101000_29(17, this, 14), AFwS271S0000000_28.get$arr$(232), null);
        if (AddOptionForGuidanceExp.LJFF) {
            c19465311Dn.LJFF(new AwS135S0101000_29(20, this, 14), AFwS271S0000000_28.get$arr$(233), null);
        }
        c19465311Dn.LJFF(new AwS135S0101000_29(0, this, 14), new AwS605S0100000_26(this, 434), null);
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType != 0) {
            return basicItemViewType;
        }
        return this.LL.LIZIZ(i);
    }

    public PostNotificationSettingsAdapter(String str, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner, new C19572211ho(), 4);
        this.LLILLL = lifecycleOwner;
        this.LLILZ = str;
    }
}
