package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C04TD;
import X.C0OGM;
import X.C1023500ck0;
import X.C19406010w6;
import X.C1BWL;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2246191Cvp;
import X.C2249271D1x;
import X.C2249281D1y;
import X.C452501pT;
import X.InterfaceC1023650ckF;
import Y.AfS195S0100000_26;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.CommercePageTrackingServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class CommercePageTrackingServiceImpl implements ICommercePageTrackingService {
    public Aweme LIZIZ;
    public Aweme LIZJ;
    public C2246191Cvp LIZLLL;
    public AwemeRawAd LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(30));
    public Integer LJIIIZ = 0;

    public final void LJIIL() {
        this.LJIJ = true;
        this.LJIIZILJ = false;
        this.LJIIL = 0L;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJIL = 0;
    }

    public static ICommercePageTrackingService LJ() {
        Object objLIZ = C04TD.LIZ(ICommercePageTrackingService.class, false);
        if (objLIZ != null) {
            return (ICommercePageTrackingService) objLIZ;
        }
        if (C04TD.LJJLIIIJLLLLLLLZ == null) {
            synchronized (ICommercePageTrackingService.class) {
                if (C04TD.LJJLIIIJLLLLLLLZ == null) {
                    C04TD.LJJLIIIJLLLLLLLZ = new CommercePageTrackingServiceImpl();
                }
            }
        }
        return C04TD.LJJLIIIJLLLLLLLZ;
    }

    public final C2249271D1x LJFF() {
        return (C2249271D1x) this.LIZ.getValue();
    }

    public final boolean LJIIIIZZ() {
        Integer num = this.LJIIIZ;
        return num == null || num.intValue() != this.LJIIIIZZ || this.LJIIIIZZ == 0;
    }

    public final void LJIIIZ() {
        C2249271D1x c2249271D1xLJFF;
        C2246191Cvp c2246191Cvp = this.LIZLLL;
        if (c2246191Cvp != null && (c2249271D1xLJFF = LJFF()) != null) {
            c2249271D1xLJFF.LJ(this.LJ, LJII(c2246191Cvp.LIZIZ, false), this.LJIILLIIL, this.LJIIIIZZ, this.LIZIZ);
        }
        LJIILIIL();
    }

    public final void LJIIJ() {
        String str;
        if (this.LIZLLL != null) {
            LJIIIZ();
            if (this.LJIJ || (str = this.LJFF) == null) {
                return;
            }
            C2249271D1x c2249271D1xLJFF = LJFF();
            if (c2249271D1xLJFF != null) {
                c2249271D1xLJFF.LJJIIZI(this.LJ, str, LJI(), this.LJIL);
            }
            LJIIL();
        }
    }

    public final void LJIIJJI() {
        C2249271D1x c2249271D1xLJFF;
        if (this.LIZLLL != null && (c2249271D1xLJFF = LJFF()) != null) {
            c2249271D1xLJFF.LJJIIJ(this.LJ, LJII(0L, true), this.LJIILLIIL, this.LJIIIIZZ, this.LIZIZ);
        }
        LJIILIIL();
    }

    public final void LJIILIIL() {
        Aweme aweme = this.LIZIZ;
        this.LIZLLL = new C2246191Cvp(aweme != null ? aweme.getAid() : null, SystemClock.uptimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.ICommercePageTrackingService
    public final C2249271D1x LIZLLL() {
        return LJFF();
    }

    public final long LJI() {
        return (SystemClock.uptimeMillis() - this.LJIIJ) - this.LJIIL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c8, code lost:
    
        r3 = LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01cc, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ce, code lost:
    
        r3.LJJIJ(r10.LJ, "user_draw_video", r10.LJII, r10.LJIIIIZZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01da, code lost:
    
        if (r10.LJIIIIZZ != 4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r10.LJIILJJIL, "video_music_icon") != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e5, code lost:
    
        LJIIJ();
        r10.LJIILLIIL = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r1.equals("video_profile_pic") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012a, code lost:
    
        if (r1.equals("video_swipe_left") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0132, code lost:
    
        if (r1.equals("video_name") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0146, code lost:
    
        if (r1.equals("video_music_icon") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ICommercePageTrackingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1401260mZI r11) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.CommercePageTrackingServiceImpl.LIZ(X.0mZI):void");
    }

    @Override // com.ss.android.ugc.aweme.ICommercePageTrackingService
    public final void LIZIZ(String str) {
        AwemeRawAd awemeRawAd;
        Boolean boolValueOf;
        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str);
        if (awemeEr == null || (awemeRawAd = awemeEr.getAwemeRawAd()) == null) {
            return;
        }
        this.LJ = awemeRawAd;
        this.LJIIIIZZ = awemeRawAd.getTiktokPageType();
        if (!AwemeExtKt.isAdTraffic(awemeEr)) {
            return;
        }
        this.LIZJ = awemeEr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAdPageTrackingAweme, itemID:");
        sbLIZ.append(str);
        sbLIZ.append(", isAd:");
        Aweme aweme = this.LIZJ;
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(aweme));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", tiktokPageType:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", rawAdData:");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ICommercePageTrackingService
    public final void LIZJ(C19406010w6 c19406010w6) {
        C2249271D1x c2249271D1xLJFF;
        C2249271D1x c2249271D1xLJFF2;
        String str;
        C2249271D1x c2249271D1xLJFF3;
        C0OGM c0ogm;
        Integer numValueOf;
        Integer num;
        boolean z;
        String aid;
        this.LJFF = c19406010w6.LIZJ;
        this.LJI = c19406010w6.LIZLLL;
        this.LJII = c19406010w6.LJ;
        Integer num2 = c19406010w6.LIZ;
        this.LJIIIZ = num2;
        Boolean boolValueOf = null;
        if (num2 != null && num2.intValue() == 4) {
            Aweme aweme = c19406010w6.LIZIZ;
            if (aweme == null) {
                z = true;
            } else {
                z = false;
            }
            this.LJIJJ = z;
            if (this.LIZJ == null) {
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                LIZIZ(aid);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackConversionPageEventIfNeeded, currentPageType:");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", adAweme:");
        Aweme aweme2 = this.LIZJ;
        if (aweme2 != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(aweme2));
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", tiktokPageType:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", rawAdData:");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LJIIIIZZ()) {
            if (Intrinsics.LJFF(this.LJI, "page_visit")) {
                ComponentCallbacks2 previousActivity = ActivityStack.getPreviousActivity();
                if ((previousActivity instanceof C0OGM) && (c0ogm = (C0OGM) previousActivity) != null && (numValueOf = Integer.valueOf(c0ogm.getPageType())) != null && numValueOf.intValue() == -1 && ((num = c19406010w6.LIZ) == null || num.intValue() != 4)) {
                    return;
                }
            }
            if ((!this.LJIIZILJ || this.LJIJ) && !Intrinsics.LJFF(this.LJI, "page_visit")) {
                return;
            }
            C1BWL.LIZ().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.1Cvo
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    C0OGM c0ogm2;
                    Integer numValueOf2;
                    String str2;
                    if (!this.LL.LJIIIIZZ()) {
                        CommercePageTrackingServiceImpl commercePageTrackingServiceImpl = this.LL;
                        if (commercePageTrackingServiceImpl.LJIIZILJ && !commercePageTrackingServiceImpl.LJJ && (activity instanceof C0OGM) && (c0ogm2 = (C0OGM) activity) != null && (numValueOf2 = Integer.valueOf(c0ogm2.getPageType())) != null) {
                            if (numValueOf2.intValue() == -1) {
                                CommercePageTrackingServiceImpl commercePageTrackingServiceImpl2 = this.LL;
                                commercePageTrackingServiceImpl2.LJIJI = true;
                                commercePageTrackingServiceImpl2.LJIIIZ();
                                CommercePageTrackingServiceImpl commercePageTrackingServiceImpl3 = this.LL;
                                commercePageTrackingServiceImpl3.LJJ = true;
                                commercePageTrackingServiceImpl3.LJIILLIIL = 0;
                                return;
                            }
                            if (numValueOf2.intValue() == 4) {
                                CommercePageTrackingServiceImpl commercePageTrackingServiceImpl4 = this.LL;
                                if (!commercePageTrackingServiceImpl4.LJIJ && (str2 = commercePageTrackingServiceImpl4.LJFF) != null) {
                                    C2249271D1x c2249271D1xLJFF4 = commercePageTrackingServiceImpl4.LJFF();
                                    if (c2249271D1xLJFF4 != null) {
                                        c2249271D1xLJFF4.LJJIIZ(commercePageTrackingServiceImpl4.LJ, str2, commercePageTrackingServiceImpl4.LJI(), commercePageTrackingServiceImpl4.LJIL);
                                    }
                                    commercePageTrackingServiceImpl4.LJJ = true;
                                    commercePageTrackingServiceImpl4.LJIIL();
                                }
                            }
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    String str2;
                    C0OGM c0ogm2;
                    Integer numValueOf2;
                    String str3;
                    if (!this.LL.LJIIIIZZ() && this.LL.LJIIZILJ) {
                        ComponentCallbacks2 previousActivity2 = ActivityStack.getPreviousActivity();
                        if ((previousActivity2 instanceof C0OGM) && (c0ogm2 = (C0OGM) previousActivity2) != null && (numValueOf2 = Integer.valueOf(c0ogm2.getPageType())) != null && numValueOf2.intValue() == -1) {
                            CommercePageTrackingServiceImpl commercePageTrackingServiceImpl = this.LL;
                            if (!commercePageTrackingServiceImpl.LJIJ && !commercePageTrackingServiceImpl.LJIJI && !commercePageTrackingServiceImpl.LJIILIIL && (str3 = commercePageTrackingServiceImpl.LJFF) != null) {
                                C2249271D1x c2249271D1xLJFF4 = commercePageTrackingServiceImpl.LJFF();
                                if (c2249271D1xLJFF4 != null) {
                                    c2249271D1xLJFF4.LJJIIZI(commercePageTrackingServiceImpl.LJ, str3, commercePageTrackingServiceImpl.LJI(), commercePageTrackingServiceImpl.LJIL);
                                }
                                commercePageTrackingServiceImpl.LJIIL();
                            }
                        }
                        if (activity instanceof InterfaceC1603190roz) {
                            CommercePageTrackingServiceImpl commercePageTrackingServiceImpl2 = this.LL;
                            if (!commercePageTrackingServiceImpl2.LJIJ && !commercePageTrackingServiceImpl2.LJIJJ && (str2 = commercePageTrackingServiceImpl2.LJFF) != null) {
                                C2249271D1x c2249271D1xLJFF5 = commercePageTrackingServiceImpl2.LJFF();
                                if (c2249271D1xLJFF5 != null) {
                                    c2249271D1xLJFF5.LJJIIZ(commercePageTrackingServiceImpl2.LJ, str2, commercePageTrackingServiceImpl2.LJI(), commercePageTrackingServiceImpl2.LJIL);
                                }
                                commercePageTrackingServiceImpl2.LJIIL();
                            }
                        }
                    }
                }
            });
            C2214201BlK.LIZLLL().LJJLJLI(new AfS195S0100000_26(this, 4));
            String str2 = this.LJI;
            if (str2 == null) {
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 1622912263) {
                if (iHashCode != 1632283547) {
                    if (iHashCode != 1919799316 || !str2.equals("user_click") || (str = this.LJFF) == null || (c2249271D1xLJFF3 = LJFF()) == null) {
                        return;
                    }
                    c2249271D1xLJFF3.LJJIJ(this.LJ, str, this.LJII, this.LJIIIIZZ);
                    return;
                }
                if (!str2.equals("page_visit")) {
                    return;
                }
                String str3 = this.LJFF;
                if (str3 != null && (c2249271D1xLJFF2 = LJFF()) != null) {
                    AwemeRawAd awemeRawAd = this.LJ;
                    C2249281D1y c2249281D1y = C2249281D1y.LIZ;
                    c2249281D1y.getClass();
                    c2249281D1y.getClass();
                    c2249271D1xLJFF2.logAd(C1023500ck0.LIZLLL(str3, "page_visit", new InterfaceC1023650ckF[0]), awemeRawAd);
                }
                this.LJIJ = false;
                this.LJIIJ = SystemClock.uptimeMillis();
                this.LJIIZILJ = true;
                return;
            }
            if (!str2.equals("page_leave")) {
                return;
            }
            String str4 = this.LJFF;
            if (str4 != null && (c2249271D1xLJFF = LJFF()) != null) {
                c2249271D1xLJFF.LJJIIZ(this.LJ, str4, LJI(), this.LJIL);
            }
            LJIIL();
        }
    }

    public final long LJII(long j, boolean z) {
        long duration;
        Video video;
        Aweme aweme = this.LIZIZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        if (!z) {
            long jUptimeMillis = SystemClock.uptimeMillis() - j;
            if (jUptimeMillis <= duration) {
                return jUptimeMillis;
            }
        }
        return duration;
    }
}
