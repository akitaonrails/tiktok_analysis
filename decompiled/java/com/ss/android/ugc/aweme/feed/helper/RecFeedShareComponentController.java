package com.ss.android.ugc.aweme.feed.helper;

import X.C0RDR;
import X.C0RLJ;
import X.C0SZ8;
import X.C1076010e6h;
import X.C11NJ;
import X.C11S5;
import X.C1233440iCc;
import X.C1234230iDt;
import X.C1234420iEC;
import X.C1234690iEd;
import X.C1266060j3E;
import X.C13LP;
import X.C14EU;
import X.C1564680qos;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2276471E8n;
import X.C627150Oin;
import X.C737030Svd;
import X.C739280SzG;
import X.C786410Ut5;
import X.EnumC1234280iDy;
import X.InterfaceC1209520ha2;
import X.InterfaceC1234410iEB;
import X.InterfaceC1234720iEg;
import X.InterfaceC1294060jmO;
import Y.AObserverS168S0200000_3;
import Y.AfS188S0100000_19;
import Y.AfS45S1200000_19;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC1294060jmO
public final class RecFeedShareComponentController implements LifecycleEventObserver {
    public static boolean LLJILLL;
    public final BaseListFragmentPanel LL;
    public boolean LLILLJJLI;
    public ExposeSharerData LLILLL;
    public boolean LLILZIL;
    public String LLILZLL;
    public InterfaceC1209520ha2 LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Aweme LLJI;
    public InterfaceC1234410iEB LLJILJILJ;
    public final C11NJ LLILZ = new C11NJ();
    public final List<Aweme> LLJIJIL = new ArrayList();
    public List<Aweme> LLJILJIL = new ArrayList();

    public final void onDestroy() {
        this.LLJ = false;
        this.LL.getFragment().getLifecycle().removeObserver(this);
        EventBus.LIZLLL().LJJI(this);
        C2276471E8n.LIZIZ.d("@LinkRelation_OldLogic", "share component destroy");
    }

    public final void LIZIZ() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        if (LLJILLL) {
            this.LL.LLIIL(new C737030Svd(44));
        }
        Aweme aweme = this.LLJI;
        if (aweme != null) {
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insert the cache aweme: ");
            sbLIZ.append(aweme.getAid());
            c2276471E8n.LIZIZ("common_feed", "@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL(aweme);
            this.LLJI = null;
        }
    }

