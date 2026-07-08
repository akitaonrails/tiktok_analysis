package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC1261840iwQ;
import X.AnonymousClass0950;
import X.C01GW;
import X.C09IC;
import X.C09IR;
import X.C0AJJ;
import X.C0AJK;
import X.C0N58;
import X.C1075800e6M;
import X.C1261490ivr;
import X.C1261650iw7;
import X.C1261690iwB;
import X.C1261740iwG;
import X.C1261770iwJ;
import X.C1261860iwS;
import X.C1261870iwT;
import X.C1262300ixA;
import X.C1262320ixC;
import X.C1262490ixT;
import X.C1263080iyQ;
import X.C1264320j0Q;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2252331DDr;
import X.C23250099c;
import X.C2344009Gk;
import X.C299940BpI;
import X.C304890BxH;
import X.C447550Hgn;
import X.C452501pT;
import X.C491101vh;
import X.C786410Ut5;
import X.C888460YtI;
import X.C985403tE;
import X.DialogInterfaceOnClickListenerC1265860j2u;
import X.EnumC2252401DDy;
import X.InterfaceC1261750iwH;
import X.InterfaceC1262230ix3;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreByTriadCooldownConfigModel;
import com.ss.android.ugc.aweme.relation.usercard.config.AuthCardFreqParams;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS103S1000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS4S3200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class UserCardListAbility implements IUserCardListAbility {
    public final C1262300ixA LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final boolean LLILLL;
    public final IMafUserApi LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final AtomicBoolean LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final AnonymousClass0950 LLJ;
    public final Set<InterfaceC1261750iwH> LLJI;
    public C1075800e6M LLJIJIL;
    public final Set<String> LLJILJIL;

    public UserCardListAbility() {
        throw null;
    }

    public final C1263080iyQ LIZIZ() {
        return (C1263080iyQ) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void hV() {
        this.LLIZLLLIL.LIZJ(Unit.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void onCleared() {
        this.LLJI.clear();
        ((ConcurrentHashMap) this.LLILZLL.getValue()).clear();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final AnonymousClass0950 ND2() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final Set<String> Nr2() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final C1262300ixA getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final C1075800e6M getState() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
        this.LLJI.add(interfaceC1261750iwH);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final int H40(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1261840iwQ) {
            return LIZIZ().indexOf(((AbstractC1261840iwQ) interfaceC1891350zJl).LIZIZ());
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final boolean HP0(String str) {
        if (LIZIZ().LLJILJIL.contains(str)) {
            return false;
        }
        LIZIZ().LLJILJIL.add(str);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void K70(C1075800e6M c1075800e6M) {
        this.LLJIJIL = c1075800e6M;
        if (c1075800e6M.LIZ instanceof C1623706Xj) {
            ((ConcurrentHashMap) this.LLILZLL.getValue()).clear();
            this.LLJILJIL.clear();
            this.LLIZ.set(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void cN1(InterfaceC1262230ix3 interfaceC1262230ix3) {
        if (interfaceC1262230ix3 instanceof C1261860iwS) {
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1261690iwB(interfaceC1262230ix3, this, null), 3);
        } else if (interfaceC1262230ix3 instanceof C1261770iwJ) {
            C1261770iwJ c1261770iwJ = (C1261770iwJ) interfaceC1262230ix3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("social_permission_card_freq_");
            sbLIZ.append(C1261740iwG.LIZ());
            Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            AuthCardFreqParams authCardFreqParams = new AuthCardFreqParams(10, 14, 14, 3);
            if (!c1261770iwJ.LLILLJJLI.LIZLLL) {
                int i = repo.getInt(C1261740iwG.LIZIZ(c1261770iwJ, "key_delete_count_"), 0) + 1;
                repo.storeInt(C1261740iwG.LIZIZ(c1261770iwJ, "key_delete_count_"), i);
                repo.storeInt(C1261740iwG.LIZIZ(c1261770iwJ, "key_exp_count_"), 0);
                repo.storeLong(C1261740iwG.LIZIZ(c1261770iwJ, "key_auto_hide_ts_"), -1L);
                if (i >= authCardFreqParams.maxDeleteCount) {
                    repo.storeLong(C1261740iwG.LIZIZ(c1261770iwJ, "key_delete_hide_ts_"), -1L);
                } else {
                    repo.storeLong(C1261740iwG.LIZIZ(c1261770iwJ, "key_delete_hide_ts_"), System.currentTimeMillis());
                }
            }
        }
        LIZIZ().remove(interfaceC1262230ix3);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void dL0(C1261860iwS c1261860iwS) {
        if (it2(c1261860iwS.getUid())) {
            return;
        }
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track rec more highlighted and dismissed ");
        sbLIZ.append(c1261860iwS.getNickname());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZ("ListAbility", strLIZIZ);
        Set<String> set = LIZIZ().LLJIJIL;
        String uid = c1261860iwS.getUid();
        if (uid == null) {
            uid = "";
        }
        ((CopyOnWriteArraySet) set).add(uid);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final boolean it2(String str) {
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track rec more, uid set size ");
        sbLIZ.append(((CopyOnWriteArraySet) LIZIZ().LLJIJIL).size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZ("ListAbility", strLIZIZ);
        return ((CopyOnWriteArraySet) LIZIZ().LLJIJIL).contains(str);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
        this.LLJI.remove(interfaceC1261750iwH);
    }

    @C14EU(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        User user2 = c888460YtI.LIZ;
        if (user2 == null) {
            return;
        }
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on block: ");
        sbLIZ.append(user2.getUid());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL("ListAbility", strLIZIZ);
        int i = 0;
        for (Object obj : LIZIZ()) {
            String uid = null;
            if ((obj instanceof C1261860iwS) && (user = (User) obj) != null) {
                uid = user.getUid();
            }
            if (Intrinsics.LJFF(uid, user2.getUid())) {
                if (i >= 0) {
                    InterfaceC1262230ix3 interfaceC1262230ix3Remove = LIZIZ().remove(i);
                    if (interfaceC1262230ix3Remove instanceof C1261860iwS) {
                        rz((C1261860iwS) interfaceC1262230ix3Remove);
                    }
                    C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("remove item: ");
                    sbLIZ2.append(interfaceC1262230ix3Remove);
                    sbLIZ2.append(" by blocked!");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1264320j0Q2.getClass();
                    C1264320j0Q.LIZLLL("ListAbility", strLIZIZ2);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void rz(C1261860iwS c1261860iwS) {
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1261870iwT(c1261860iwS, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void v52(Function1<? super InterfaceC1261750iwH, Unit> function1) {
        C447550Hgn.LIZLLL(new AwS420S0200000_19(this, (UserCardListAbility) function1, (Function1<? super InterfaceC1261750iwH, Unit>) 95));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void Tr2(C1261650iw7 c1261650iw7, boolean z) {
        if (!C304890BxH.LIZIZ()) {
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZLLL("ListAbility", "rec more not enabled!");
            return;
        }
        if (!c1261650iw7.LLILZIL.isAccuratePrivateAccount() && !c1261650iw7.LLILZIL.isProAccount) {
            C1262300ixA c1262300ixA = this.LL;
            C1262320ixC c1262320ixC = c1262300ixA.listConfig;
            if (c1262320ixC.LIZ == 401 && !c1262300ixA.trackerConfig.LJFF && c1262320ixC.LJFF) {
                if (!C447550Hgn.LJ(C1262490ixT.LIZJ(c1262300ixA)) && !z) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZLLL("ListAbility", "not active or from profile");
                    return;
                }
                if (((Boolean) C0AJJ.LIZ.getValue()).booleanValue()) {
                    if (System.currentTimeMillis() > C0N58.LIZ().getLong("daily_cooldown_next_show", -1L)) {
                        C0N58.LIZ().erase("daily_cooldown_next_show");
                    } else {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZLLL("ListAbility", "daily cooldown hit!");
                        return;
                    }
                }
                if (((Boolean) C0AJK.LIZ.getValue()).booleanValue()) {
                    long j = C0N58.LIZIZ().getLong("feature_cooldown_next_show", -1L);
                    if (j > 0) {
                        if (System.currentTimeMillis() > j) {
                            C0N58.LIZIZ().erase("feature_cooldown_next_show");
                            int length = ((RecMoreByTriadCooldownConfigModel) C0N58.LIZIZ.getValue()).featureCooldownNoActionThresholds.length;
                            if (length < 1) {
                                length = 1;
                            }
                            C0N58.LIZIZ().storeInt("feature_cooldown_stage", (C0N58.LIZIZ().getInt("feature_cooldown_stage", 0) + 1) % length);
                            C0N58.LIZIZ().storeInt("feature_cooldown_in_stage_count", 0);
                        } else {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZLLL("ListAbility", "feature cooldown hit!");
                            return;
                        }
                    }
                }
                if (c1261650iw7.LLILZIL.isRelatedRec()) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZLLL("ListAbility", "The followed user is from rec more, skip!");
                    return;
                }
                if (this.LLJIJIL.LIZ instanceof C1623706Xj) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZLLL("ListAbility", "In the middle of refresh, skip!");
                    return;
                }
                C1261860iwS c1261860iwS = c1261650iw7.LLILZIL;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLILZLL.getValue();
                Object obj = concurrentHashMap.get(c1261860iwS);
                if (obj == null) {
                    obj = C491101vh.LIZ;
                }
                if (!(obj instanceof C1623706Xj) && !(obj instanceof C1623606Xi)) {
                    if (!this.LLIZ.compareAndSet(false, true)) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZLLL("ListAbility", "one request loading ongoing");
                        return;
                    } else {
                        concurrentHashMap.put(c1261860iwS, new C1623706Xj());
                        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1261490ivr(this, c1261860iwS, concurrentHashMap, null), 3);
                        return;
                    }
                }
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZLLL("ListAbility", "already loading or success");
                return;
            }
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZLLL("ListAbility", "limit recommend more user!");
            return;
        }
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("ListAbility", "user is private or pro account");
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void eZ(C1261860iwS c1261860iwS, String str) {
        String str2;
        List<String> urlList;
        String str3 = str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("to_user_id", c1261860iwS.getUid());
        C20684815ws.LJIILLIIL("block", c2344009Gk.LIZ);
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("ListAbility", "");
        AwS4S3200000_19 awS4S3200000_19 = new AwS4S3200000_19(this, c1261860iwS.getUid(), c1261860iwS.getSecUid(), c1261860iwS, str3, 0);
        DialogInterfaceOnClickListenerC1265860j2u dialogInterfaceOnClickListenerC1265860j2u = new DialogInterfaceOnClickListenerC1265860j2u(awS4S3200000_19, new AwS103S1000000_19(str3, 0), 0);
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            String nickname = c1261860iwS.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            String uniqueId = c1261860iwS.getUniqueId();
            if (uniqueId == null) {
                uniqueId = "";
            }
            String strJ4 = C786410Ut5.j4(activityLJFF.getResources().getString(2131822979), Arrays.copyOf(new Object[]{uniqueId, nickname}, 2));
            if (C299940BpI.LIZ()) {
                IBlockService iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi$default(IBlockService.class, false, false, false, 14, null);
                if (iBlockService != null) {
                    UrlModel avatarThumb = c1261860iwS.getAvatarThumb();
                    if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
                        ListProtector.get(urlList, 0);
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    iBlockService.LIZLLL(activityLJFF, uniqueId, str3, awS4S3200000_19);
                    return;
                }
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activityLJFF);
            c1397580mTM.LJI(strJ4);
            c1397580mTM.LIZ(2131822978);
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(dialogInterfaceOnClickListenerC1265860j2u, 237));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public UserCardListAbility(C1262300ixA c1262300ixA, InterfaceC497601wk interfaceC497601wk, C01GW c01gw) {
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
        this.LL = c1262300ixA;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = true;
        this.LLILZ = mafUserApiService;
        this.LLILZIL = c01gw;
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(683));
        this.LLIZ = new AtomicBoolean(false);
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 1, EnumC2252401DDy.DROP_OLDEST);
        this.LLIZLLLIL = c2252331DDrLIZ;
        this.LLJ = C09IC.LIZ(c2252331DDrLIZ);
        this.LLJI = new LinkedHashSet();
        this.LLJIJIL = new C1075800e6M(null, 7);
        this.LLJILJIL = new LinkedHashSet();
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C09ZC
            if (r0 == 0) goto L62
            r5 = r11
            X.09ZC r5 = (X.C09ZC) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r6 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L27
            if (r0 == r2) goto L3a
            if (r0 != r6) goto L68
            X.C155000ia.LIZIZ(r1)
        L26:
            return r3
        L27:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L40
            X.08mF r0 = new X.08mF     // Catch: java.lang.Exception -> L40
            r0.<init>(r8, r9, r10, r3)     // Catch: java.lang.Exception -> L40
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L40
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)     // Catch: java.lang.Exception -> L40
            if (r1 != r4) goto L3d
            goto L70
        L3a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L40
        L3d:
            com.ss.android.ugc.aweme.profile.model.BlockStruct r1 = (com.ss.android.ugc.aweme.profile.model.BlockStruct) r1     // Catch: java.lang.Exception -> L40
            return r1
        L40:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            r0.getClass()
            java.lang.String r1 = "ListAbility"
            java.lang.String r0 = "Error on block user"
            X.C1264320j0Q.LIZIZ(r1, r0, r2)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01mo r0 = new X.01mo
            r0.<init>(r3)
            r5.LLILLL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L26
            return r4
        L62:
            X.09ZC r5 = new X.09ZC
            r5.<init>(r7, r11)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility.LIZ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
