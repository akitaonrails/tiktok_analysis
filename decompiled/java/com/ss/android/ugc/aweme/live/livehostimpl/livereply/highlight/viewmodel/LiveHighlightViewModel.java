package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel;

import X.AbstractC1387200mCc;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09RB;
import X.C0PEM;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1833710xon;
import X.C1833720xoo;
import X.C1833730xop;
import X.C1834250xpf;
import X.C1834260xpg;
import X.C1834270xph;
import X.C1834580xqC;
import X.C1834780xqW;
import X.C1906580ziK;
import X.C1939607ik;
import X.C197024126s;
import X.C1DFH;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C23260099m;
import X.C259800zU;
import X.C323840Cmk;
import X.C324000Cn0;
import X.C344030DeD;
import X.C497740JfY;
import X.C575530Mhj;
import X.C786410Ut5;
import X.EnumC1219690hqR;
import X.EnumC1782300wTs;
import X.EnumC997910c4j;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC20498115It;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS90S0201000_4;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor.HighlightCollectionElement;
import tikcast.api.anchor.LiveFragmentDetail;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveHighlightViewModel extends AssemViewModel<C1834780xqW> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public int LLILLL;
    public boolean LLIZ;
    public LiveFragmentDetail LLIZLLLIL;
    public final C324000Cn0 LL = new C324000Cn0();
    public boolean LLILLJJLI = true;
    public final Map<Long, Long> LLILZ = new LinkedHashMap();
    public final Map<Long, String> LLILZIL = new LinkedHashMap();
    public final Map<String, List<MusicSong>> LLILZLL = new LinkedHashMap();
    public final Map<Long, List<Caption>> LLJ = new LinkedHashMap();
    public final Map<Long, Integer> LLJI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1834780xqW(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) this.LLJ).clear();
        ((LinkedHashMap) this.LLJI).clear();
        ((LinkedHashMap) this.LLILZLL).clear();
        ((LinkedHashMap) this.LLILZIL).clear();
        ((LinkedHashMap) this.LLILZ).clear();
    }

    public static TextStickerConfig zQ2(PublishPageParams publishPageParams) {
        if (publishPageParams != null && publishPageParams.canAddSticker && (!publishPageParams.textStickerConfig.isEmpty()) && ((TextStickerConfig) ListProtector.get(publishPageParams.textStickerConfig, 0)).text.length() > 0) {
            return C575530Mhj.LIZ((TextStickerConfig) ListProtector.get(publishPageParams.textStickerConfig, 0));
        }
        return null;
    }

    public final void AQ2(long j) {
        String strLJIJJ;
        Object next;
        List<C1834580xqC> list;
        List<C1833730xop> list2 = getState().LLILLL.LIZ;
        Iterator<C1833730xop> it2 = list2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            List<C1834580xqC> list3 = it2.next().LLILLL;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<C1834580xqC> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LLILZ == j) {
                        if (i >= 0 && list2.size() > i) {
                            C1833730xop c1833730xop = (C1833730xop) ListProtector.get(list2, i);
                            setState(AFwS269S0000000_27.get$arr$(456));
                            List<C1834580xqC> list4 = c1833730xop.LLILLL;
                            ArrayList arrayList = new ArrayList();
                            for (C1834580xqC c1834580xqC : list4) {
                                if (c1834580xqC.LLILZ != j) {
                                    arrayList.add(c1834580xqC);
                                }
                            }
                            if (c1833730xop.LLILLJJLI == EnumC1782300wTs.HIGHLIGHT.getValue()) {
                                if (this.LLILLL == 5) {
                                    strLJIJJ = C497740JfY.LJIJJ(2131855675, String.valueOf(arrayList.size()));
                                } else {
                                    strLJIJJ = C497740JfY.LJIJJ(2131851074, String.valueOf(arrayList.size()));
                                }
                            } else {
                                strLJIJJ = C497740JfY.LJIJJ(2131851072, String.valueOf(arrayList.size()));
                            }
                            C1833730xop c1833730xopLIZ = C1833730xop.LIZ(c1833730xop, strLJIJJ, arrayList, 10);
                            setState(new AwS90S0201000_4((List) list2, (List<C1833730xop>) i, (int) c1833730xopLIZ, (C1833730xop) 1));
                            C1834580xqC c1834580xqC2 = (C1834580xqC) C13LP.LJJJLL(c1833730xopLIZ.LLILLL);
                            if (c1834580xqC2 == null) {
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                Iterator<C1833730xop> it4 = list2.iterator();
                                int i2 = 0;
                                while (true) {
                                    c1834580xqC2 = null;
                                    if (it4.hasNext()) {
                                        C1833730xop next2 = it4.next();
                                        int i3 = i2 + 1;
                                        if (i2 >= 0) {
                                            if (i2 == i) {
                                                next2 = c1833730xopLIZ;
                                            }
                                            arrayList2.add(next2);
                                            i2 = i3;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    } else {
                                        Iterator it5 = arrayList2.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next = it5.next();
                                                if (!((C1833730xop) next).LLILLL.isEmpty()) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        C1833730xop c1833730xop2 = (C1833730xop) next;
                                        if (c1833730xop2 != null && (list = c1833730xop2.LLILLL) != null) {
                                            c1834580xqC2 = (C1834580xqC) C13LP.LJJJLL(list);
                                        }
                                    }
                                }
                            }
                            GQ2(c1834580xqC2, false);
                            runOnUIThread(AFwS269S0000000_27.get$arr$(457));
                            return;
                        }
                        return;
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r7
      0x003b: PHI (r7v4 java.lang.Integer) = (r7v2 java.lang.Integer), (r7v1 java.lang.Integer) binds: [B:13:0x0039, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(X.C1834580xqC r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto Lab
            r0 = 85
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r9.setState(r0)
            com.bytedance.android.livesdk.livesetting.highlight.LiveHighlightAddSubtitleSetting r0 = com.bytedance.android.livesdk.livesetting.highlight.LiveHighlightAddSubtitleSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L92
            long r4 = r10.LLILZ
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L92
            java.util.Map<java.lang.Long, java.lang.Integer> r1 = r9.LLJI
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r7 = r1.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            com.bytedance.android.livesdk.replay.proto.PublishPageParams r0 = r10.LLJILLL
            r2 = 0
            if (r0 == 0) goto La9
            int r0 = r0.captionStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L34:
            if (r11 == 0) goto L38
            if (r7 != 0) goto L3b
        L38:
            r7 = r0
            if (r0 == 0) goto L44
        L3b:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.util.Map<java.lang.Long, java.lang.Integer> r0 = r9.LLJI
            r0.put(r1, r7)
        L44:
            X.0xqY r3 = X.C1834550xq9.LIZ(r7)
            if (r3 == 0) goto L53
            kotlin.jvm.internal.AwS41S0100100_4 r1 = new kotlin.jvm.internal.AwS41S0100100_4
            r0 = 1
            r1.<init>(r4, r3, r0)
            r9.setState(r1)
        L53:
            java.util.Map<java.lang.Long, java.util.List<com.bytedance.android.livesdk.replay.proto.Caption>> r1 = r9.LLJ
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r6 = r1.get(r0)
            java.util.List r6 = (java.util.List) r6
            com.bytedance.android.livesdk.replay.proto.PublishPageParams r0 = r10.LLJILLL
            if (r0 == 0) goto L67
            java.util.List<com.bytedance.android.livesdk.replay.proto.Caption> r2 = r0.captions
        L67:
            if (r6 == 0) goto L6f
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L81
        L6f:
            if (r2 == 0) goto L92
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L92
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.util.Map<java.lang.Long, java.util.List<com.bytedance.android.livesdk.replay.proto.Caption>> r0 = r9.LLJ
            r0.put(r1, r2)
            r6 = r2
        L81:
            if (r6 == 0) goto L92
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L92
            kotlin.jvm.internal.AwS26S0200100_4 r3 = new kotlin.jvm.internal.AwS26S0200100_4
            r8 = 0
            r3.<init>(r4, r6, r7, r8)
            r9.setState(r3)
        L92:
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 77
            r1.<init>(r10, r0)
            r9.setState(r1)
            if (r11 == 0) goto La8
            kotlin.jvm.internal.AwS583S0100000_4 r1 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 78
            r1.<init>(r10, r0)
            r9.setState(r1)
        La8:
            return
        La9:
            r0 = r2
            goto L34
        Lab:
            r0 = 43
            kotlin.jvm.internal.AFwS232S0000000_4 r0 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r9.setState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel.GQ2(X.0xqC, boolean):void");
    }

    public final void vQ2(long j, EnumC1219690hqR enumC1219690hqR) {
        boolean z;
        List<C1833730xop> list = getState().LLILLL.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1833730xop c1833730xop : list) {
            List<C1834580xqC> list2 = c1833730xop.LLILLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C1834580xqC c1834580xqCLIZ : list2) {
                if (c1834580xqCLIZ.LLILZ == j) {
                    c1834580xqCLIZ = C1834580xqC.LIZ(c1834580xqCLIZ, 0, false, null, false, null, -1, 63);
                    c1834580xqCLIZ.LLJJIII = enumC1219690hqR.getValue();
                    if (enumC1219690hqR.getValue() == EnumC1219690hqR.POST_STATUS_SUCCESS.getValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1834580xqCLIZ.LLJJI = z;
                    C1834580xqC c1834580xqCLIZ2 = getState().LLILZ.LIZ();
                    if (c1834580xqCLIZ2 != null && j == c1834580xqCLIZ2.LLILZ) {
                        setState(new AwS606S0100000_27(c1834580xqCLIZ, 132));
                        setState(new AwS606S0100000_27(c1834580xqCLIZ, 133));
                    }
                }
                arrayList2.add(c1834580xqCLIZ);
            }
            arrayList.add(C1833730xop.LIZ(c1833730xop, null, arrayList2, 11));
        }
        setState(new AwS606S0100000_27(arrayList, (List<TakoActiveBotItem>) 131));
    }

    public static Object wQ2(long j, Context context, InterfaceC1364105Vn interfaceC1364105Vn) {
        Context contextN3;
        Activity activityLIZIZ;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        IMusicService iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null);
        if (iMusicService != null) {
            if (context == null || (contextN3 = C786410Ut5.N3(context)) == null) {
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
                    contextN3 = C786410Ut5.N3(activityLIZIZ);
                } else {
                    contextN3 = null;
                }
            }
            iMusicService.LJJIJIIJIL(null, contextN3, new InterfaceC20498115It() { // from class: X.0xpi
                @Override // X.InterfaceC20498115It
                public final void onFailed(Exception exc) {
                    C2243608qg.LIZ(null, c23260099m);
                }

                @Override // X.InterfaceC20498115It
                public final void onSuccess(MusicModel musicModel, String str) {
                    C2243608qg.LIZ(str, c23260099m);
                }
            }, String.valueOf(j), false, false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void BQ2(int i, int i2, boolean z) {
        C1834580xqC c1834580xqCLIZ = getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null) {
            long j = c1834580xqCLIZ.LLILZ;
            if (j == 0) {
                return;
            }
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C323840Cmk(this, j, i, i2, z, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[PHI: r2
      0x0031: PHI (r2v1 boolean) = (r2v0 boolean), (r2v5 boolean) binds: [B:17:0x002e, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[PHI: r2 r3
      0x0015: PHI (r2v3 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:20:0x0032, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x0015: PHI (r3v3 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:20:0x0032, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FQ2(X.C1834580xqC r12, android.content.Context r13, boolean r14) {
        /*
            r11 = this;
            r3 = 1
            r6 = r12
            r5 = r11
            if (r6 == 0) goto L2d
            int r1 = r6.LL
            X.0wTs r0 = X.EnumC1782300wTs.HIGHLIGHT
            int r0 = r0.getValue()
            if (r1 != r0) goto L2d
            r2 = 1
        L10:
            int r1 = r6.LLIZ
            r0 = 2
            if (r1 != r0) goto L31
        L15:
            if (r2 == 0) goto L67
            if (r3 == 0) goto L67
            if (r14 != 0) goto L67
            long r2 = r6.LLILZ
            java.util.Map<java.lang.String, java.util.List<webcast.data.MusicSong>> r0 = r5.LLILZLL
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L35
            java.lang.String r1 = "LiveHighlightViewModel"
            java.lang.String r0 = "do not have musics."
            X.C20441214yg.LIZIZ(r1, r0)
            return
        L2d:
            r2 = 0
            if (r6 == 0) goto L31
            goto L10
        L31:
            r3 = 0
            if (r6 == 0) goto L67
            goto L15
        L35:
            java.util.Map<java.lang.String, java.util.List<webcast.data.MusicSong>> r1 = r5.LLILZLL
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5d
            java.lang.Object r4 = X.C13LP.LJJJLL(r0)
            webcast.data.MusicSong r4 = (webcast.data.MusicSong) r4
            if (r4 == 0) goto L5d
            long r7 = r6.LLJLLIL
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            long r7 = r4.id
        L57:
            r10 = 1
            r9 = r13
            r5.CQ2(r6, r7, r9, r10)
            return
        L5d:
            kotlin.jvm.internal.AwS23S0000100_4 r1 = new kotlin.jvm.internal.AwS23S0000100_4
            r0 = 0
            r1.<init>(r2, r0)
            r5.setState(r1)
            return
        L67:
            X.0Cmm r0 = new X.0Cmm
            r0.<init>(r2, r3, r14)
            r5.setState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel.FQ2(X.0xqC, android.content.Context, boolean):void");
    }

    public final void HQ2(long j, TextStickerConfig textStickerConfig, boolean z) {
        Double dValueOf;
        Object next;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        List<C1833730xop> list = getState().LLILLL.LIZ;
        C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(list), AFwS269S0000000_27.get$arr$(86)));
        while (true) {
            dValueOf = null;
            if (c197024126s.hasNext()) {
                next = c197024126s.next();
                if (((C1834580xqC) next).LLILZ == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1834580xqC c1834580xqC = (C1834580xqC) next;
        if (c1834580xqC == null) {
            return;
        }
        if (Intrinsics.LJFF(c1834580xqC.LLJZIJLIL, textStickerConfig) && c1834580xqC.LLJZ == z) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextStickerConfig fragment=");
        sbLIZ.append(j);
        sbLIZ.append(", oldRatio=(");
        TextStickerConfig textStickerConfig2 = c1834580xqC.LLJZIJLIL;
        if (textStickerConfig2 != null) {
            dValueOf2 = Double.valueOf(textStickerConfig2.centerX);
        } else {
            dValueOf2 = null;
        }
        sbLIZ.append(dValueOf2);
        sbLIZ.append(',');
        TextStickerConfig textStickerConfig3 = c1834580xqC.LLJZIJLIL;
        if (textStickerConfig3 != null) {
            dValueOf3 = Double.valueOf(textStickerConfig3.centerY);
        } else {
            dValueOf3 = null;
        }
        sbLIZ.append(dValueOf3);
        sbLIZ.append("), newRatio=(");
        if (textStickerConfig != null) {
            dValueOf4 = Double.valueOf(textStickerConfig.centerX);
        } else {
            dValueOf4 = null;
        }
        sbLIZ.append(dValueOf4);
        sbLIZ.append(',');
        if (textStickerConfig != null) {
            dValueOf = Double.valueOf(textStickerConfig.centerY);
        }
        sbLIZ.append(dValueOf);
        sbLIZ.append("), oldVisible=");
        sbLIZ.append(c1834580xqC.LLJZ);
        sbLIZ.append(", newVisible=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveHighlightViewModel", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C1834270xph(list, j, z, textStickerConfig));
    }

    public final void CQ2(C1834580xqC c1834580xqC, long j, Context context, boolean z) {
        long j2 = c1834580xqC.LLILZ;
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C344030DeD(this, j2, j, z, context, null), 2);
    }

    public final boolean IQ2(String str, String str2, boolean z, boolean z2) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        if (lLJIILIIL == null) {
            return false;
        }
        long jLongValue = lLJIILIIL.longValue();
        if (jLongValue == 0) {
            return false;
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1833720xoo(this, str, str2, z, z2, jLongValue, null), 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1834580xqC DQ2(tikcast.api.anchor.LiveFragmentDetail r63, boolean r64, boolean r65, boolean r66, X.EnumC1782300wTs r67) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel.DQ2(tikcast.api.anchor.LiveFragmentDetail, boolean, boolean, boolean, X.0wTs):X.0xqC");
    }

    public final List<C1834580xqC> xQ2(AnchorFragmentListResult anchorFragmentListResult, List<HighlightCollectionElement> list, boolean z, Boolean bool, Integer num) {
        boolean zBooleanValue;
        String str;
        String str2;
        float f;
        long j;
        long j2;
        boolean z2;
        String str3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (HighlightCollectionElement highlightCollectionElement : (ArrayList) list) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            int value = EnumC1782300wTs.AUTOCUT.getValue();
            String str4 = highlightCollectionElement.roomIdStr;
            long j3 = highlightCollectionElement.id;
            String str5 = highlightCollectionElement.coverUrl;
            String str6 = highlightCollectionElement.name;
            int i = highlightCollectionElement.videoStatus;
            VideoMetaInfo videoMetaInfo = highlightCollectionElement.mp4VideoMetaInfo;
            String str7 = "";
            if (videoMetaInfo == null || (str = videoMetaInfo.url) == null) {
                str = "";
            }
            VideoMetaInfo videoMetaInfo2 = highlightCollectionElement.originalVideoMetaInfo;
            if (videoMetaInfo2 == null || (str2 = videoMetaInfo2.url) == null) {
                str2 = "";
            }
            String str8 = highlightCollectionElement.messageContentPb;
            if (videoMetaInfo != null) {
                f = videoMetaInfo.duration;
            } else {
                f = 0.0f;
            }
            int i2 = highlightCollectionElement.type;
            PublishPageParams publishPageParams = highlightCollectionElement.publishPageParams;
            boolean z3 = highlightCollectionElement.isPosted;
            int i3 = highlightCollectionElement.postStatus;
            int size = highlightCollectionElement.videoList.size();
            String str9 = highlightCollectionElement.messageShareScene;
            int i4 = this.LLILLL;
            VideoMetaInfo videoMetaInfo3 = highlightCollectionElement.mp4VideoMetaInfo;
            if (videoMetaInfo3 != null) {
                j = videoMetaInfo3.width;
                j2 = videoMetaInfo3.height;
            } else {
                j = 0;
                j2 = 0;
            }
            String str10 = highlightCollectionElement.vid;
            if (videoMetaInfo3 != null && (str3 = videoMetaInfo3.fileId) != null) {
                str7 = str3;
            }
            TextStickerConfig textStickerConfigZQ2 = zQ2(highlightCollectionElement.publishPageParams);
            if (zQ2(highlightCollectionElement.publishPageParams) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new C1834580xqC(value, str4, z, j3, str5, str6, i, str, str2, str8, 0L, f, i2, publishPageParams, "", z3, i3, size, str9, i4, 0L, false, 0, false, "", zBooleanValue, false, false, j, j2, str10, str7, z2, textStickerConfigZQ2, false, -2143289344));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!Intrinsics.LJFF(bool, Boolean.TRUE) || num == null || num.intValue() != 16 || arrayList2.size() >= 3) {
            return arrayList2;
        }
        int size2 = 3 - arrayList2.size();
        List<LiveFragmentDetail> list2 = anchorFragmentListResult.fragmentList;
        if (!list2.isEmpty()) {
            List listLL = C13LP.LL(list2, size2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList3.add(DQ2((LiveFragmentDetail) it2.next(), z, false, bool.booleanValue(), EnumC1782300wTs.HIGHLIGHT));
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    public static void EQ2(LiveHighlightViewModel liveHighlightViewModel, long j, int i, boolean z, String str, Boolean bool, int i2) {
        String str2 = str;
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        Boolean bool2 = null;
        if ((i2 & 16) == 0) {
            bool2 = bool;
        }
        liveHighlightViewModel.getClass();
        C259800zU c259800zU = new C259800zU();
        C1834580xqC c1834580xqCLIZ = liveHighlightViewModel.getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null && c1834580xqCLIZ.LLILZ == j) {
            liveHighlightViewModel.setState(new C1834260xpg(c1834580xqCLIZ, i, z, str2, bool2, c259800zU));
        }
        liveHighlightViewModel.setState(new C1834250xpf(liveHighlightViewModel.getState().LLILLL.LIZ, j, c259800zU, i, z, str2, bool2));
    }

    public final void yQ2(String str, String str2, boolean z, int i, int i2, Boolean bool, EnumC997910c4j enumC997910c4j, Integer num) {
        setState(AFwS269S0000000_27.get$arr$(80));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1833710xon(this.LLIZLLLIL, this, str, i, enumC997910c4j, num, str2, z, bool, i2, null), 2);
    }
}
