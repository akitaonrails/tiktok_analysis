package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight;

import X.AbstractC1327750kej;
import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0HTI;
import X.C0IJT;
import X.C0JTI;
import X.C0K70;
import X.C0K8F;
import X.C0KPJ;
import X.C0L0G;
import X.C0OM1;
import X.C0TZ2;
import X.C0TZ3;
import X.C0VSJ;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1323050kX9;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C207213166p;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2348809Ig;
import X.C474500IjA;
import X.C494720Jag;
import X.C494730Jah;
import X.C494810Jap;
import X.C494960Jb4;
import X.C495010Jb9;
import X.C495100JbI;
import X.C495170JbP;
import X.C495190JbR;
import X.C495210JbT;
import X.C495260JbY;
import X.C495280Jba;
import X.C495300Jbc;
import X.C495360Jbi;
import X.C495370Jbj;
import X.C500260Jjc;
import X.C755620TkW;
import X.C755630TkX;
import X.C782110Um9;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1782750wUb;
import X.EnumC207219166v;
import X.InterfaceC500940Jki;
import X.InterfaceC743640TFa;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents.SubscriptionSuspensionLifecycleObserver;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.n;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionSpotlightFragment extends BaseFragment implements C0JTI {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExHELIOSPTYlJyogO2s8LD04O2s/OSAnJCwrITt9GzAuOiwhITU4ICA9GzUjPSM6Ly04Dz0yLygpJzs=";
    public C16FS LL;
    public RecyclerView LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public ImageView LLILZLL;
    public C16FS LLIZ;
    public TuxNavBar LLIZLLLIL;
    public boolean LLJILLL;
    public DialogC1389620mGW LLJJ;
    public final IHostSubscription.Params LLJJIJI;
    public final C11NJ LLJJIJIIJIL;
    public String LLJJIJIL;
    public AnonymousClass0956 LLJJJ;
    public C494960Jb4 LLJJJIL;
    public final List<Integer> LLJJJJ;
    public final List<Integer> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJ = "";
    public final int LLJI = 123;
    public final int LLJIJIL = 124;
    public final C495370Jbj LLJILJIL = new C495370Jbj();
    public final List<C495170JbP> LLJILJILJ = new ArrayList();
    public boolean LLJJI = true;
    public final Map<String, C1323050kX9<AbstractC1327750kej>> LLJJIII = new LinkedHashMap();

    public final C16F5 PR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wk8) : null;
            this.LLILZ = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final TuxNavBar RR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wka) : null;
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR() {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment.WR():void");
    }

    @Override // X.C0JTI
    public final boolean onBackPressed() {
        if (!this.LLJILLL) {
            this.LLJILJIL.getClass();
            return false;
        }
        C0K8F c0k8f = C0K8F.LIZ;
        Context contextRequireContext = requireContext();
        String string = getString(2131844358);
        String string2 = getString(2131844355);
        String string3 = getString(2131844357);
        final C495260JbY c495260JbY = new C495260JbY(this);
        String string4 = getString(2131844356);
        final C495300Jbc c495300Jbc = new C495300Jbc(this);
        c0k8f.getClass();
        C782110Um9 c782110Um9 = new C782110Um9(contextRequireContext);
        c782110Um9.LIZJ = string;
        if (string2 != null) {
            c782110Um9.LJIIIZ(string2);
        }
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = string3;
        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0Jbg
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                c495260JbY.invoke();
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = string4;
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0Jbh
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                c495300Jbc.invoke();
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 2;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLJJIJIIJIL.LJ();
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    public SubscriptionSpotlightFragment() {
        IHostSubscription.Params params = new IHostSubscription.Params();
        params.min_width = 255;
        params.min_height = 255;
        params.max_width = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_height = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_size = 20480000;
        params.max_count = 10;
        params.emotesShowStyle = 0;
        params.logInfo = C2097908Jt.LIZJ(new Pair("show_entrance", this.LLJ));
        this.LLJJIJI = params;
        this.LLJJIJIIJIL = new C11NJ();
        this.LLJJIJIL = "";
        this.LLJJJIL = new C494960Jb4(null, new ArrayList(), "", new C495010Jb9());
        this.LLJJJJ = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.kxr), Integer.valueOf(R.id.wkj));
        this.LLJJJJJIL = C1697810uHb.LJIIJJI(Integer.valueOf(R.id.wkb), Integer.valueOf(R.id.wke), Integer.valueOf(R.id.wk5), Integer.valueOf(R.id.wk8), Integer.valueOf(R.id.wkh));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator it2 = ((LinkedHashMap) this.LLJJIII).values().iterator();
        while (it2.hasNext()) {
            C1323050kX9.LJII((C1323050kX9) it2.next());
        }
        Map<String, Boolean> mapLIZ = C0KPJ.le.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
        }
        List<C495170JbP> list = this.LLJJJIL.LLILLJJLI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
        Iterator<C495170JbP> it3 = list.iterator();
        while (it3.hasNext()) {
            AuditInfo auditInfo = it3.next().LJI;
            if (auditInfo != null) {
                long j = auditInfo.violationId;
                if (j > 0 && auditInfo.taskType == 1) {
                    linkedHashMap.put(String.valueOf(j), Boolean.TRUE);
                }
            }
        }
        C0KPJ.le.LIZJ(linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WR();
    }

    public final void SR(int i) {
        if (i == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_upload_click");
        UR(c474500IjALIZ);
        c474500IjALIZ.LJJII(this.LLJ, "show_entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJJJIL.LLILLJJLI.size()), "picture_quantity");
        c474500IjALIZ.LIZ();
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        int i2 = this.LLJI;
        int i3 = this.LLJIJIL;
        C0L0G.Companion.getClass();
        iHostSubscription.tG2(this, i2, i3, i, 0, C0L0G.DEFAULT, C2097908Jt.LIZJ(new Pair("show_entrance", this.LLJ)), 100, 0);
    }

    public final void UR(C474500IjA c474500IjA) {
        c474500IjA.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
    }

    public final void VR(boolean z) {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wke);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C16FS) viewFindViewById;
        }
        View view2 = viewFindViewById;
        if (view2 != null) {
            view2.setEnabled(z);
        }
        this.LLJILLL = z;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:11:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0085 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object NR(X.InterfaceC497601wk r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C495230JbV
            if (r0 == 0) goto L8a
            r5 = r9
            X.0JbV r5 = (X.C495230JbV) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r3 = r5.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r4 = 1
            if (r0 == 0) goto L51
            if (r0 != r4) goto L90
            X.0JbP r1 = r5.LLILLL
            java.lang.Object r2 = r5.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.01wk r8 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r1.LIZIZ(r3)
            X.0Jb4 r0 = r7.LLJJJIL
            r0.LLLI()
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()
            X.0JbP r1 = (X.C495170JbP) r1
            java.lang.String r0 = r1.LIZLLL
            r5.LL = r8
            r5.LLILLJJLI = r2
            r5.LLILLL = r1
            r5.LLILZLL = r4
            java.lang.Object r3 = r7.OR(r0, r5)
            if (r3 != r6) goto L2a
            return r6
        L51:
            X.C155000ia.LIZIZ(r3)
        L54:
            X.0Jb4 r0 = r7.LLJJJIL
            java.util.List<X.0JbP> r0 = r0.LLILLJJLI
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0JbP r0 = (X.C495170JbP) r0
            android.graphics.Bitmap r0 = r0.LIZ()
            if (r0 != 0) goto L61
            r3.add(r1)
            goto L61
        L78:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L85
            r0 = 0
            X.C2296808zG.LIZJ(r8, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L85:
            java.util.Iterator r2 = r3.iterator()
            goto L34
        L8a:
            X.0JbV r5 = new X.0JbV
            r5.<init>(r7, r9)
            goto L12
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment.NR(X.01wk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OR(java.lang.String r7, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C495240JbW
            if (r0 == 0) goto L8f
            r4 = r8
            X.0JbW r4 = (X.C495240JbW) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L96
            java.lang.Object r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            java.util.Map<java.lang.String, X.0kX9<X.0kej>> r0 = r6.LLJJIII
            r0.put(r7, r1)
            return r2
        L34:
            X.C155000ia.LIZIZ(r1)
            r2 = 0
            if (r7 != 0) goto L3b
            return r2
        L3b:
            X.0K8F r0 = X.C0K8F.LIZ
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            r4.LL = r7
            r4.LLILZ = r3
            r0.getClass()
            java.lang.String r0 = r1.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L5a
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r2, r2)
        L57:
            if (r1 != r5) goto L24
            return r5
        L5a:
            X.0kbQ r0 = X.C1325700kbQ.LIZLLL(r1)
            X.0kbR r1 = r0.LIZ()
            X.0kbA r0 = X.C1322200kVm.LIZ()
            X.0kSY r3 = r0.LJI(r1, r2)
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r0)
            X.0Hg4 r1 = new X.0Hg4
            r1.<init>()
            X.0WPb r0 = X.C822690WPb.LIZ()
            X.0kUG r3 = (X.AbstractC1321260kUG) r3
            r3.LIZJ(r1, r0)
            java.lang.Object r1 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L57
            X.C099Q.LIZJ(r4)
            goto L57
        L8f:
            X.0JbW r4 = new X.0JbW
            r4.<init>(r6, r8)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment.OR(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        FragmentManager supportFragmentManager;
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            this.LLJ = string;
        }
        VR(false);
        Context context = getContext();
        if (context != null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            this.LLJJJIL = new C494960Jb4(context, this.LLJILJILJ, this.LLJ, new C495210JbT(this, context, supportFragmentManager));
            View viewFindViewById = this.LLILLJJLI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.wkb);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = (RecyclerView) viewFindViewById;
            }
            ((RecyclerView) viewFindViewById).setLayoutManager(new GridLayoutManager(context, 2));
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.wkb);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (RecyclerView) viewFindViewById2;
            }
            ((RecyclerView) viewFindViewById2).setAdapter(this.LLJJJIL);
        }
        final Context context2 = getContext();
        if (context2 != null) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            final String strLJIJ = interfaceC500940JkiUser.LJIJ(interfaceC500940JkiUser.getCurrentUserId());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) getString(2131844351));
            spannableStringBuilder.append((CharSequence) " ");
            String string2 = getString(2131844354);
            spannableStringBuilder.append((CharSequence) string2);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.wk7);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (C16F5) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            C16F5[] c16f5Arr = new C16F5[2];
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.wk7);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (C16F5) viewFindViewById4;
            }
            c16f5Arr[0] = viewFindViewById4;
            c16f5Arr[1] = PR();
            Iterator it2 = C1697810uHb.LJIIJJI(c16f5Arr).iterator();
            while (it2.hasNext()) {
                C786410Ut5.l8((C16F5) it2.next(), new View.OnClickListener() { // from class: X.0JbA
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        List<C495170JbP> list = this.LLJJJIL.LLILLJJLI;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<C495170JbP> it3 = list.iterator();
                            while (it3.hasNext()) {
                                Integer num = it3.next().LIZIZ;
                                if (num != null && num.intValue() == 3) {
                                    return;
                                }
                            }
                        }
                        String strSpotlightFaq = LiveSubscriptionAnchorUrlSetting.spotlightFaq();
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJII(context2, strSpotlightFaq, C2097608Jq.LJIIJ(new Pair("sec_anchor_id", strLJIJ)));
                        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_faq_click");
                        subscriptionSpotlightFragment.UR(c474500IjALIZ);
                        c474500IjALIZ.LJJII(subscriptionSpotlightFragment.LLJ, "show_entrance");
                        c474500IjALIZ.LIZ();
                    }
                });
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String string3 = getString(2131844349);
            String string4 = getString(2131844350);
            int iLJJJ = a0.LJJJ(string3, "%s", 0, false, 6);
            spannableStringBuilder2.append((CharSequence) C786410Ut5.j4(string3, Arrays.copyOf(new Object[]{string4}, 1)));
            C1119920fFW.LJIIIIZZ(spannableStringBuilder2, iLJJJ, string4.length() + iLJJJ, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
            View viewFindViewById5 = this.LLILZIL;
            if (viewFindViewById5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById5 = view6.findViewById(R.id.wk5);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZIL = (C16F5) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) getString(2131844363));
            spannableStringBuilder3.append((CharSequence) " ");
            String string5 = getString(2131844354);
            spannableStringBuilder3.append((CharSequence) string5);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder3, spannableStringBuilder3.length() - string5.length(), spannableStringBuilder3.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
            PR().setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.sc;
            Drawable drawableLIZ = c0hti.LIZ(requireContext());
            View viewFindViewById6 = this.LLILZLL;
            if (viewFindViewById6 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById6 = view7.findViewById(R.id.kxs);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLILZLL = (ImageView) viewFindViewById6;
            }
            ((ImageView) viewFindViewById6).setImageDrawable(drawableLIZ);
            View viewFindViewById7 = this.LLIZ;
            if (viewFindViewById7 == null) {
                View view8 = getView();
                if (view8 != null) {
                    viewFindViewById7 = view8.findViewById(R.id.wkj);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLIZ = (C16FS) viewFindViewById7;
            }
            C786410Ut5.h8((C16FS) viewFindViewById7, new View.OnClickListener() { // from class: X.0Jbd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
                    subscriptionSpotlightFragment.SR(10 - subscriptionSpotlightFragment.LLJJJIL.LLILLJJLI.size());
                }
            });
            View viewFindViewById8 = this.LLILZIL;
            if (viewFindViewById8 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById8 = view9.findViewById(R.id.wk5);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLILZIL = (C16F5) viewFindViewById8;
            }
            C786410Ut5.l8((C16F5) viewFindViewById8, new View.OnClickListener() { // from class: X.0JVI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    Context context3 = context2;
                    C494790Jan.LJII(context3, "https://www.tiktok.com/community-guidelines/", C2097608Jq.LJIIJ(new Pair("lang", C19263510Xx.LIZ(context3).toString())));
                }
            });
            View viewFindViewById9 = this.LL;
            if (viewFindViewById9 == null) {
                View view10 = getView();
                if (view10 != null) {
                    viewFindViewById9 = view10.findViewById(R.id.wke);
                } else {
                    viewFindViewById9 = null;
                }
                this.LL = (C16FS) viewFindViewById9;
            }
            C786410Ut5.h8((C16FS) viewFindViewById9, new View.OnClickListener() { // from class: X.0JbX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view11) {
                    DialogC1389620mGW dialogC1389620mGW = this.LL.LLJJ;
                    if (dialogC1389620mGW != null) {
                        C786410Ut5.J4(dialogC1389620mGW);
                    }
                    SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
                    C495290Jbb c495290Jbb = new C495290Jbb(subscriptionSpotlightFragment);
                    subscriptionSpotlightFragment.getClass();
                    C500260Jjc.LJJJJJ(subscriptionSpotlightFragment, null, new C495130JbL(subscriptionSpotlightFragment, c495290Jbb, null), 3);
                }
            });
        }
        Context context3 = getContext();
        if (context3 != null) {
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            String strLJIJ2 = interfaceC500940JkiUser2.LJIJ(interfaceC500940JkiUser2.getCurrentUserId());
            TuxNavBar tuxNavBarRR = RR();
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new C495360Jbi(this));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131844344);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_eye;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new C494810Jap(context3, this, strLJIJ2));
            c0om1.LIZIZ(c1251150ifB2);
            tuxNavBarRR.setNavActions(c0om1);
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(requireContext());
        this.LLJJ = dialogC1389620mGW;
        dialogC1389620mGW.LJJLIIJ(true);
        C500260Jjc.LJJJJJ(this, null, new C495100JbI(this, null), 3);
        getLifecycle().addObserver(new SubscriptionSuspensionLifecycleObserver(new C495280Jba(this)));
        C0K70.LIZJ(requireContext(), "SubscriptionSpotlightFragment");
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0JbQ] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        C19EG activity;
        Bitmap bitmapDecodeBitmap;
        if (intent != null && i2 == this.LLJIJIL && i == this.LLJI) {
            IHostSubscription.Result resultVV1 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).vV1(this, intent, this.LLJJIJI);
            if (getView() != null && getContext() != null && (activity = getActivity()) != null) {
                IHostSubscription.Result.PhotoFile[] photoFileArr = resultVV1.originFiles;
                if (photoFileArr != null && photoFileArr.length != 0) {
                    ArrayList arrayList = new ArrayList(photoFileArr.length);
                    for (IHostSubscription.Result.PhotoFile photoFile : photoFileArr) {
                        String str = photoFile.path;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        Context context = getContext();
                        if (context == null) {
                            bitmapDecodeBitmap = null;
                        } else {
                            n nVarLJI = C2348809Ig.LJI(str);
                            C0K8F c0k8f = C0K8F.LIZ;
                            String string = nVarLJI.LJJIIZ("uri").toString();
                            c0k8f.getClass();
                            if (string.length() > 2 && (string = string.substring(1, string.length() - 1)) == null) {
                                string = "";
                            }
                            IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("content://media");
                            sbLIZ.append(string);
                            String strKy0 = iHostSubscription.ky0(context, UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                            if (strKy0 != null) {
                                str2 = strKy0;
                            }
                            bitmapDecodeBitmap = BitmapUtils.decodeBitmap(new C0VSJ(str2));
                        }
                        arrayList.add(bitmapDecodeBitmap);
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_next_click");
                    UR(c474500IjALIZ);
                    c474500IjALIZ.LJJII(this.LLJ, "show_entrance");
                    c474500IjALIZ.LJJII(Integer.valueOf(arrayList.size()), "picture_quantity");
                    c474500IjALIZ.LIZ();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_subscription_highlight_edit_page_show");
                    UR(c474500IjALIZ2);
                    c474500IjALIZ2.LJJII(this.LLJ, "show_entrance");
                    c474500IjALIZ2.LJJII("highlight_manage", "click_position");
                    c474500IjALIZ2.LJJII(Integer.valueOf(arrayList.size()), "picture_quantity");
                    c474500IjALIZ2.LIZ();
                    IHostSubscription iHostSubscription2 = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    String str3 = this.LLJ;
                    EnumC1782750wUb enumC1782750wUb = EnumC1782750wUb.NO_CHANGE;
                    EnumC207219166v enumC207219166v = EnumC207219166v.BITMAP;
                    Map mapLJ = C2097608Jq.LJ();
                    C0L0G.Companion.getClass();
                    iHostSubscription2.mS1(new C207213166p(supportFragmentManager, str3, enumC1782750wUb, enumC207219166v, mapLJ, arrayList, new C495190JbR() { // from class: X.0JbQ
                        @Override // X.C495190JbR
                        public final void LIZ(List<Bitmap> list) {
                            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LIZ;
                            C494960Jb4 c494960Jb4 = subscriptionSpotlightFragment.LLJJJIL;
                            List<C495170JbP> list2 = c494960Jb4.LLILLJJLI;
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            int i3 = 0;
                            for (Object obj : (ArrayList) list) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    arrayList2.add(new C495170JbP(null, (Bitmap) obj, 0, false, null, null, null, null, 505));
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            list2.addAll(new ArrayList(arrayList2));
                            subscriptionSpotlightFragment.VR(true);
                            c494960Jb4.LLLI();
                            this.LIZ.WR();
                        }
                    }));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0K70.LJFF(requireContext(), "SubscriptionSpotlightFragment", this.LLJ, "sub_spotlight");
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gle, viewGroup, false);
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
}
