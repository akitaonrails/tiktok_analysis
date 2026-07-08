package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.C09JN;
import X.C1165060gQK;
import X.C1165080gQM;
import X.C1165230gQb;
import X.C1165370gQp;
import X.C1165410gQt;
import X.C1165730gRP;
import X.C1165760gRS;
import X.C1166800gT8;
import X.C1169200gX0;
import X.C11S5;
import X.C1205840hU6;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C323380Cm0;
import X.C491001vg;
import X.C589140N8u;
import X.C596990NbF;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC614560O8o;
import X.InterfaceC723050SXv;
import Y.AfS0S1100100_4;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionState;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.state.ability.IState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistConsumptionViewModel extends BaseDetailShareVM<C1165760gRS, C1166800gT8, Long> implements InterfaceC723050SXv {
    public C1165370gQp LLILZIL;
    public C1165060gQK LLILZLL;
    public Aweme LLJ;
    public boolean LLJI;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public long LLJILLL = -1;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return -1;
    }

    public final String DQ2() {
        String secAuthorUid;
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme);
            if (secAuthorUid == null) {
                return "";
            }
        } else {
            secAuthorUid = this.LLJILJIL;
            if (secAuthorUid == null) {
                return "";
            }
        }
        return secAuthorUid;
    }

    public final String EQ2() {
        String authorUid;
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid == null) {
                return "";
            }
        } else {
            authorUid = this.LLJIJIL;
            if (authorUid == null) {
                return "";
            }
        }
        return authorUid;
    }

    public final String FQ2() {
        if (!this.LLJI) {
            return "";
        }
        C596990NbF c596990NbF = C596990NbF.LIZ;
        return C596990NbF.LIZ(this.LLIZ);
    }

    public final void HQ2() {
        C1165060gQK c1165060gQK = this.LLILZLL;
        (c1165060gQK == null ? null : c1165060gQK).LLILLJJLI = this.LLJILJILJ;
        (c1165060gQK == null ? null : c1165060gQK).LL = this.LLJILLL;
        if (c1165060gQK == null) {
            c1165060gQK = null;
        }
        final String str = this.LLIZ;
        String strEQ2 = EQ2();
        String strDQ2 = DQ2();
        boolean z = this.LLJJ;
        boolean z2 = this.LLJJIJI;
        final AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 179);
        c1165060gQK.getClass();
        MixDetailResponse mixDetailResponseLIZIZ = C1169200gX0.LIZIZ.LIZIZ(new C1165080gQM(str));
        if (z2 && mixDetailResponseLIZIZ != null) {
            C589140N8u.LJ.LJIJJ(str, "playnext, use preloaded data");
            c1165060gQK.LIZIZ(mixDetailResponseLIZIZ.mixDetail, null, awS597S0100000_18);
        } else {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final C1165060gQK c1165060gQK2 = c1165060gQK;
            ((MixFeedApi) new C1165230gQb().LL.getValue()).getMixDetail(str, strEQ2, strDQ2, z, true, false, null, null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0gOl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaylistDetailRepository@69c.getPlaylistDetail$response$1");
                    MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
                    C05FZ c05fz = C05FZ.LIZ;
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
                    c05fz.getClass();
                    C05FZ.LIZLLL(mapLJIIIIZZ);
                    C589140N8u.LJ.LJIJJ(str, "success");
                    c1165060gQK2.LIZIZ(mixDetailResponse.mixDetail, Long.valueOf(jElapsedRealtime), awS597S0100000_18);
                    ((IState) ServiceManager.get().getService(IPlaylistCollectionState.class)).syncState(str, Boolean.valueOf(mixDetailResponse.isCollected), false);
                    C1C7U.LIZIZ("PlaylistDetailRepository@69c.getPlaylistDetail$response$1");
                }
            }, new AfS0S1100100_4(jCurrentTimeMillis, str, null, 0));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165760gRS(new C627660Ojc(null, null, null, null, 15), null, null, false, null, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        Aweme aweme = this.LLJ;
        return aweme != null ? C1697810uHb.LJIILJJIL(aweme) : super.getAwemeList();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILZIL = (C1165370gQp) C1205840hU6.LIZIZ(getLifecycle(), C13LE.LIZ(C1165370gQp.class));
        this.LLILZLL = (C1165060gQK) C1205840hU6.LIZIZ(getLifecycle(), C13LE.LIZ(C1165060gQK.class));
    }

    public final int CQ2(Aweme aweme) {
        String aid;
        C1165370gQp c1165370gQp = this.LLILZIL;
        if (c1165370gQp == null) {
            c1165370gQp = null;
        }
        List listLLIIII = C13LP.LLIIII(c1165370gQp.LLILLL);
        if (listLLIIII != null) {
            Iterator it2 = listLLIIII.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String aid2 = ((Aweme) it2.next()).getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid2, aid)) {
                    if (i >= 0) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public final void IQ2(Aweme aweme) {
        BaseListFragmentPanel baseListFragmentPanel;
        if (aweme == null) {
            return;
        }
        InterfaceC614560O8o interfaceC614560O8o = this.LLILLJJLI;
        if ((interfaceC614560O8o instanceof DetailFragmentPanel) && (baseListFragmentPanel = (BaseListFragmentPanel) interfaceC614560O8o) != null) {
            String aid = aweme.getAid();
            C2189821An6 c2189821An6 = baseListFragmentPanel.LLLLIIIILLL;
            if (c2189821An6 != null) {
                c2189821An6.setAid(aid);
            }
        }
        this.vmDispatcher.getState();
        setState(new AwS597S0100000_18(aweme, 180));
        C589140N8u c589140N8u = C589140N8u.LJ;
        String str = this.LLIZ;
        String aid2 = aweme.getAid();
        c589140N8u.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playlist: ");
        sbLIZ.append(str);
        sbLIZ.append(", current video id: ");
        sbLIZ.append(aid2);
        c589140N8u.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1166800gT8> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 177));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r21) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C1166800gT8) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object GQ2(long r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r18) {
        /*
            r15 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1165430gQv
            if (r0 == 0) goto L5d
            r14 = r3
            X.0gQv r14 = (X.C1165430gQv) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r3 = r14.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r9 = 0
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L63
            X.C155000ia.LIZIZ(r3)
        L25:
            X.0gQt r3 = (X.C1165410gQt) r3
            r0 = 6
            X.0CbV r0 = BQ2(r15, r3, r9, r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r6 = 2
            X.0gQp r3 = r15.LLILZIL
            if (r3 != 0) goto L36
            r3 = r9
        L36:
            java.lang.String r4 = r15.LLIZ
            java.lang.String r5 = r15.LLIZLLLIL
            java.lang.String r7 = r15.EQ2()
            java.lang.String r8 = r15.DQ2()
            int r0 = X.C1164030gOf.LIZ()
            java.lang.Integer r10 = X.C2286608xc.LJ(r0)
            boolean r11 = r15.LLJJ
            boolean r0 = r15.LLJJI
            if (r0 == 0) goto L5b
            r12 = 2
        L51:
            r13 = 0
            r14.LLILLL = r1
            java.lang.Object r3 = r3.LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r2) goto L25
            return r2
        L5b:
            r12 = 1
            goto L51
        L5d:
            X.0gQv r14 = new X.0gQv
            r14.<init>(r15, r3)
            goto L14
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel.GQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC723050SXv
    public final Object ew2(Aweme aweme, InterfaceC1364105Vn<? super AbstractC1623806Xk<Unit>> interfaceC1364105Vn) {
        if (aweme == null) {
            return new C491001vg(new Exception("Aweme is Null"));
        }
        C1165060gQK c1165060gQK = this.LLILZLL;
        if (c1165060gQK == null) {
            c1165060gQK = null;
        }
        return c1165060gQK.LIZ(aweme, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadLatest(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return GQ2(((Number) obj).longValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r18) {
        /*
            r15 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1165440gQw
            if (r0 == 0) goto L5d
            r14 = r3
            X.0gQw r14 = (X.C1165440gQw) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r3 = r14.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r9 = 0
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L63
            X.C155000ia.LIZIZ(r3)
        L25:
            X.0gQt r3 = (X.C1165410gQt) r3
            r0 = 6
            X.0CbV r0 = BQ2(r15, r3, r9, r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r6 = 3
            X.0gQp r3 = r15.LLILZIL
            if (r3 != 0) goto L36
            r3 = r9
        L36:
            java.lang.String r4 = r15.LLIZ
            java.lang.String r5 = r15.LLIZLLLIL
            java.lang.String r7 = r15.EQ2()
            java.lang.String r8 = r15.DQ2()
            int r0 = X.C1164030gOf.LIZ()
            java.lang.Integer r10 = X.C2286608xc.LJ(r0)
            boolean r11 = r15.LLJJ
            boolean r0 = r15.LLJJI
            if (r0 == 0) goto L5b
            r12 = 2
        L51:
            r13 = 0
            r14.LLILLL = r1
            java.lang.Object r3 = r3.LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r2) goto L25
            return r2
        L5b:
            r12 = 1
            goto L51
        L5d:
            X.0gQw r14 = new X.0gQw
            r14.<init>(r15, r3)
            goto L14
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC723050SXv
    public final Object uk2(Aweme aweme, InterfaceC1364105Vn<? super AbstractC1623806Xk<Unit>> interfaceC1364105Vn) {
        if (aweme == null) {
            return new C491001vg(new Exception("Aweme is Null"));
        }
        C1165370gQp c1165370gQp = this.LLILZIL;
        if (c1165370gQp == null) {
            c1165370gQp = null;
        }
        return c1165370gQp.LIZ(aweme, interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).longValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) interfaceC1364105Vn);
    }

    public static AbstractC316870CbV BQ2(PlaylistConsumptionViewModel playlistConsumptionViewModel, C1165410gQt c1165410gQt, AwS597S0100000_18 awS597S0100000_18, int i) {
        C1165370gQp c1165370gQp;
        C1165370gQp c1165370gQp2;
        C1165370gQp c1165370gQp3;
        C1165370gQp c1165370gQp4;
        C1165370gQp c1165370gQp5;
        C1165370gQp c1165370gQp6;
        if ((i & 2) != 0) {
            awS597S0100000_18 = null;
        }
        playlistConsumptionViewModel.getClass();
        Throwable th = c1165410gQt.LIZIZ;
        if (th != null) {
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9((Exception) th);
        }
        List<Aweme> list = c1165410gQt.LIZ;
        if (list == null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C1165370gQp c1165370gQp7 = playlistConsumptionViewModel.LLILZIL;
            if (c1165370gQp7 == null) {
                c1165370gQp7 = null;
            }
            Long lValueOf = Long.valueOf(c1165370gQp7.LLILZLL);
            C1165370gQp c1165370gQp8 = playlistConsumptionViewModel.LLILZIL;
            if (c1165370gQp8 == null) {
                c1165370gQp8 = null;
            }
            return C317290CcB.LJ(c317290CcB, lValueOf, Long.valueOf(c1165370gQp8.LLIZ), null, 4);
        }
        if (awS597S0100000_18 != null) {
            awS597S0100000_18.invoke(list);
        }
        C1165370gQp c1165370gQp9 = playlistConsumptionViewModel.LLILZIL;
        if (c1165370gQp9 == null) {
            c1165370gQp = null;
        } else {
            c1165370gQp = c1165370gQp9;
        }
        if (c1165370gQp.LLILZIL) {
            if (c1165370gQp9 == null) {
                c1165370gQp6 = null;
            } else {
                c1165370gQp6 = c1165370gQp9;
            }
            if (c1165370gQp6.LLILZ) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                if (c1165370gQp9 == null) {
                    c1165370gQp9 = null;
                }
                Long lValueOf2 = Long.valueOf(c1165370gQp9.LLILZLL);
                C1165370gQp c1165370gQp10 = playlistConsumptionViewModel.LLILZIL;
                if (c1165370gQp10 == null) {
                    c1165370gQp10 = null;
                }
                Long lValueOf3 = Long.valueOf(c1165370gQp10.LLIZ);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1166800gT8(it2.next(), null));
                }
                c317290CcB2.getClass();
                return new C323380Cm0(lValueOf2, lValueOf3, arrayList);
            }
        }
        if (c1165370gQp9 == null) {
            c1165370gQp2 = null;
        } else {
            c1165370gQp2 = c1165370gQp9;
        }
        if (c1165370gQp2.LLILZIL) {
            if (c1165370gQp9 == null) {
                c1165370gQp5 = null;
            } else {
                c1165370gQp5 = c1165370gQp9;
            }
            if (!c1165370gQp5.LLILZ) {
                C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
                if (c1165370gQp9 == null) {
                    c1165370gQp9 = null;
                }
                Long lValueOf4 = Long.valueOf(c1165370gQp9.LLIZ);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Aweme> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C1166800gT8(it3.next(), null));
                }
                c317290CcB3.getClass();
                return new C323380Cm0(null, lValueOf4, arrayList2);
            }
        }
        if (c1165370gQp9 == null) {
            c1165370gQp3 = null;
        } else {
            c1165370gQp3 = c1165370gQp9;
        }
        if (c1165370gQp3.LLILZ) {
            if (c1165370gQp9 == null) {
                c1165370gQp4 = null;
            } else {
                c1165370gQp4 = c1165370gQp9;
            }
            if (!c1165370gQp4.LLILZIL) {
                C317290CcB c317290CcB4 = AbstractC316870CbV.LIZ;
                if (c1165370gQp9 == null) {
                    c1165370gQp9 = null;
                }
                Long lValueOf5 = Long.valueOf(c1165370gQp9.LLILZLL);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Aweme> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new C1166800gT8(it4.next(), null));
                }
                c317290CcB4.getClass();
                return new C323380Cm0(lValueOf5, null, arrayList3);
            }
        }
        C317290CcB c317290CcB5 = AbstractC316870CbV.LIZ;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new C1166800gT8(it5.next(), null));
        }
        c317290CcB5.getClass();
        return new C316640Cb8(arrayList4);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        long j;
        C1165370gQp c1165370gQp = null;
        if (i != 2) {
            if (i != 4) {
                j = 0;
            } else {
                C1165370gQp c1165370gQp2 = this.LLILZIL;
                if (c1165370gQp2 != null) {
                    c1165370gQp = c1165370gQp2;
                }
                j = c1165370gQp.LLIZ;
            }
        } else {
            C1165370gQp c1165370gQp3 = this.LLILZIL;
            if (c1165370gQp3 != null) {
                c1165370gQp = c1165370gQp3;
            }
            j = c1165370gQp.LLILZLL;
        }
        return Long.valueOf(j);
    }
}
