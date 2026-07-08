package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC19484711Kz;
import X.AbstractC738140SxQ;
import X.C0DHG;
import X.C0WZX;
import X.C11L2;
import X.C11L5;
import X.C11PQ;
import X.C11S5;
import X.C1221610htX;
import X.C1221640hta;
import X.C1221710hth;
import X.C1221750htl;
import X.C1221760htm;
import X.C1221800htq;
import X.C1221830htt;
import X.C1221880hty;
import X.C1222200huU;
import X.C123100dR;
import X.C1245090iVP;
import X.C1251150ifB;
import X.C1265780j2m;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1524805y2;
import X.C1559260qg8;
import X.C1701940uOG;
import X.C197039127h;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19PO;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C632670Orh;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1221320ht4;
import X.EnumC1221770htn;
import X.EnumC1221780hto;
import X.EnumC1221910hu1;
import X.EnumC1221920hu2;
import X.EnumC584810Mwh;
import X.InterfaceC1221470htJ;
import X.InterfaceC1221660htc;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS484S0200000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcProgressAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public TuxNavBar LLJI;
    public C197039127h LLJIJIL;
    public C19PO LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public BPEAHandler LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C1221750htl LLJJJ;
    public InterfaceC1221470htJ LLJJJIL;
    public C1221710hth LLJJJJ;
    public EnumC1221780hto LLJJJJJIL;
    public C11L2 LLJJJJLIIL;
    public final C11PQ<List<AIGCQuota>> LLJJL;
    public List<AIGCQuota> LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcProgressAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcProgressVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final String No() {
        C1221800htq c1221800htq = (C1221800htq) this.LLJ.getValue();
        if (c1221800htq != null) {
            return c1221800htq.LLILLJJLI;
        }
        return null;
    }

    public final ProfileAigcProgressVM So() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (ProfileAigcProgressVM) assemVMLazy.getValue();
    }

    public final void Vo() {
        String strNo;
        C1221880hty c1221880hty = C1221880hty.LIZ;
        String str = this.LLJJIJIL ? "fast" : "slow";
        String enterFrom = getEnterFrom();
        String str2 = this.LLJJIJIIJIL;
        c1221880hty.getClass();
        C1221880hty.LIZIZ(null, str, "back", enterFrom, str2);
        int i = C1221760htm.LIZIZ[this.LLJJJJJIL.ordinal()];
        if (i == 1 || i == 2) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                c19egLIZ.finish();
                return;
            }
            return;
        }
        if (i != 3 || ((strNo = No()) != null && strNo.length() != 0)) {
            Ho();
            return;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            c19egLIZ2.finish();
        }
    }

    public final void cp() {
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(this.LLJJIJIL ? Oo(2131820583) : Oo(2131820587));
        TuxTextView tuxTextView2 = this.LLJJ;
        (tuxTextView2 != null ? tuxTextView2 : null).setText(this.LLJJIJIL ? Oo(2131820581) : Oo(2131820585));
    }

    public final String getEnterFrom() {
        C1221800htq c1221800htq = (C1221800htq) this.LLJ.getValue();
        if (c1221800htq != null) {
            return c1221800htq.LLILZ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0htl] */
    public ProfileAigcProgressAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcProgressVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2239);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(375);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 2240), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1221800htq.class, "PROFILE_AIGC_PROGRESS_PAGE_DATA"), checkSupervisorPrepared());
        this.LLJJIJIIJIL = "creating";
        this.LLJJJ = new InterfaceC1221660htc() { // from class: X.0htl
            @Override // X.InterfaceC1221660htc
            public void onUpdate(C1221710hth c1221710hth) {
                EnumC1221680hte enumC1221680hte;
                int iIntValue;
                Integer num;
                C1221710hth c1221710hth2 = this.LL.LLJJJJ;
                EnumC1221680hte enumC1221680hte2 = null;
                if (c1221710hth2 != null) {
                    enumC1221680hte = c1221710hth2.LIZ;
                } else {
                    enumC1221680hte = null;
                }
                if (enumC1221680hte == EnumC1221680hte.IN_PROGRESS) {
                    EnumC1221680hte enumC1221680hte3 = c1221710hth.LIZ;
                    if (c1221710hth2 != null) {
                        enumC1221680hte2 = c1221710hth2.LIZ;
                    }
                    if (enumC1221680hte3 == enumC1221680hte2) {
                        Integer num2 = c1221710hth.LJ;
                        int iIntValue2 = 0;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C1221710hth c1221710hth3 = this.LL.LLJJJJ;
                        if (c1221710hth3 != null && (num = c1221710hth3.LJ) != null) {
                            iIntValue2 = num.intValue();
                        }
                        if (iIntValue < iIntValue2) {
                            return;
                        }
                    }
                }
                ProfileAigcProgressAssem profileAigcProgressAssem = this.LL;
                profileAigcProgressAssem.LLJJJJ = c1221710hth;
                if (!profileAigcProgressAssem.Jo()) {
                    ProfileAigcProgressAssem profileAigcProgressAssem2 = this.LL;
                    if (!profileAigcProgressAssem2.LLJJIJIL) {
                        profileAigcProgressAssem2.LLJJIJIL = Intrinsics.LJFF(c1221710hth.LJI, "fast");
                    }
                }
                this.LL.dp(c1221710hth);
            }
        };
        this.LLJJJJJIL = EnumC1221780hto.GONE;
        this.LLJJL = new C11PQ<>();
    }

    public final void Ho() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(c19egLIZ) != null) {
                C632670Orh.LIZIZ(c19egLIZ, new C19719212De(2011955712, new AwS484S0200000_19(c19egLIZ, this, 7), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            c1397580mTM.LIZIZ(c19egLIZ.getResources().getString(2131820588));
            C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(c19egLIZ, this, 55));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final boolean Jo() {
        return C123100dR.LIZ(No());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11L2 c11l2 = this.LLJJJJLIIL;
        if (c11l2 != null) {
            c11l2.dispose();
        }
        BPEAHandler bPEAHandler = this.LLJJIJI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLJJIJI = null;
        AIGCAvatarServiceImpl.LIZIZ().fr(EnumC1221320ht4.SOCIAL, this.LLJJJ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        this.LLJJIII = true;
        C1221710hth c1221710hth = this.LLJJJJ;
        if (c1221710hth != null) {
            dp(c1221710hth);
        }
        if (Jo()) {
            return;
        }
        C1221710hth c1221710hth2 = this.LLJJJJ;
        this.LLJJIJIL = Intrinsics.LJFF(c1221710hth2 != null ? c1221710hth2.LJI : null, "fast");
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJIII = false;
    }

    public final boolean Go(List<AIGCQuota> list) {
        AIGCQuota next;
        Integer num;
        String str;
        Iterator<AIGCQuota> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                boolean z = this.LLJJIJIL;
                String str2 = next.quotaType;
                if (z) {
                    str = "fast";
                } else {
                    str = "slow";
                }
                if (Intrinsics.LJFF(str2, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AIGCQuota aIGCQuota = next;
        if (aIGCQuota == null || (num = aIGCQuota.quotaRemain) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final void Lo(Function1<? super List<AIGCQuota>, Unit> function1) {
        List<AIGCQuota> list = this.LLJJLIIIJLLLLLLLZ;
        if (list != null) {
            function1.invoke(list);
            return;
        }
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0NdI
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("ProfileAigcProgressAssem@18e8.getQuota$1");
                    List<AIGCQuota> listVq = AIGCAvatarServiceImpl.LIZIZ().Vq();
                    C1C7U.LIZIZ("ProfileAigcProgressAssem@18e8.getQuota$1");
                    return listVq;
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZI(new C11L5() { // from class: X.0hts
                @Override // X.C11L5
                public final void accept(Object obj, Object obj2) {
                    List<AIGCQuota> list2 = (List) obj;
                    ProfileAigcProgressAssem profileAigcProgressAssem = this.LIZ;
                    profileAigcProgressAssem.LLJJLIIIJLLLLLLLZ = list2;
                    profileAigcProgressAssem.LLJJL.onNext(list2);
                }
            });
        }
        this.LLJJL.LJJLJLI(new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 34));
    }

    public final String Oo(int i) {
        Resources resources;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (resources = c19egLIZ.getResources()) != null) {
            return resources.getString(i);
        }
        return null;
    }

    public final void bp(int i) {
        C19PO c19po = this.LLJILJIL;
        TuxTextView tuxTextView = null;
        if (c19po == null) {
            c19po = null;
        }
        c19po.setProgress(i);
        C19PO c19po2 = this.LLJILJIL;
        if (c19po2 == null) {
            c19po2 = null;
        }
        String string = c19po2.getContext().getString(2131820582, Integer.valueOf(i));
        TuxTextView tuxTextView2 = this.LLJILJILJ;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        tuxTextView.setText(string);
    }

    public final void dp(C1221710hth c1221710hth) {
        String str;
        List<String> list;
        List<AIGCQuota> list2;
        String str2;
        EnumC584810Mwh pathMode;
        if (!this.LLJJIII) {
            return;
        }
        int i = C1221760htm.LIZ[c1221710hth.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ProfileAigcProgressVM.vQ2(So(), EnumC1221770htn.IDLE, 0, c1221710hth.LIZIZ, c1221710hth.LIZLLL);
                            return;
                        } else {
                            ProfileAigcProgressVM.vQ2(So(), EnumC1221770htn.IDLE, 0, c1221710hth.LIZIZ, c1221710hth.LIZLLL);
                            return;
                        }
                    }
                    BPEAHandler bPEAHandler = this.LLJJIJI;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacksAndMessages(null);
                    }
                    this.LLJJIJI = null;
                    ProfileAigcProgressVM.vQ2(So(), EnumC1221770htn.FAILED, 0, c1221710hth.LIZIZ, c1221710hth.LIZLLL);
                    return;
                }
                So().setState(new C1221830htt(EnumC1221770htn.IN_QUEUE, 0, c1221710hth.LIZIZ, c1221710hth.LIZLLL, c1221710hth.LJII));
                return;
            }
            Integer num = c1221710hth.LJ;
            if (num != null) {
                ProfileAigcProgressVM.vQ2(So(), EnumC1221770htn.SUCCESSFUL, num.intValue(), c1221710hth.LIZIZ, c1221710hth.LIZLLL);
            }
            Context context = getContext();
            if (context == null) {
                return;
            }
            BPEAHandler bPEAHandler2 = this.LLJJIJI;
            if (bPEAHandler2 != null) {
                bPEAHandler2.removeCallbacksAndMessages(null);
            }
            this.LLJJIJI = null;
            C1221880hty c1221880hty = C1221880hty.LIZ;
            if (this.LLJJIJIL) {
                str = "fast";
            } else {
                str = "slow";
            }
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LLJJI);
            String enterFrom = getEnterFrom();
            String str3 = this.LLJJIJIIJIL;
            c1221880hty.getClass();
            C1221880hty.LIZIZ(lValueOf, str, "finish", enterFrom, str3);
            C1221610htX c1221610htX = new C1221610htX();
            C1221640hta c1221640hta = c1221710hth.LJFF;
            if (c1221640hta != null) {
                list = c1221640hta.LIZ;
            } else {
                list = null;
            }
            c1221610htX.setAvatarUris(list);
            C1221640hta c1221640hta2 = c1221710hth.LJFF;
            if (c1221640hta2 != null) {
                list2 = c1221640hta2.LIZIZ;
            } else {
                list2 = null;
            }
            c1221610htX.setRemainingQuota(list2);
            C1221640hta c1221640hta3 = c1221710hth.LJFF;
            if (c1221640hta3 != null) {
                str2 = c1221640hta3.LIZJ;
            } else {
                str2 = null;
            }
            c1221610htX.setTaskId(str2);
            String str4 = c1221710hth.LJI;
            if (str4 == null || (pathMode = c1221610htX.getPathMode(str4)) == null) {
                if (this.LLJJIJIL) {
                    pathMode = EnumC584810Mwh.FAST;
                } else {
                    pathMode = EnumC584810Mwh.SLOW;
                }
            }
            c1221610htX.setPathMode(pathMode);
            if (Jo()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    Intent intent = new Intent();
                    intent.putExtra("key_avatar_result", c1221610htX);
                    C2204961BRm.LLJJIJIL(201, intent, c19egLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDn+QkwqkzVbaGFn6eiPyZxY/MzYuvM8KzOIgFY28=", null));
                }
            } else {
                ((IProfileAIGCService) ServiceManager.get().getService(IProfileAIGCService.class)).LIZJ(context, EnumC1221910hu1.TOOLS_CREATION_FLOW, EnumC1221920hu2.AI_AVATAR_CREATING_PAGE, c1221610htX);
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 == null) {
                return;
            }
            c19egLIZ2.finish();
            return;
        }
        Integer num2 = c1221710hth.LJ;
        if (num2 == null) {
            return;
        }
        ProfileAigcProgressVM.vQ2(So(), EnumC1221770htn.GENERATING, num2.intValue(), c1221710hth.LIZIZ, c1221710hth.LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(X.C1221790htp r10) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem.ep(X.0htp):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        String str;
        String str2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view);
        this.LLJJI = SystemClock.elapsedRealtime();
        C1221800htq c1221800htq = (C1221800htq) this.LLJ.getValue();
        if (c1221800htq != null) {
            z = c1221800htq.LL;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new C1265780j2m(this, 4));
        }
        if (this.LLJJIJIL && Jo()) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            this.LLJJIJI = bPEAHandler;
            ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 105);
            SettingsManager.LIZLLL().getClass();
            C786410Ut5.LJLIIL(((long) SettingsManager.LJ("aigc_creative_fast_timeout", 20)) * 1000, bPEAHandler, aRunnableS119S0100000_19);
        }
        View viewFindViewById = view.findViewById(R.id.w0u);
        viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(viewFindViewById.getContext());
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 2238));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        if (this.LLJJIJIL) {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 4);
        } else {
            C786410Ut5.LLLLZLLLI(tuxNavBar, 0);
        }
        this.LLJI = tuxNavBar;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.s_0);
        this.LLJILLL = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.LJJJJI(32.0f);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.s9v);
        this.LLJILJIL = (C19PO) view.findViewById(R.id.s91);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C19PO c19po = this.LLJILJIL;
            if (c19po == null) {
                c19po = null;
            }
            c19po.setColor(iIntValue);
        }
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.s9w);
        this.LLJILJILJ = tuxTextView2;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.LJJJJI(32.0f);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.atk);
        if (this.LLJJIJIL) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(this, 160));
        this.LLJIJIL = c197039127h;
        if (No() == null) {
            AIGCAvatarServiceImpl.LIZIZ().cr(EnumC1221320ht4.SOCIAL, this.LLJJJ);
        } else {
            C1245090iVP.LIZ.getClass();
            Keva keva = (Keva) C1245090iVP.LIZIZ.getValue();
            C1222200huU.LIZ.getClass();
            keva.storeBoolean(C1222200huU.LIZ("has_shown_notification_permission"), false);
            C1524805y2.LIZ(new AwS563S0100000_19(this, 3137));
        }
        cp();
        ProfileAigcProgressVM profileAigcProgressVMSo = So();
        subscribe(profileAigcProgressVMSo, C736820SvI.LIZIZ(profileAigcProgressVMSo.usedInReusedScene), null, new AwS633S0100000_19(this, 128));
        C1221880hty c1221880hty = C1221880hty.LIZ;
        if (this.LLJJIJIL) {
            str = "fast";
        } else {
            str = "slow";
        }
        String enterFrom = getEnterFrom();
        C1221800htq c1221800htq2 = (C1221800htq) this.LLJ.getValue();
        if (c1221800htq2 == null || (str2 = c1221800htq2.LLILZIL) == null) {
            str2 = this.LLJJIJIIJIL;
        }
        c1221880hty.getClass();
        C1221880hty.LIZIZ(null, str, "show", enterFrom, str2);
    }

    public final void Zo(String str, boolean z) {
        int i;
        int i2;
        C197039127h c197039127h = this.LLJIJIL;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setText(str);
        C197039127h c197039127h3 = this.LLJIJIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        c197039127h3.setEnabled(z);
        C197039127h c197039127h4 = this.LLJIJIL;
        if (c197039127h4 == null) {
            c197039127h4 = null;
        }
        c197039127h4.setSupportClickWhenDisable(true);
        C197039127h c197039127h5 = this.LLJIJIL;
        if (c197039127h5 == null) {
            c197039127h5 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            i = R.attr.a04;
        } else {
            i = R.attr.bs;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        C197039127h c197039127h6 = this.LLJIJIL;
        if (c197039127h6 == null) {
            c197039127h6 = null;
        }
        c197039127h5.setBackground(c384050F3z.LIZ(c197039127h6.getContext()));
        C197039127h c197039127h7 = this.LLJIJIL;
        if (c197039127h7 != null) {
            c197039127h2 = c197039127h7;
        }
        if (z) {
            i2 = R.attr.ee;
        } else {
            i2 = R.attr.a1p;
        }
        c197039127h2.setTextColorRes(i2);
    }

    public final void ap(String str, boolean z) {
        int i;
        C197039127h c197039127h = this.LLJIJIL;
        C197039127h c197039127h2 = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setText(str);
        C197039127h c197039127h3 = this.LLJIJIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        c197039127h3.setEnabled(z);
        C197039127h c197039127h4 = this.LLJIJIL;
        if (c197039127h4 == null) {
            c197039127h4 = null;
        }
        c197039127h4.setSupportClickWhenDisable(true);
        C197039127h c197039127h5 = this.LLJIJIL;
        if (c197039127h5 == null) {
            c197039127h5 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        C197039127h c197039127h6 = this.LLJIJIL;
        if (c197039127h6 == null) {
            c197039127h6 = null;
        }
        c197039127h5.setBackground(c384050F3z.LIZ(c197039127h6.getContext()));
        C197039127h c197039127h7 = this.LLJIJIL;
        if (c197039127h7 != null) {
            c197039127h2 = c197039127h7;
        }
        if (z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1p;
        }
        c197039127h2.setTextColorRes(i);
    }
}
