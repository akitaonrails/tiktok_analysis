package com.ss.android.ugc.aweme.main.assems;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0QSJ;
import X.C0XQ7;
import X.C10K8;
import X.C10K9;
import X.C1150504el;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LE;
import X.C1402840mbq;
import X.C1558520qew;
import X.C19EG;
import X.C1B46;
import X.C2217381BqS;
import X.C296200BjG;
import X.C298030BmD;
import X.C452501pT;
import X.C486860J7k;
import X.C687700QyG;
import X.C724240Sb0;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.DialogC19267910Zp;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1618570sDn;
import X.InterfaceC19268010Zq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IShareService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class DialogAssem extends BaseMainContainerAssem implements MainDialogAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(new C10K9());
    public final DialogAssem LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(252));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C10K8(this));
    public volatile MainBusinessAbility LLILZIL;
    public InterfaceC665370Q7z LLILZLL;
    public C0QSJ LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DialogAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"DialogAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        bo(c19egLIZ != null ? c19egLIZ.getIntent() : null);
        if (C298030BmD.LIZ()) {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            m257do(c19egLIZ2 != null ? c19egLIZ2.getIntent() : null);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 480406480) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    @Override // com.ss.android.ugc.aweme.base.MainDialogAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QD() {
        /*
            r6 = this;
            X.19EG r5 = X.C724240Sb0.LIZ(r6)
            if (r5 != 0) goto L7
            return
        L7:
            boolean r0 = X.C297720Bli.LIZ()
            r4 = 1
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLILZIL
            if (r0 != 0) goto L5f
            monitor-enter(r6)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            X.0QSJ r1 = r6.LLIZ     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L36
            X.0Q7z r3 = r6.LLILZLL     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L25
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L50
            r6.LLILZLL = r3     // Catch: java.lang.Throwable -> L50
        L25:
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L50
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L50
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L50
            r6.LLIZ = r1     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L36
            r0 = 0
            goto L3e
        L36:
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L50
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0     // Catch: java.lang.Throwable -> L50
        L3e:
            r6.LLILZIL = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L5f
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L4e:
            monitor-exit(r6)
            goto L5f
        L50:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L53:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            X.01wD r0 = X.C1558520qew.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0
        L5f:
            java.lang.String r2 = r0.getEnterFrom()
            X.01GW r0 = r6.LLILLL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.IToolsBusinessService r1 = (com.ss.android.ugc.aweme.IToolsBusinessService) r1
            if (r1 == 0) goto L79
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r6)
            X.15sG r0 = r1.getRestoreWorkPopTask(r2, r5, r0)
            com.bytedance.poplayer.core.PopupManager.LJIJI(r0, r4)
            return
        L79:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.DialogAssem.QD():void");
    }

    @Override // com.ss.android.ugc.aweme.base.MainDialogAbility
    public final void kL0() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
        String string = c19egLIZ.getResources().getString(2131822191);
        Object[] objArr = new Object[1];
        String nickname = curUser.getNickname();
        if (a0.LJJJIL(nickname)) {
            nickname = "";
        }
        objArr[0] = nickname;
        c1397580mTM.LJI(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
        c1397580mTM.LIZIZ(c19egLIZ.getResources().getString(2131850879));
        C1397620mTQ c1397620mTQ = new C1397620mTQ(c19egLIZ);
        c1397620mTQ.LIZJ(0, c19egLIZ.getResources().getString(2131827221), new AwS598S0100000_19(c19egLIZ, 192));
        c1397620mTQ.LIZJ(1, c19egLIZ.getResources().getString(2131827222), AFwS257S0000000_19.get$arr$(226));
        c1397620mTQ.LJFF = true;
        c1397580mTM.LJIIL = c1397620mTQ;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.LL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLILLJJLI, MainDialogAbility.class);
    }

    public final void bo(Intent intent) {
        final C1402840mbq c1402840mbq;
        final C19EG c19egLIZ;
        String string;
        if (intent == null) {
            return;
        }
        try {
            if (intent.getBooleanExtra("sdk_save_draft_success", false) || (c1402840mbq = (C1402840mbq) intent.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG")) == null) {
                return;
            }
            c1402840mbq.mNeedShowDialog = true;
            if (!C1B46.LJFF(c1402840mbq) || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
                return;
            }
            if (TextUtils.isEmpty(c1402840mbq.mAppName)) {
                string = c19egLIZ.getString(2131850162);
            } else {
                string = c1402840mbq.mAppName;
            }
            DialogC19267910Zp dialogC19267910Zp = new DialogC19267910Zp(c19egLIZ, string, "share saved", c1402840mbq.mClientKey, new InterfaceC19268010Zq() { // from class: X.10Zy
                @Override // X.InterfaceC19268010Zq
                public final void LIZ() throws Throwable {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("launch_from", c1402840mbq.mClientKey);
                    c2344009Gk.LJ(Boolean.TRUE, "is_draft");
                    C20684815ws.LJIILLIIL("stay_in_tt", c2344009Gk.LIZ);
                    Intent intent2 = new Intent();
                    intent2.setAction("com.aweme.opensdk.action.stay.in.dy");
                    ContextWrapper contextWrapper = c19egLIZ;
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepapGA3SFo+DlLlo9TpAQxOvRq6LPp", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {intent2};
                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11080, "androidx/fragment/app/FragmentActivity", "sendBroadcast", contextWrapper, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11080, "androidx/fragment/app/FragmentActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, false);
                        return;
                    }
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            contextWrapper = (ContextWrapper) obj;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            intent2 = (Intent) obj2;
                        }
                    }
                    contextWrapper.sendBroadcast(intent2);
                    c0wst.LIZ(11080, "androidx/fragment/app/FragmentActivity", "sendBroadcast", null, objArr, contextWrapper, c0wzw, true);
                }

                @Override // X.InterfaceC19268010Zq
                public final void LIZIZ() {
                    ((IShareRespSendService) ServiceManager.get().getService(IShareRespSendService.class)).LIZIZ(c19egLIZ, c1402840mbq, C1B4F.LJIILLIIL);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("launch_from", c1402840mbq.mClientKey);
                    c2344009Gk.LJ(Boolean.TRUE, "is_draft");
                    C20684815ws.LJIILLIIL("return_to_origin_app", c2344009Gk.LIZ);
                }
            });
            dialogC19267910Zp.show();
            C785410UrT.LIZIZ(dialogC19267910Zp);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC19267910Zp);
            C816490W1f.LIZ(dialogC19267910Zp);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m257do(Intent intent) {
        C19EG c19egLIZ;
        if (intent == null) {
            return;
        }
        try {
            if (!intent.getBooleanExtra("sdk_save_draft_success", false) || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
                return;
            }
            IShareService iShareService = (IShareService) PluggableExtentionKt.pluggableSpi$default(IShareService.class, false, false, false, 14, null);
            if (iShareService != null) {
                iShareService.LIZJ(c19egLIZ, null);
            }
            Intent intent2 = c19egLIZ.getIntent();
            if (intent2 != null) {
                intent2.putExtra("sdk_save_draft_success", false);
            }
            Intent intent3 = c19egLIZ.getIntent();
            if (intent3 != null) {
                intent3.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        Intent intent2;
        DataCenter dataCenter;
        super.onNewIntent(intent);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (C486860J7k.LIZIZ(c19egLIZ).xQ2("page_feed") instanceof InterfaceC1618570sDn) && (dataCenter = (DataCenter) this.LLILZ.getValue()) != null) {
            dataCenter.zQ2(Boolean.FALSE, "lastTryShowGuideViewResult");
        }
        bo(intent);
        if (C298030BmD.LIZ()) {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 != null) {
                intent2 = c19egLIZ2.getIntent();
            } else {
                intent2 = null;
            }
            m257do(intent2);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLILLJJLI, MainDialogAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
    }
}
