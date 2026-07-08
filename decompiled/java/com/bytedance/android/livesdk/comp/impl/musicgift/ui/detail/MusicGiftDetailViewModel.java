package com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09RB;
import X.C0NQF;
import X.C0NQI;
import X.C1142100fpI;
import X.C1147020fxE;
import X.C1147060fxI;
import X.C1147070fxJ;
import X.C1147090fxL;
import X.C1147330fxj;
import X.C1147350fxl;
import X.C1147390fxp;
import X.C1147420fxs;
import X.C1147450fxv;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C176600m4;
import X.C1939607ik;
import X.C197024126s;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2210008lG;
import X.C2252321DDq;
import X.C23250099c;
import X.C592860NNc;
import X.C814420VxA;
import X.InterfaceC1147550fy5;
import X.InterfaceC597550Nc9;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftDetailViewModel extends ViewModel {
    public static final Regex LLLFFI = new Regex("\\[(\\d{1,2}):(\\d{1,2})(?:[.:](\\d{1,3}))?\\]");
    public static final Regex LLLFZ = new Regex("^(\\d{1,2}):(\\d{1,2})(?:[.:](\\d{1,3}))?$");
    public final C1147020fxE LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final InterfaceC597550Nc9 LLILZ;
    public final C2252321DDq LLILZIL;
    public final AnonymousClass0951 LLILZLL;
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public C1147420fxs LLJ;
    public C1147350fxl LLJI;
    public List<C1147390fxp> LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public AnonymousClass0956 LLJJ;
    public AnonymousClass0956 LLJJI;
    public AnonymousClass0956 LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final Map<String, List<C2210008lG>> LLJLIL;
    public final IMusicGiftService LLJLILLLLZIIL;
    public final C1147090fxL LLJLL;
    public final LinkedHashSet<Long> LLJLLIL;
    public final Set<Long> LLJLLL;
    public Context LLJZ;
    public C1147350fxl LLJZIJLIL;
    public C1142100fpI LLL;
    public final C1142100fpI LLLF;
    public final C592860NNc LLLFF;

    public final C1147350fxl BQ2() {
        C1147420fxs c1147420fxs = this.LLJ;
        if (c1147420fxs != null) {
            return CQ2(c1147420fxs, this.LLJILLL);
        }
        return null;
    }

    public final C1147060fxI HQ2() {
        List<Gift> listJj1;
        Map<Long, MusicGiftMood> mapLJ;
        C1147020fxE c1147020fxE = this.LL;
        IMusicGiftService iMusicGiftService = this.LLJLILLLLZIIL;
        if (iMusicGiftService == null || (listJj1 = iMusicGiftService.Jj1()) == null) {
            listJj1 = C13BV.INSTANCE;
        }
        IMusicGiftService iMusicGiftService2 = this.LLJLILLLLZIIL;
        if (iMusicGiftService2 == null || (mapLJ = iMusicGiftService2.t40()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new C1147060fxI(c1147020fxE, listJj1, mapLJ, this.LLL, this.LLJLLIL);
    }

    public final void LQ2() {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        wQ2();
        if (this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
            IMusicGiftService iMusicGiftService = this.LLJLILLLLZIIL;
            if (iMusicGiftService != null) {
                iMusicGiftService.py1(C13LP.LLIIII(this.LLJLLIL));
            }
        }
        C1142100fpI c1142100fpI = this.LLLF;
        IMusicGiftService iMusicGiftService2 = this.LLJLILLLLZIIL;
        Boolean boolValueOf = null;
        InterfaceC1147550fy5 interfaceC1147550fy5B20 = iMusicGiftService2 != null ? iMusicGiftService2.b20() : null;
        if (c1142100fpI != null && interfaceC1147550fy5B20 != null) {
            boolValueOf = Boolean.valueOf(interfaceC1147550fy5B20.LIZLLL(c1142100fpI));
        }
        if (C176600m4.LIZIZ(boolValueOf) || interfaceC1147550fy5B20 == null) {
            return;
        }
        interfaceC1147550fy5B20.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[PHI: r9
      0x0061: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:19:0x0029, B:21:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OQ2() {
        /*
            r14 = this;
            X.0fxs r0 = r14.LLJ
            r13 = 0
            if (r0 != 0) goto L67
            boolean r0 = r14.LLJJIJI
            if (r0 == 0) goto L67
            X.0fxl r0 = r14.LLJI
            if (r0 != 0) goto L67
            r0 = 1
        Le:
            X.0fpI r7 = r14.LLL
            r9 = 0
            if (r7 == 0) goto L65
            if (r0 != 0) goto L65
            long r2 = r7.LIZ
            long r0 = r14.LLJILLL
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L65
            X.0fxl r0 = r14.LLJI
            if (r0 == 0) goto L27
            boolean r0 = r14.JQ2(r7, r0)
            if (r0 == 0) goto L65
        L27:
            X.1DDq r6 = r14.LLIZ
            if (r7 == 0) goto L61
            java.lang.String r9 = r7.LJIIIZ
            r8 = 0
            if (r7 == 0) goto L61
            long r0 = r7.LJIIJJI
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5e
            long r4 = r5.longValue()
        L44:
            long r2 = r7.LJIIJ
            float r1 = (float) r2
            float r0 = (float) r4
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = X.C13LZ.LIZLLL(r1, r8, r0)
            float r11 = r7.LJIILL
            int r12 = r7.LJIILLIIL
            int r13 = r7.LJIIL
        L55:
            X.05dG r8 = new X.05dG
            r8.<init>(r9, r10, r11, r12, r13)
            r6.setValue(r8)
            return
        L5e:
            r4 = 15000(0x3a98, double:7.411E-320)
            goto L44
        L61:
            r10 = 0
            r11 = 0
            r12 = 0
            goto L55
        L65:
            r7 = r9
            goto L27
        L67:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.OQ2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0328 A[PHI: r28
      0x0328: PHI (r28v2 java.lang.String) = (r28v0 java.lang.String), (r28v3 java.lang.String) binds: [B:147:0x01cb, B:145:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03fd A[PHI: r2
      0x03fd: PHI (r2v4 X.0fxl) = (r2v3 X.0fxl), (r2v13 X.0fxl), (r2v13 X.0fxl) binds: [B:286:0x03f9, B:64:0x00e0, B:65:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QQ2() {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.QQ2():void");
    }

    public final void wQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJIII = null;
    }

    public final C1147390fxp xQ2() {
        C1147390fxp next;
        Iterator<C1147390fxp> it2 = this.LLJIJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ == this.LLJILJIL) {
                break;
            }
        }
        return next;
    }

    public final C1147330fxj yQ2() {
        List<C1147330fxj> list;
        C1147420fxs c1147420fxs = this.LLJ;
        C1147330fxj c1147330fxj = null;
        if (c1147420fxs == null || (list = c1147420fxs.LIZIZ) == null) {
            return null;
        }
        Iterator<C1147330fxj> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1147330fxj next = it2.next();
            if (next.LIZ == this.LLJILJILJ) {
                c1147330fxj = next;
                break;
            }
        }
        return c1147330fxj;
    }

    public final void TQ2() {
        InterfaceC1147550fy5 interfaceC1147550fy5B20;
        InterfaceC1147550fy5 interfaceC1147550fy5B202;
        C1147350fxl c1147350fxlBQ2 = BQ2();
        if (c1147350fxlBQ2 == null) {
            return;
        }
        C1142100fpI c1142100fpISQ2 = SQ2(c1147350fxlBQ2);
        if (c1142100fpISQ2 != null) {
            IMusicGiftService iMusicGiftService = this.LLJLILLLLZIIL;
            if (C176600m4.LIZIZ((iMusicGiftService == null || (interfaceC1147550fy5B20 = iMusicGiftService.b20()) == null) ? null : Boolean.valueOf(interfaceC1147550fy5B20.LIZJ(this.LLJZ, c1142100fpISQ2)))) {
                return;
            }
            this.LLL = null;
            QQ2();
            return;
        }
        this.LLL = null;
        IMusicGiftService iMusicGiftService2 = this.LLJLILLLLZIIL;
        if (iMusicGiftService2 != null && (interfaceC1147550fy5B202 = iMusicGiftService2.b20()) != null) {
            interfaceC1147550fy5B202.LIZ();
        }
        QQ2();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LQ2();
        wQ2();
        IMusicGiftService iMusicGiftService = this.LLJLILLLLZIIL;
        if (iMusicGiftService != null) {
            iMusicGiftService.s50(this.LLLFF);
        }
        super.onCleared();
    }

    public static boolean DQ2(C1147330fxj c1147330fxj) {
        if (!c1147330fxj.LJFF && c1147330fxj.LIZ != 2) {
            return false;
        }
        return true;
    }

    public static Long NQ2(String str) {
        boolean z;
        Long lLJIIL;
        String strLJJJJZ = a0.LJJJJZ("0X", a0.LJJJJZ("0x", a0.LJJJJZ("#", a0.LJLIIIL(str).toString())));
        if (strLJJJJZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (lLJIIL = C2095008Iq.LJIIL(16, strLJJJJZ)) == null) {
            return null;
        }
        long jLongValue = lLJIIL.longValue();
        int length = strLJJJJZ.length();
        if (length != 6) {
            if (length != 8) {
                return null;
            }
            return Long.valueOf(jLongValue);
        }
        return Long.valueOf(4278190080L | jLongValue);
    }

    public static C1142100fpI VQ2(C1142100fpI c1142100fpI) {
        return C1142100fpI.LIZ(c1142100fpI, null, null, null, null, null, null, null, false, 4088831);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long WQ2(kotlin.text.MatchResult r11) {
        /*
            java.util.List r0 = r11.LIZ()
            r6 = 1
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            r9 = 0
            if (r0 == 0) goto L89
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L89
            long r7 = r0.longValue()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 * r0
        L1d:
            java.util.List r0 = r11.LIZ()
            r3 = 2
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L86
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L86
            long r4 = r0.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
        L37:
            java.util.List r0 = r11.LIZ()
            r2 = 3
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r2, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L46
            java.lang.String r1 = ""
        L46:
            int r0 = r1.length()
            if (r0 == r6) goto L74
            if (r0 == r3) goto L62
            if (r0 == r2) goto L5d
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
        L54:
            if (r0 == 0) goto L5a
            long r9 = r0.longValue()
        L5a:
            long r7 = r7 + r4
            long r7 = r7 + r9
            return r7
        L5d:
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r1)
            goto L54
        L62:
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r1)
            if (r0 == 0) goto L5a
            long r2 = r0.longValue()
            r0 = 10
            long r2 = r2 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L54
        L74:
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r1)
            if (r0 == 0) goto L5a
            long r2 = r0.longValue()
            r0 = 100
            long r2 = r2 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L54
        L86:
            r4 = 0
            goto L37
        L89:
            r7 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.WQ2(kotlin.text.MatchResult):long");
    }

    public static long zQ2(long j) {
        return C13LZ.LJ(C814420VxA.LIZIZ(j * 0.62f), 0, 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C2210008lG> IQ2(X.C1147350fxl r14) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.IQ2(X.0fxl):java.util.List");
    }

    public final void RQ2(Collection<Long> collection) {
        LinkedHashSet<Long> linkedHashSet = this.LLJLLIL;
        linkedHashSet.clear();
        ArrayList arrayList = new ArrayList();
        for (Long l : collection) {
            if (l.longValue() > 0) {
                arrayList.add(l);
            }
        }
        linkedHashSet.addAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[PHI: r13
      0x003e: PHI (r13v3 java.lang.Long) = (r13v0 java.lang.Long), (r13v0 java.lang.Long), (r13v0 java.lang.Long), (r13v1 java.lang.Long), (r13v4 java.lang.Long) binds: [B:50:0x00ba, B:52:0x00be, B:54:0x00c2, B:43:0x0099, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1142100fpI SQ2(X.C1147350fxl r34) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.SQ2(X.0fxl):X.0fpI");
    }

    public final boolean UQ2(long j) {
        C1147020fxE c1147020fxE = this.LL;
        long jLongValue = 0;
        if (c1147020fxE.LIZ <= 0) {
            return false;
        }
        Long lValueOf = Long.valueOf(c1147020fxE.LIZJ);
        if (lValueOf.longValue() <= 0 && 0 == 0) {
            MusicGiftMood musicGiftMood = this.LL.LJIIIZ;
            if (musicGiftMood != null) {
                Long lValueOf2 = Long.valueOf(musicGiftMood.moodId);
                if (lValueOf2.longValue() > 0) {
                    jLongValue = lValueOf2.longValue();
                }
            }
        } else {
            jLongValue = lValueOf.longValue();
        }
        if (j != jLongValue) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.C1142100fpI r8) {
        /*
            r7 = this;
            r5 = 0
            if (r8 == 0) goto L28
            boolean r0 = r7.LLJJJJJIL
            if (r0 != 0) goto L28
            X.0fpR r1 = r8.LJIIIIZZ
            X.0fpR r0 = X.EnumC1142190fpR.PANEL_ITEM
            if (r1 != r0) goto L28
            long r3 = r7.LLJILLL
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r1 = r8.LIZ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L28
            com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService r0 = r7.LLJLILLLLZIIL
            if (r0 == 0) goto L27
            X.0fy5 r0 = r0.b20()
            if (r0 == 0) goto L27
            r0.LIZ()
        L27:
            return
        L28:
            X.0fpI r4 = r7.LLL
            r7.LLL = r8
            if (r8 == 0) goto L6d
            long r1 = r8.LIZ
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6d
            long r5 = r7.LLJILLL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L6d
            if (r8 == 0) goto L6d
            X.0fxs r0 = r7.LLJ
            if (r0 == 0) goto L67
            java.util.List<X.0fxj> r0 = r0.LIZIZ
            X.07ik r3 = new X.07ik
            r3.<init>(r0)
            X.0fy0 r0 = new X.0fy0
            r0.<init>()
            X.126t r0 = X.C09RB.LJIILIIL(r3, r0)
            X.126s r3 = new X.126s
            r3.<init>(r0)
        L55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r3.next()
            X.0fxl r0 = (X.C1147350fxl) r0
            boolean r0 = r7.JQ2(r8, r0)
            if (r0 == 0) goto L55
        L67:
            r7.LLJILLL = r1
        L69:
            r7.QQ2()
            return
        L6d:
            r1 = 0
            if (r4 == 0) goto L84
            X.0fpI r0 = VQ2(r4)
        L74:
            if (r8 == 0) goto L7a
            X.0fpI r1 = VQ2(r8)
        L7a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L69
            r7.OQ2()
            return
        L84:
            r0 = r1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.vQ2(X.0fpI):void");
    }

    public static C1147350fxl CQ2(C1147420fxs c1147420fxs, long j) {
        Object next;
        C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(c1147420fxs.LIZIZ), new C1147450fxv()));
        while (true) {
            if (c197024126s.hasNext()) {
                next = c197024126s.next();
                if (((C1147350fxl) next).LIZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C1147350fxl) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[PHI: r0
      0x0018: PHI (r0v10 java.lang.Long) = (r0v5 java.lang.Long), (r0v11 java.lang.Long) binds: [B:18:0x003f, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long MQ2(java.lang.String r5, org.json.JSONObject r6) {
        /*
            java.lang.Object r1 = r6.opt(r5)
            r6 = 0
            if (r1 != 0) goto L8
            return r6
        L8:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L23
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L16:
            if (r0 == 0) goto L52
        L18:
            long r4 = r0.longValue()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L52
            return r0
        L23:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L52
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r1)
            java.lang.String r1 = r0.toString()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L52
            if (r1 == 0) goto L52
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r1)
            if (r0 != 0) goto L18
            kotlin.text.Regex r0 = com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.LLLFZ
            kotlin.text.MatchResult r0 = r0.matchEntire(r1)
            if (r0 == 0) goto L52
            long r0 = WQ2(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L16
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.MQ2(java.lang.String, org.json.JSONObject):java.lang.Long");
    }

    public final boolean JQ2(C1142100fpI c1142100fpI, C1147350fxl c1147350fxl) {
        long j;
        String str;
        if (c1142100fpI == null || c1147350fxl == null || c1142100fpI.LIZ != c1147350fxl.LIZ) {
            return false;
        }
        long j2 = this.LLJILJIL;
        if (j2 <= 0 && c1142100fpI.LIZJ <= 0) {
            C1147070fxJ c1147070fxJ = c1147350fxl.LJFF;
            if (c1147070fxJ != null) {
                j = c1147070fxJ.LIZJ;
            } else {
                j = 0;
            }
            if (j <= 0) {
                if (c1142100fpI.LIZLLL > 0) {
                    return false;
                }
                if (c1147070fxJ != null) {
                    str = c1147070fxJ.LIZ;
                } else {
                    str = null;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = c1142100fpI.LJ;
                if (str3 != null) {
                    str2 = str3;
                }
                if (!(!a0.LJJJIL(str)) && !(!a0.LJJJIL(str2))) {
                    return true;
                }
                if (!(!a0.LJJJIL(str)) || !(!a0.LJJJIL(str2)) || !Intrinsics.LJFF(str, str2)) {
                    return false;
                }
                return true;
            }
            long j3 = c1142100fpI.LIZLLL;
            if (j3 <= 0 || j != j3) {
                return false;
            }
            return true;
        }
        if (j2 <= 0) {
            return false;
        }
        long j4 = c1142100fpI.LIZJ;
        if (j4 <= 0 || j2 != j4) {
            return false;
        }
        return true;
    }

    public static boolean KQ2(C1142100fpI c1142100fpI, long j, long j2) {
        if (c1142100fpI == null || j <= 0 || j2 <= 0 || c1142100fpI.LIZJ != j || c1142100fpI.LIZ != j2) {
            return false;
        }
        return true;
    }

    public final void FQ2(boolean z, boolean z2, boolean z3) {
        C1147420fxs c1147420fxs;
        List<C1147330fxj> list;
        C1147330fxj next;
        if (!this.LLJJIJI && (c1147420fxs = this.LLJ) != null && (list = c1147420fxs.LIZIZ) != null) {
            Iterator<C1147330fxj> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == this.LLJILJILJ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1147330fxj c1147330fxj = next;
            if (c1147330fxj != null) {
                if (c1147330fxj.LJ || z) {
                    if ((!a0.LJJJIL(c1147330fxj.LIZLLL) || z3) && !this.LLJJJ) {
                        if (!z && this.LLJJJIL != null) {
                            return;
                        }
                        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LLJJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0NQI(this, c1147330fxj, z2, null), 3);
                    }
                }
            }
        }
    }

    public final void XQ2(long j, boolean z, boolean z2) {
        C1147420fxs c1147420fxs;
        C1147330fxj next;
        if (j <= 0 || (c1147420fxs = this.LLJ) == null) {
            return;
        }
        Iterator<C1147330fxj> it2 = c1147420fxs.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == this.LLJILJILJ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1147330fxj c1147330fxj = next;
        if (z2 && (c1147330fxj == null || !DQ2(c1147330fxj))) {
            this.LLJJL = true;
        }
        List<C1147330fxj> list = c1147420fxs.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1147330fxj c1147330fxj2 : list) {
            List<C1147350fxl> list2 = c1147330fxj2.LJI;
            ArrayList arrayList2 = new ArrayList();
            for (C1147350fxl c1147350fxlLIZ : list2) {
                if (c1147350fxlLIZ.LIZ == j) {
                    if (!DQ2(c1147330fxj2) || z) {
                        c1147350fxlLIZ = C1147350fxl.LIZ(c1147350fxlLIZ, null, z, 1535);
                        if (c1147350fxlLIZ != null) {
                        }
                    }
                }
                arrayList2.add(c1147350fxlLIZ);
            }
            arrayList.add(C1147330fxj.LIZ(c1147330fxj2, 0L, null, null, null, false, arrayList2, 63));
        }
        this.LLJ = new C1147420fxs(c1147420fxs.LIZ, arrayList);
    }

    public final void YQ2(long j, boolean z, C1147350fxl c1147350fxl) {
        C1147420fxs c1147420fxs;
        if (!z || j <= 0 || (c1147420fxs = this.LLJ) == null) {
            return;
        }
        C1147350fxl c1147350fxlCQ2 = CQ2(c1147420fxs, j);
        if (c1147350fxlCQ2 == null) {
            c1147350fxlCQ2 = c1147350fxl;
            if (c1147350fxl == null) {
                return;
            }
        }
        C1147350fxl c1147350fxlLIZ = C1147350fxl.LIZ(c1147350fxlCQ2, null, true, 1535);
        List<C1147330fxj> list = c1147420fxs.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1147330fxj c1147330fxjLIZ : list) {
            if (DQ2(c1147330fxjLIZ)) {
                List<C1147350fxl> list2 = c1147330fxjLIZ.LJI;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    c1147330fxjLIZ = C1147330fxj.LIZ(c1147330fxjLIZ, 0L, null, null, null, false, C13LP.LJLIL(c1147330fxjLIZ.LJI, Collections.singletonList(c1147350fxlLIZ)), 63);
                } else {
                    Iterator<C1147350fxl> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LIZ == j) {
                            break;
                        }
                    }
                    c1147330fxjLIZ = C1147330fxj.LIZ(c1147330fxjLIZ, 0L, null, null, null, false, C13LP.LJLIL(c1147330fxjLIZ.LJI, Collections.singletonList(c1147350fxlLIZ)), 63);
                }
            }
            arrayList.add(c1147330fxjLIZ);
        }
        this.LLJ = new C1147420fxs(c1147420fxs.LIZ, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[PHI: r3
      0x00e6: PHI (r3v17 java.lang.Long) = (r3v16 java.lang.Long), (r3v21 java.lang.Long) binds: [B:25:0x00d6, B:27:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[PHI: r6
      0x0037: PHI (r6v1 java.lang.Long) = (r6v0 java.lang.Long), (r6v15 java.lang.Long) binds: [B:3:0x0025, B:6:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029f  */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.099V] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0NNc, X.0fxR] */
    /* JADX WARN: Type inference failed for: r2v45, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicGiftDetailViewModel(X.C1147020fxE r58, long r59, long r61, X.InterfaceC597550Nc9 r63) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.<init>(X.0fxE, long, long, X.0Nc9):void");
    }

    public final void EQ2(long j, long j2, boolean z, boolean z2) {
        wQ2();
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0NQF(this, j, j2, z, z2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[PHI: r8
      0x0044: PHI (r8v1 java.lang.Long) = (r8v0 java.lang.Long), (r8v2 java.lang.Long) binds: [B:13:0x0032, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PQ2(long r10, long r12, boolean r14, boolean r15, boolean r16) {
        /*
            r9 = this;
            r9.wQ2()
            r7 = 0
            if (r16 != 0) goto L15
            r9.LLL = r7
            com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService r0 = r9.LLJLILLLLZIIL
            if (r0 == 0) goto L15
            X.0fy5 r0 = r0.b20()
            if (r0 == 0) goto L15
            r0.LIZ()
        L15:
            X.0956 r0 = r9.LLJJI
            if (r0 == 0) goto L1c
            r0.LIZIZ(r7)
        L1c:
            r9.LLJJI = r7
            r6 = 0
            r9.LLJL = r6
            r9.LLJILJIL = r10
            r3 = 0
            r9.LLJILJILJ = r3
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            long r1 = r8.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L44
            long r0 = r9.LLJILLL
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            long r1 = r8.longValue()
            if (r16 == 0) goto L48
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L48
        L44:
            long r3 = r8.longValue()
        L48:
            r9.LLJILLL = r3
            r9.LLJ = r7
            r9.LLJJIJI = r5
            r9.LLJJIJIIJIL = r6
            r9.LLJJIJIL = r7
            r9.LLJJJ = r6
            r9.LLJJJIL = r7
            r9.QQ2()
            r9.EQ2(r10, r12, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.PQ2(long, long, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[PHI: r4
      0x0043: PHI (r4v17 X.0fxj) = (r4v5 X.0fxj), (r4v8 X.0fxj), (r4v10 X.0fxj), (r4v2 X.0fxj), (r4v2 X.0fxj) binds: [B:76:0x00ea, B:83:0x010b, B:85:0x0115, B:20:0x0037, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void AQ2(com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel r12, long r13, boolean r15, boolean r16, boolean r17, int r18) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel.AQ2(com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel, long, boolean, boolean, boolean, int):void");
    }
}
