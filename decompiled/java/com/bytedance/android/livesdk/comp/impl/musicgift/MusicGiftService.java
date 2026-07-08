package com.bytedance.android.livesdk.comp.impl.musicgift;

import X.C08QP;
import X.C09RB;
import X.C0J3H;
import X.C1142060fpE;
import X.C1142100fpI;
import X.C1143590frh;
import X.C1147030fxF;
import X.C1147040fxG;
import X.C1147050fxH;
import X.C1147140fxQ;
import X.C1147690fyJ;
import X.C13LP;
import X.C15438062q;
import X.C1939607ik;
import X.InterfaceC1147150fxR;
import X.InterfaceC1147160fxS;
import X.InterfaceC1147550fy5;
import X.InterfaceC1364105Vn;
import X.InterfaceC773910UXl;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes18.dex */
public class MusicGiftService implements IMusicGiftService {
    public InterfaceC1147550fy5 LLJ;
    public InterfaceC1147160fxS LLJI;
    public C1142100fpI LLJIJIL;
    public final CopyOnWriteArraySet<InterfaceC1147150fxR> LL = new CopyOnWriteArraySet<>();
    public final C1147140fxQ LLILLJJLI = new C1147140fxQ(new C1147030fxF(this));
    public final C1147690fyJ LLILLL = new C1147690fyJ(0);
    public final Object LLILZ = new Object();
    public final List<Long> LLILZIL = new ArrayList();
    public final Object LLILZLL = new Object();
    public final List<Gift> LLIZ = new ArrayList();
    public final LinkedHashMap<Long, MusicGiftMood> LLIZLLLIL = new LinkedHashMap<>();
    public volatile C1143590frh LLJILJIL = new C1143590frh(0.0f, 0.0f, 0.0f);

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final Object WO(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return LIZ(this, str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final List<Gift> Jj1() {
        List<Gift> listLLIIII;
        synchronized (this.LLILZLL) {
            try {
                listLLIIII = C13LP.LLIIII(this.LLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLLIIII;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void UU0() {
        this.LLJI = new InterfaceC1147160fxS() { // from class: X.0fPY
            @Override // X.InterfaceC1147160fxS
            public final Gift findGiftById(long j) {
                return GiftManager.inst().findGiftById(j);
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r2
              0x0084: PHI (r2v1 com.bytedance.android.livesdk.model.Gift) = (r2v0 com.bytedance.android.livesdk.model.Gift), (r2v3 com.bytedance.android.livesdk.model.Gift) binds: [B:6:0x0010, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1147160fxS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r18, long r19, long r21, com.bytedance.android.livesdk.model.Gift r23) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1126140fPY.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, long, long, com.bytedance.android.livesdk.model.Gift):boolean");
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0J3H] */
    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final C0J3H lT0() {
        return new InterfaceC773910UXl() { // from class: X.0J3H
            public DataChannel LL;

            @Override // X.InterfaceC773910UXl
            public final int LIZIZ() {
                return 2131856441;
            }

            @Override // X.InterfaceC773910UXl
            public final void onHide() {
            }

            @Override // X.InterfaceC773910UXl
            public final void onShow() {
                LIZJ("show");
            }

            @Override // X.InterfaceC773910UXl
            public final int LJ() {
                return (LiveHostSettingsUIConfig.v1() || !LiveHostSettingsUIConfig.v2()) ? R.attr.dkv : R.attr.dkw;
            }

            @Override // X.InterfaceC773910UXl
            public final void LIZ(DataChannel dataChannel) {
                this.LL = null;
            }

            public final void LIZJ(String str) {
                String string;
                String string2;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_songsoflive_interact");
                c474500IjALIZ.LJJII("songs_of_live", "module_name");
                c474500IjALIZ.LJJII(str, "action_type");
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                String str2 = "";
                if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                    string = "";
                }
                c474500IjALIZ.LJJII(string, "anchor_id");
                DataChannel dataChannel = this.LL;
                if (dataChannel != null && (string2 = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)).toString()) != null) {
                    str2 = string2;
                }
                c474500IjALIZ.LJJII(str2, "room_id");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC773910UXl
            public final void onClick(View view) {
                Context context;
                LIZJ("click");
                if (view != null && (context = view.getContext()) != null) {
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.FQ2(DismissToolbarPopEvent.class);
                    }
                    IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                    if (iHybridContainerService != null) {
                        iHybridContainerService.YC1(context, "aweme://roma_redirect/?spark_page=music_gift_creator_entry&enter_from=interact_panel", null);
                    }
                }
            }

            @Override // X.InterfaceC773910UXl
            public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
                this.LL = dataChannel;
            }

            @Override // X.InterfaceC773910UXl
            public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
                onClick(view);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final Map<Long, MusicGiftMood> t40() {
        LinkedHashMap linkedHashMap;
        synchronized (this.LLILZLL) {
            try {
                linkedHashMap = new LinkedHashMap(this.LLIZLLLIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final List<Long> th0() {
        List<Long> listLLIIII;
        synchronized (this.LLILZ) {
            try {
                listLLIIII = C13LP.LLIIII(this.LLILZIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return listLLIIII;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final InterfaceC1147550fy5 b20() {
        return this.LLJ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final C1143590frh h01() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final C1142100fpI j62() {
        return this.LLJIJIL;
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() > 0) {
                arrayList.add(obj);
            }
        }
        return C13LP.LL(C13LP.LJJJJI(arrayList), 4);
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void HB2(C1142060fpE c1142060fpE) {
        this.LLJ = c1142060fpE;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void Hk0(C1143590frh c1143590frh) {
        this.LLJILJIL = c1143590frh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        ((java.util.ArrayList) r10.LLIZ).add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<? extends com.bytedance.android.livesdk.model.Gift> r11) {
        /*
            r10 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r11.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.bytedance.android.livesdk.model.Gift r0 = (com.bytedance.android.livesdk.model.Gift) r0
            long r3 = r0.id
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            r7.add(r5)
            goto L9
        L22:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r7.iterator()
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.model.Gift r0 = (com.bytedance.android.livesdk.model.Gift) r0
            long r0 = r0.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto L30
            r4.add(r2)
            goto L30
        L4d:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L54
            return
        L54:
            java.lang.Object r8 = r10.LLILZLL
            monitor-enter(r8)
            java.util.Iterator r9 = r4.iterator()     // Catch: java.lang.Throwable -> L9b
        L5b:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L99
            java.lang.Object r7 = r9.next()     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.livesdk.model.Gift r7 = (com.bytedance.android.livesdk.model.Gift) r7     // Catch: java.lang.Throwable -> L9b
            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r10.LLIZ     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L9b
            r5 = 0
        L70:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L91
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L9b
            com.bytedance.android.livesdk.model.Gift r0 = (com.bytedance.android.livesdk.model.Gift) r0     // Catch: java.lang.Throwable -> L9b
            long r3 = r0.id     // Catch: java.lang.Throwable -> L9b
            long r1 = r7.id     // Catch: java.lang.Throwable -> L9b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L8e
            if (r5 < 0) goto L91
            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r10.LLIZ     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9b
            r0.set(r5, r7)     // Catch: java.lang.Throwable -> L9b
            goto L5b
        L8e:
            int r5 = r5 + 1
            goto L70
        L91:
            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r10.LLIZ     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L9b
            r0.add(r7)     // Catch: java.lang.Throwable -> L9b
            goto L5b
        L99:
            monitor-exit(r8)
            return
        L9b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService.LIZIZ(java.util.List):void");
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void MN1(InterfaceC1147150fxR interfaceC1147150fxR) {
        this.LL.add(interfaceC1147150fxR);
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void QY(List<? extends Gift> list) {
        LIZIZ(list);
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void XL2(List<? extends Gift> list) {
        ArrayList arrayList = new ArrayList();
        for (Gift gift : list) {
            if (gift.id > 0) {
                arrayList.add(gift);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Long.valueOf(((Gift) obj).id))) {
                arrayList2.add(obj);
            }
        }
        List<? extends Gift> listLL = C13LP.LL(arrayList2, 4);
        synchronized (this.LLILZ) {
            try {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                Iterator<? extends Gift> it2 = listLL.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(it2.next().id));
                }
                ((ArrayList) this.LLILZIL).clear();
                ((ArrayList) this.LLILZIL).addAll(LIZJ(arrayList3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZIZ(listLL);
        List<Long> listTh0 = th0();
        Iterator<InterfaceC1147150fxR> it3 = this.LL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(listTh0);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void fJ1(C1142100fpI c1142100fpI) {
        this.LLJIJIL = c1142100fpI;
        Iterator<InterfaceC1147150fxR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1142100fpI);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final Gift findGiftById(long j) {
        Gift giftFindGiftById;
        Gift gift = null;
        if (j <= 0) {
            return null;
        }
        InterfaceC1147160fxS interfaceC1147160fxS = this.LLJI;
        if (interfaceC1147160fxS == null || (giftFindGiftById = interfaceC1147160fxS.findGiftById(j)) == null) {
            Iterator<Gift> it2 = Jj1().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Gift next = it2.next();
                if (next.id == j) {
                    gift = next;
                    break;
                }
            }
            return gift;
        }
        return giftFindGiftById;
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void py1(List<Long> list) {
        List listLIZJ = LIZJ(list);
        synchronized (this.LLILZ) {
            try {
                ((ArrayList) this.LLILZIL).clear();
                ((ArrayList) this.LLILZIL).addAll(LIZJ(listLIZJ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List<Long> listTh0 = th0();
        Iterator<InterfaceC1147150fxR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(listTh0);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void s50(InterfaceC1147150fxR interfaceC1147150fxR) {
        this.LL.remove(interfaceC1147150fxR);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean HJ0(X.C1147020fxE r16, com.bytedance.ies.sdk.datachannel.DataChannel r17) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService.HJ0(X.0fxE, com.bytedance.ies.sdk.datachannel.DataChannel):boolean");
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final void f91(List<? extends Gift> list, Map<Long, MusicGiftMood> map) {
        List listLJJII = C09RB.LJJII(new C08QP(C09RB.LJIIIZ(new C1939607ik(list), new C1147040fxG()), new C1147050fxH()));
        synchronized (this.LLILZLL) {
            try {
                ((ArrayList) this.LLIZ).clear();
                ((ArrayList) this.LLIZ).addAll(listLJJII);
                if (!map.isEmpty()) {
                    this.LLIZLLLIL.clear();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Long, MusicGiftMood> entry : map.entrySet()) {
                        if (entry.getKey().longValue() > 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        long jLongValue = ((Number) entry2.getKey()).longValue();
                        this.LLIZLLLIL.put(Long.valueOf(jLongValue), (MusicGiftMood) entry2.getValue());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService r6, java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof X.C1147130fxP
            if (r0 == 0) goto L4f
            r5 = r8
            X.0fxP r5 = (X.C1147130fxP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L55
            X.C155000ia.LIZIZ(r2)
        L23:
            X.0fy3 r2 = (X.AbstractC1147530fy3) r2
            boolean r0 = r2 instanceof X.C1147590fy9
            if (r0 == 0) goto L2d
            X.0fy9 r2 = (X.C1147590fy9) r2
            T r3 = r2.LIZ
        L2d:
            return r3
        L2e:
            X.C155000ia.LIZIZ(r2)
            X.0fyJ r2 = r6.LLILLL
            r5.LLILLL = r0
            r2.getClass()
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 == 0) goto L43
            X.0fy7 r2 = X.C1147570fy7.LIZ
        L40:
            if (r2 != r4) goto L23
            return r4
        L43:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0fyG r0 = new X.0fyG
            r0.<init>(r2, r7, r3)
            java.lang.Object r2 = X.C23250099c.LJI(r5, r1, r0)
            goto L40
        L4f:
            X.0fxP r5 = new X.0fxP
            r5.<init>(r6, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService.LIZ(com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService
    public final boolean Sd2(long j, long j2, DataChannel dataChannel) {
        InterfaceC1147160fxS interfaceC1147160fxS;
        Gift next;
        if (j <= 0 || (interfaceC1147160fxS = this.LLJI) == null) {
            return false;
        }
        Iterator<Gift> it2 = Jj1().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.id == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return interfaceC1147160fxS.LIZ(dataChannel, j, j2, next);
    }
}
