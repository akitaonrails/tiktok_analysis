package com.ss.android.ugc.aweme.notification.service;

import X.AbstractC1538690q8x;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C0C64;
import X.C0OKU;
import X.C0OOI;
import X.C0OOY;
import X.C0OP4;
import X.C0OP5;
import X.C0OP7;
import X.C0OPB;
import X.C0OPC;
import X.C0OPE;
import X.C0OPQ;
import X.C0OPX;
import X.C0PEM;
import X.C0XQ7;
import X.C11NZ;
import X.C11PQ;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C13IQ;
import X.C13LE;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1618770sE7;
import X.C1720106oR;
import X.C19348710mr;
import X.C19374310qz;
import X.C19475711Hn;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C604740Nnk;
import X.C604750Nnl;
import X.C617040OIc;
import X.C618480ONq;
import X.C618830OOz;
import X.C618910OPh;
import X.C786410Ut5;
import X.EnumC19356310o5;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinCreateFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.task.BulletinBoardInitAssem;
import com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBaseAccountInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardServiceImpl implements IBulletinBoardService {
    public final C0OP7 LIZ = new C0OPB() { // from class: X.0OP7
        /* JADX WARN: Type inference failed for: r0v0, types: [X.0OP9] */
        @Override // X.C0OPB
        public final C0OP9 LIZ(final Context context) {
            return new C0OR3(context) { // from class: X.0OP9
                public final Context LL;
                public Function0<Unit> LLILLJJLI;
                public Function1<? super EnumC617010OHz, Unit> LLILLL;
                public Function0<C604870Nnx> LLILZ;

                @Override // X.C0OR3
                public final Context getCtx() {
                    return this.LL;
                }

                @Override // X.C0OR3
                public final Function0<Unit> getInviteClickListener() {
                    return this.LLILLJJLI;
                }

                @Override // X.C0OR3
                public final Function1<EnumC617010OHz, Unit> getSubscribeChangeListener() {
                    return this.LLILLL;
                }

                @Override // X.C0OR3
                public final Function0<C604870Nnx> getTracker() {
                    return this.LLILZ;
                }

                {
                    this.LL = context;
                }

                @Override // X.C0OR3
                public final void setInviteClickListener(Function0<Unit> function0) {
                    this.LLILLJJLI = function0;
                }

                @Override // X.C0OR3
                public final void setSubscribeChangeListener(Function1<? super EnumC617010OHz, Unit> function1) {
                    this.LLILLL = function1;
                }

                @Override // X.C0OR3
                public final void setTracker(Function0<C604870Nnx> function0) {
                    this.LLILZ = function0;
                }
            };
        }

        @Override // X.C0OPB
        public final C616980OHw LIZIZ(C0OR4 c0or4) {
            if (c0or4 instanceof C0OR2) {
                return new C616980OHw((C0OR2) c0or4);
            }
            "BulletinInviteButton is not cast as any".toString();
            throw new IllegalStateException("BulletinInviteButton is not cast as any");
        }
    };

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return C13LE.LIZ(BulletinBoardInitAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJFF() {
        C604750Nnl.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardAutoShareDataManager", "requestBulletinBaseInfo");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C604740Nnk(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LJI() {
        C604750Nnl.LIZ.getClass();
        return C604750Nnl.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIIIIZZ() {
        if (C0OPE.LIZ.compareAndSet(false, true)) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.0zDP
                @Override // X.AbstractC1538690q8x
                public final String LJI() {
                    return "bulletinHybridHandler";
                }

                @Override // X.AbstractC1538690q8x
                public final void LJ(SparkContext sparkContext, String str) {
                    super.LJ(sparkContext, str);
                    if (!((Boolean) C279020Awe.LIZ.getValue()).booleanValue()) {
                        return;
                    }
                    sparkContext.LJJJJZI(new C19336810kw(2));
                }
            };
            c1537900q7g.getClass();
            C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIIIZ() {
        String uid;
        C0OP4.LIZ.getClass();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            return;
        }
        Intrinsics.LJFF(C0OP4.LIZIZ, uid);
        C0OP4.LIZIZ = uid;
        Keva kevaLIZ = C0OP4.LIZ();
        kevaLIZ.storeInt("has_profile_banner_show_times", kevaLIZ.getInt("has_profile_banner_show_times", 0) + 1);
        kevaLIZ.storeLong("last_profile_banner_show_time", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C11NZ<Boolean> LJIIJJI() {
        C604750Nnl c604750Nnl = C604750Nnl.LIZ;
        C11PQ<Boolean> c11pqLJLLLLLL = C604750Nnl.LIZIZ;
        if (c11pqLJLLLLLL == null) {
            c604750Nnl.getClass();
            c11pqLJLLLLLL = C11PQ.LJLLLLLL(Boolean.valueOf(C604750Nnl.LIZ()));
        } else {
            c604750Nnl.getClass();
        }
        if (C604750Nnl.LIZIZ == null) {
            C604750Nnl.LIZIZ = c11pqLJLLLLLL;
        }
        return new C19475711Hn(c11pqLJLLLLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI() {
        /*
            r8 = this;
            X.0OP4 r0 = X.C0OP4.LIZ
            r0.getClass()
            boolean r0 = X.C0OPC.LIZ()
            r4 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "this user isn't creator"
            X.C0OPX.LJII(r0)
        L11:
            return r4
        L12:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto L11
            java.lang.String r0 = X.C0OP4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L2e
            X.C0OP4.LIZJ = r4
        L2e:
            boolean r0 = X.C0OP4.LIZJ
            if (r0 != 0) goto L11
            boolean r0 = X.C0OPC.LIZ()
            if (r0 == 0) goto L4a
            X.0OKU r0 = X.C0OKU.LIZ
            r0.getClass()
            X.C0OKU.LIZIZ()
            boolean r0 = X.C0OKU.LIZJ
            if (r0 == 0) goto L4a
            java.lang.String r0 = "this user have already created bulletin board"
            X.C0OPX.LJII(r0)
            return r4
        L4a:
            com.bytedance.keva.Keva r7 = X.C0OP4.LIZ()
            java.lang.String r0 = "last_banner_show_time"
            r5 = -1
            long r1 = r7.getLong(r0, r5)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto La4
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            X.0OP8 r0 = X.C0OP8.LIZ
            r0.getClass()
            X.01GW r0 = X.C0OP8.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinCreateProcessOptConfiguration r0 = (com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinCreateProcessOptConfiguration) r0
            java.lang.Long r0 = r0.profileBannerFrequencyInterval
            if (r0 == 0) goto La0
            long r2 = r0.longValue()
        L74:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 * r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto La4
            r2 = 1
        L7d:
            java.lang.String r0 = "has_profile_banner_show_times"
            int r1 = r7.getInt(r0, r4)
            X.0OP8 r0 = X.C0OP8.LIZ
            r0.getClass()
            X.01GW r0 = X.C0OP8.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinCreateProcessOptConfiguration r0 = (com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinCreateProcessOptConfiguration) r0
            java.lang.Integer r0 = r0.profileBannerMaxShowCount
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L98:
            if (r1 >= r0) goto L11
            if (r2 != 0) goto L11
            r4 = 1
            return r4
        L9e:
            r0 = 2
            goto L98
        La0:
            r2 = 172800(0x2a300, double:8.53745E-319)
            goto L74
        La4:
            r2 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.BulletinBoardServiceImpl.LJIJI():boolean");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LIZ() {
        return C0OPC.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "is_bulletin_channel_created", true, true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LJIILL() {
        if (!C617040OIc.LIZ() || !C0OPC.LIZ()) {
            return false;
        }
        C0OKU.LIZ.getClass();
        return C0OKU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LLIL() {
        return C0OPC.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LLILIL() {
        if (!C0OPC.LIZ()) {
            return false;
        }
        C0OKU.LIZ.getClass();
        return !C0OKU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean e0() {
        return C617040OIc.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean isPrivateAccount() {
        Integer numLIZ;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        return (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("private_account")) == null || numLIZ.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C0OPB LJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final String LJIIZILJ(long j) {
        return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIJ(boolean z) {
        Long lValueOf;
        BulletinBoardInfo accountInfo;
        C604750Nnl.LIZ.getClass();
        BulletinBaseAccountInfo bulletinBaseAccountInfo = C604750Nnl.LIZJ;
        if (bulletinBaseAccountInfo != null && (accountInfo = bulletinBaseAccountInfo.getAccountInfo()) != null) {
            lValueOf = Long.valueOf(accountInfo.bulletinId);
            if (lValueOf != null && lValueOf.longValue() != -1) {
                C604750Nnl.LIZIZ(lValueOf.toString(), "post", "video_post_page", z);
                return;
            }
        } else {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobBulletinAutoShareShow need bbId, but ");
        sbLIZ.append(lValueOf);
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIJJ(boolean z) {
        C604750Nnl.LIZ.getClass();
        C604750Nnl.LJI(z, true);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final TuxSheet LIZJ(Bundle bundle, FragmentManager fragmentManager) {
        BulletinPageFragment.LLJZIJLIL.getClass();
        if (fragmentManager == null) {
            return null;
        }
        BulletinPageFragment bulletinPageFragment = new BulletinPageFragment();
        C786410Ut5.LJJJI("open_type", "half_screen", bundle);
        bulletinPageFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = bulletinPageFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.show(fragmentManager, "BulletinPageFragment");
        return tuxSheet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creation.config.DMMediaAuthConfig> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0OP6
            if (r0 == 0) goto L22
            r5 = r15
            X.0OP6 r5 = (X.C0OP6) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r6 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            int r14 = r5.LL
            goto L59
        L22:
            X.0OP6 r5 = new X.0OP6
            r5.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r6)
            X.0OPh r0 = X.C618910OPh.LIZ     // Catch: java.lang.Exception -> L87
            r0.getClass()     // Catch: java.lang.Exception -> L87
            X.0OOI r0 = X.C618910OPh.LJ()     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L43
            java.lang.Long r0 = r0.P62()     // Catch: java.lang.Exception -> L87
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L85
            long r1 = r0.longValue()     // Catch: java.lang.Exception -> L87
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L87
            r5.LL = r14     // Catch: java.lang.Exception -> L87
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L87
            java.lang.Object r6 = r0.LJJIJ(r1, r3, r5)     // Catch: java.lang.Exception -> L87
            if (r6 != r4) goto L5c
            return r4
        L59:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L87
        L5c:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse r6 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse) r6     // Catch: java.lang.Exception -> L87
            com.ss.android.ugc.aweme.creation.config.DMMediaAuthConfig r4 = new com.ss.android.ugc.aweme.creation.config.DMMediaAuthConfig     // Catch: java.lang.Exception -> L87
            com.ss.android.ugc.aweme.creation.config.DMImageAuthConfig r3 = new com.ss.android.ugc.aweme.creation.config.DMImageAuthConfig     // Catch: java.lang.Exception -> L87
            java.lang.String r5 = r6.serviceId     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r6.uploadDomain     // Catch: java.lang.Exception -> L87
            com.ss.android.ugc.aweme.creation.config.DMMediaAuthToken r7 = new com.ss.android.ugc.aweme.creation.config.DMMediaAuthToken     // Catch: java.lang.Exception -> L87
            java.lang.String r8 = r6.accessKey     // Catch: java.lang.Exception -> L87
            java.lang.String r9 = r6.token     // Catch: java.lang.Exception -> L87
            java.lang.String r10 = r6.secretAccessKey     // Catch: java.lang.Exception -> L87
            long r0 = r6.expiredTime     // Catch: java.lang.Exception -> L87
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L87
            long r0 = r6.currentTime     // Catch: java.lang.Exception -> L87
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L87
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L87
            r3.<init>(r5, r2, r7)     // Catch: java.lang.Exception -> L87
            r0 = 0
            r4.<init>(r14, r0, r3)     // Catch: java.lang.Exception -> L87
            return r4
        L85:
            r0 = 0
            return r0
        L87:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getPhotoUploadConfig() error:"
            r1.append(r0)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.getMessage()
        L9e:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "BulletinRepository"
            X.C1720106oR.LJI(r0, r1)
            r0 = 0
            return r0
        Lac:
            r0 = 0
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.BulletinBoardServiceImpl.LIZLLL(int, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIILJJIL(boolean z, boolean z2) {
        Long lValueOf;
        BulletinBoardInfo accountInfo;
        C604750Nnl.LIZ.getClass();
        BulletinBaseAccountInfo bulletinBaseAccountInfo = C604750Nnl.LIZJ;
        if (bulletinBaseAccountInfo != null && (accountInfo = bulletinBaseAccountInfo.getAccountInfo()) != null) {
            lValueOf = Long.valueOf(accountInfo.bulletinId);
            if (lValueOf != null && lValueOf.longValue() != -1) {
                C604750Nnl.LIZJ(Boolean.valueOf(z2), lValueOf.toString(), "post", "video_post_page", z);
                return;
            }
        } else {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobBulletinAutoShareShow need bbId, but ");
        sbLIZ.append(lValueOf);
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LLILII(String str, boolean z) {
        C0OPQ.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("create_bulletin_board_entrance_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        C618910OPh.LIZ.getClass();
        C0OOI c0ooiLJ = C618910OPh.LJ();
        if (c0ooiLJ != null) {
            return c0ooiLJ.LLZZJLIL(str, interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void d0(Aweme aweme, Map<String, String> map) {
        C618910OPh.LIZ.getClass();
        C0OOI c0ooiLJ = C618910OPh.LJ();
        if (c0ooiLJ != null) {
            c0ooiLJ.d0(aweme, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LJII(Context context, String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C618910OPh c618910OPh = C618910OPh.LIZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            return c618910OPh.LJIILIIL(context, lLJIILIIL.longValue(), null, null, interfaceC1364105Vn);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIILIIL(Activity activity, Bundle bundle, Function0<Unit> function0) {
        if (LLILIL()) {
            BulletinCreateFragment.LLIZLLLIL.getClass();
            C618480ONq.LIZ(activity, bundle, function0);
            String string = bundle.getString("enter_method");
            if (string == null) {
                string = "notice";
            }
            String string2 = bundle.getString("enter_from");
            if (string2 == null) {
                string2 = "notification_page";
            }
            C0OPQ.LJIILIIL(C0OPQ.LIZ, string, null, string2, 2);
            C0OP5 c0op5 = C0OP5.LJI;
            c0op5.LJIIIIZZ();
            if (c0op5.LJFF()) {
                C0OP5.LJII.LIZJ();
                C0OP5.LJIIIZ.LIZJ();
                C0OP5.LJIIJ = string;
                return;
            }
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(C1618770sE7.LIZJ(2131828091));
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[PHI: r10
      0x00cc: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:38:0x00ca, B:36:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(androidx.lifecycle.LifecycleOwner r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r23) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.BulletinBoardServiceImpl.LJIILLIIL(androidx.lifecycle.LifecycleOwner, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LLILL(Activity activity, View view, String str, Function0<Unit> function0) {
        if (LLILIL()) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "notification_page", bundle);
            C786410Ut5.LJJJI("enter_method", str, bundle);
            LJIILIIL(activity, bundle, function0);
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(C1618770sE7.LIZJ(2131828091));
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LJIIJ(Context context, String str, String str2, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            return C618910OPh.LIZ.LJIIIIZZ(context, lLJIILIIL.longValue(), str2, z, map, null, null, null, null, interfaceC1364105Vn);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, String str, String str2, BaseSharePackage baseSharePackage, int i, boolean z, String str3, int i2, String str4, Function1<? super HashMap<String, String>, Unit> function1, Aweme aweme) {
        C0OOY.LIZ.getClass();
        C23250099c.LIZLLL(C0OOY.LJIIIIZZ, C0PEM.LIZJ, null, new C618830OOz(lifecycleOwner, str, i2, function1, baseSharePackage, str3, str4, aweme, z, i, str2, null), 2);
    }
}