    public final void LJIIIIZZ() {
        if (this.LLJ) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        this.LL.getFragment().getLifecycle().addObserver(this);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this.LL.getFragment(), new AObserverS168S0200000_3(this.LL.getFragment().requireActivity(), this, 3));
        this.LLJ = true;
    }

    public RecFeedShareComponentController(BaseListFragmentPanel baseListFragmentPanel) {
        this.LL = baseListFragmentPanel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(X.C19EG r8) {
        /*
            r5 = 0
            if (r8 == 0) goto L96
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L96
            java.lang.String r4 = "from_notification"
            boolean r7 = r0.getBooleanExtra(r4, r5)
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L96
            java.lang.String r0 = "share_expose_sharer"
            boolean r6 = r1.getBooleanExtra(r0, r5)
            android.content.Intent r1 = r8.getIntent()
            r3 = 0
            if (r1 == 0) goto L2f
            java.lang.String r0 = "gids"
            java.lang.String r1 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2f
            goto L31
        L2b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2f:
            r2 = 0
            goto L40
        L31:
            int r0 = r1.length()
            if (r0 <= 0) goto L2f
            java.lang.String r0 = ","
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r5)
            if (r0 != 0) goto L2f
            r2 = 1
        L40:
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L51
            java.lang.String r0 = "share_url"
            java.lang.String r3 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L4d
            goto L51
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L51:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r2 != 0) goto L97
            if (r0 != 0) goto L97
            r1 = 0
        L5a:
            X.0iEH r0 = X.C1234470iEH.LIZ
            r0.getClass()
            X.01GW r0 = X.C1234470iEH.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r3 = "@LinkRelation_OldLogic"
            java.lang.String r2 = "common_feed"
            if (r7 != 0) goto L99
            if (r6 == 0) goto L99
            if (r1 == 0) goto L99
            if (r0 == 0) goto L99
            X.01GW r0 = X.C18165079n.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L99
            X.1E8n r1 = X.C2276471E8n.LIZIZ
            java.lang.String r0 = "intercept shared logic. "
            r1.LIZIZ(r2, r3, r0)
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L95
            r0.removeExtra(r4)
        L95:
            r5 = 1
        L96:
            return r5
        L97:
            r1 = 1
            goto L5a
        L99:
            X.1E8n r1 = X.C2276471E8n.LIZIZ
            java.lang.String r0 = "not intercept shared logic. "
            r1.LIZIZ(r2, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController.LJ(X.19EG):boolean");
    }

    public static void LJI(C0SZ8 c0sz8) {
        VideoBaseCell videoBaseCell;
        if (c0sz8 instanceof C0RDR) {
            ((C0RDR) c0sz8).LJJIIZI().zQ2(Boolean.TRUE, "show_expose_sharer_info_view");
            boolean z = c0sz8 instanceof VideoBaseCell;
            if (z) {
                VideoBaseCell videoBaseCell2 = (VideoBaseCell) c0sz8;
                if ((videoBaseCell2 != null && videoBaseCell2.LLLIIL() == 2) || (z && (videoBaseCell = (VideoBaseCell) c0sz8) != null && videoBaseCell.LLLIIL() == 6)) {
                    VideoExposeSharerInformationVM videoExposeSharerInformationVMLIZJ = C0RLJ.LIZJ(c0sz8);
                    if (videoExposeSharerInformationVMLIZJ != null) {
                        videoExposeSharerInformationVMLIZJ.setState(new AwS26S0010000_11(19));
                    }
                    C2276471E8n.LIZIZ.LIZIZ("common_feed", "@LinkRelation", "refresh the vh!");
                }
            }
        }
    }

    public final boolean LIZ(C0SZ8 c0sz8) {
        if (c0sz8 != null && c0sz8.getAweme() != null && LJFF(c0sz8.getAweme())) {
            LIZJ(c0sz8.getAweme());
            LJI(c0sz8);
            return true;
        }
        return false;
    }

    public final boolean LIZJ(Aweme aweme) {
        User user;
        ExposeSharerData exposeSharerData = this.LLILLL;
        if (exposeSharerData != null) {
            user = exposeSharerData.sharer;
        } else {
            user = null;
        }
        if (LJFF(aweme) && user != null) {
            C2276471E8n.LIZIZ.LIZIZ("common_feed", "@LinkRelation_OldLogic", "online logic, set sharer to aweme!");
            if (aweme != null) {
                AwemeBizExtKt.setSharer(aweme, user);
            }
            this.LLILZIL = true;
            return true;
        }
        return false;
    }

    public final void LIZLLL(Aweme aweme) {
        String aid;
        Aweme aweme2;
        String aid2;
        String uid;
        User sharer;
        int followStatus;
        User sharer2;
        int i = 0;
        if (AwemeBizExtKt.getSharer(aweme) != null) {
            User sharer3 = AwemeBizExtKt.getSharer(aweme);
            if (sharer3 != null) {
                uid = sharer3.getUid();
            } else {
                uid = null;
            }
            String aid3 = aweme.getAid();
            List<Aweme> list = this.LLJILJIL;
            HashSet hashSet = new HashSet();
            ArrayList<Aweme> arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (hashSet.add(((Aweme) obj).getAid())) {
                    arrayList.add(obj);
                }
            }
            ArrayList<Aweme> arrayList2 = new ArrayList();
            for (Aweme aweme3 : arrayList) {
                if (aweme3 != null && (sharer2 = AwemeBizExtKt.getSharer(aweme3)) != null && Intrinsics.LJFF(sharer2.getUid(), uid)) {
                    arrayList2.add(aweme3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Aweme aweme4 : arrayList2) {
                if (Intrinsics.LJFF(aweme4.getAid(), aid3)) {
                    arrayList3.add(aweme4);
                }
            }
            if ((!arrayList3.isEmpty()) && (sharer = AwemeBizExtKt.getSharer(aweme)) != null) {
                User sharer4 = AwemeBizExtKt.getSharer((Aweme) ListProtector.get(arrayList3, 0));
                if (sharer4 != null) {
                    followStatus = sharer4.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                sharer.setFollowStatus(followStatus);
            }
        }
        if (!this.LLIZLLLIL) {
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("first frame not rendered, cache insert aweme: ");
            sbLIZ.append(aweme.getAid());
            c2276471E8n.LIZIZ("common_feed", "@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJI = aweme;
            return;
        }
        C2276471E8n c2276471E8n2 = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("first frame rendered, insert to list ");
        sbLIZ2.append(aweme.getAid());
        c2276471E8n2.LIZIZ("common_feed", "@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ2));
        Aweme awemeLJIIIIZZ = this.LL.LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, aweme.getAid())) {
            User sharer5 = AwemeBizExtKt.getSharer(aweme);
            if (sharer5 != null) {
                if (awemeLJIIIIZZ != null) {
                    AwemeBizExtKt.setSharer(awemeLJIIIIZZ, sharer5);
                }
                LJI(this.LL.LJLIL());
            }
            c2276471E8n2.LIZIZ("common_feed", "@LinkRelation_OldLogic", "current aweme is target, might refresh vh!");
            return;
        }
        List listLLIIII = C13LP.LLIIII(this.LL.LLJL.Fg());
        int size = listLLIIII.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (ListProtector.get(listLLIIII, i2) != null && (aweme2 = (Aweme) ListProtector.get(listLLIIII, i2)) != null && aweme2.getAid() != null) {
                Aweme aweme5 = (Aweme) ListProtector.get(listLLIIII, i2);
                if (aweme5 != null) {
                    aid2 = aweme5.getAid();
                } else {
                    aid2 = null;
                }
                if (Intrinsics.LJFF(aid2, aweme.getAid())) {
                    if (i2 != -1) {
                        this.LL.LLJL.LJJJJL(i2);
                    }
                }
            }
            i2++;
        }
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        int iLJLLJ = this.LL.LJLLJ() + 1;
        Feed0VVManager.LJ(0, requestId, C1697810uHb.LJIILJJIL(aweme), false);
        C2276471E8n c2276471E8n3 = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("curIndex: ");
        sbLIZ3.append(this.LL.LJLLJ());
        sbLIZ3.append(", insert aweme(");
        sbLIZ3.append(aweme.getAid());
        sbLIZ3.append(") to ");
        sbLIZ3.append(iLJLLJ);
        c2276471E8n3.d("@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ3));
        try {
            this.LL.LLILIL(new C739280SzG<>(iLJLLJ, "shared_video", Collections.singletonList(aweme)));
            Iterator<Aweme> it2 = this.LL.LLJL.Fg().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                    i++;
                } else if (i != -1) {
                    this.LL.LLFFF(i, true);
                }
            }
            C2276471E8n.LIZIZ.LIZ("common_feed", "@LinkRelation", "Error case found that no desired aweme found in panel.");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2276471E8n.LIZIZ.LIZJ("common_feed", e, "@LinkRelation_OldLogic", "insert aweme error");
        }
        LJI(this.LL.LJLIL());
    }

    public final boolean LJFF(Aweme aweme) {
        if (aweme != null && TextUtils.equals(aweme.getAid(), this.LLILZLL)) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(final boolean z) {
        LJIIIIZZ();
        InterfaceC1234410iEB interfaceC1234410iEB = this.LLJILJILJ;
        if (interfaceC1234410iEB != null) {
            interfaceC1234410iEB.LIZJ(C1234420iEC.LIZ);
        }
        InterfaceC1234410iEB interfaceC1234410iEBLJII = C1234690iEd.LIZIZ.LJII();
        C627150Oin c627150Oin = new C627150Oin();
        C786410Ut5.LJJJI("enter_from", this.LL.getEventType(), c627150Oin.LIZ);
        Bundle bundle = c627150Oin.LIZ;
        interfaceC1234410iEBLJII.LIZLLL(new InterfaceC1234720iEg() { // from class: X.0iEA
            @Override // X.InterfaceC1234720iEg
            public final void LIZ(Aweme aweme) {
                RecFeedShareComponentController recFeedShareComponentController = this.LIZ;
                if (recFeedShareComponentController.LLIZLLLIL) {
                    recFeedShareComponentController.LL.LLIIL(new C737030Svd(44));
                }
                RecFeedShareComponentController.LLJILLL = true;
                ((ArrayList) recFeedShareComponentController.LLJIJIL).add(aweme);
            }

            @Override // X.InterfaceC1234720iEg
            public final void LIZIZ(AbstractC1234430iED abstractC1234430iED) {
                this.LIZ.LLJILJILJ = null;
                RecFeedShareComponentController.LLJILLL = false;
                if (((Number) C278750AwD.LIZ.getValue()).intValue() != 1) {
                    this.LIZ.LL.LLIIL(new C737030Svd(59));
                }
                if (abstractC1234430iED instanceof C1234440iEE) {
                    this.LIZ.LIZLLL(((C1234440iEE) abstractC1234430iED).LIZ);
                } else {
                    if (!(abstractC1234430iED instanceof C1234450iEF)) {
                        return;
                    }
                    this.LIZ.LIZLLL(((C1234450iEF) abstractC1234430iED).LIZ);
                }
            }

            @Override // X.InterfaceC1234720iEg
            public final void LIZJ(EnumC1233410iCZ enumC1233410iCZ, Aweme aweme) {
                int i;
                RecFeedShareComponentController recFeedShareComponentController = this.LIZ;
                recFeedShareComponentController.LLJILJILJ = null;
                RecFeedShareComponentController.LLJILLL = false;
                boolean z2 = z;
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dialog show fail: ");
                sbLIZ.append(enumC1233410iCZ);
                sbLIZ.append(", ");
                sbLIZ.append(z2);
                c2276471E8n.LIZIZ("common_feed", "@LinkRelation_OldLogic", C2188811AlT.LIZIZ(sbLIZ));
                if (aweme == null) {
                    if (enumC1233410iCZ == EnumC1233410iCZ.FAIL_FRIENDS_ONLY) {
                        i = 2131858132;
                    } else if (enumC1233410iCZ == EnumC1233410iCZ.FAIL_PRIVATE) {
                        i = 2131858133;
                    } else if (enumC1233410iCZ == EnumC1233410iCZ.FAIL_SUBSCRIBERS_ONLY) {
                        i = 2131849227;
                    } else {
                        i = 2131858134;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(recFeedShareComponentController.LL.getFragment().requireActivity());
                    c1389890mGx.LJIIIZ(i);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                recFeedShareComponentController.LIZLLL(aweme);
            }
        });
        interfaceC1234410iEBLJII.LIZ(this.LL.getFragment().requireActivity(), bundle);
        this.LLJILJILJ = interfaceC1234410iEBLJII;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        if (c1564680qos != null) {
            onDestroy();
        }
    }

    public final void LJII(C1233440iCc c1233440iCc, String str) {
        String str2;
        if (c1233440iCc.LJI && !this.LLILLJJLI) {
            if ((c1233440iCc.LJIIL != 0 || str == null || str.length() == 0) && (c1233440iCc.LJIIL != 1 || (str2 = c1233440iCc.LJIIJJI) == null || str2.length() == 0)) {
                return;
            }
            if (c1233440iCc.LJIIL != 1 && Intrinsics.LJFF(this.LLILZLL, str)) {
                return;
            }
            this.LLILZLL = str;
            this.LLILLJJLI = true;
            this.LLILZIL = false;
            C1234230iDt c1234230iDt = C1234230iDt.LIZIZ;
            String str3 = c1233440iCc.LIZLLL;
            EnumC1234280iDy enumC1234280iDy = c1233440iCc.LIZ;
            if (enumC1234280iDy == null) {
                enumC1234280iDy = EnumC1234280iDy.DEFAULT;
            }
            int rawValue = enumC1234280iDy.getRawValue();
            String str4 = c1233440iCc.LIZJ;
            String str5 = c1233440iCc.LJ;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c1233440iCc.LJFF;
            if (str7 != null) {
                str6 = str7;
            }
            this.LLILZ.LIZ(c1234230iDt.LJFF(str3, rawValue, str4, str5, str6, str, c1233440iCc.LJII, c1233440iCc.LJIIIIZZ, c1233440iCc.LJIIIZ, c1233440iCc.LJIIJJI, c1233440iCc.LJIIL, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS45S1200000_19(c1233440iCc, str, this, 0), new AfS188S0100000_19(this, 21), new C1266060j3E(this, 7)));
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }
}
