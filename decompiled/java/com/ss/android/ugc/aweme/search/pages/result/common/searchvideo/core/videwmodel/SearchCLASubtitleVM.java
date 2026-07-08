package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C09JN;
import X.C0Q5F;
import X.C0Q5I;
import X.C0Q5T;
import X.C0Q5W;
import X.C0Q66;
import X.C0Q6B;
import X.C11S5;
import X.C1485670olR;
import X.C161N;
import X.C20703515zt;
import X.C2188811AlT;
import X.C650460PfI;
import X.C653660PkS;
import X.C664650Q5f;
import X.C664730Q5n;
import X.C664740Q5o;
import X.EnumC664680Q5i;
import X.InterfaceC0148002o;
import X.InterfaceC1472010oPP;
import X.InterfaceC664660Q5g;
import X.InterfaceC738070SxJ;
import Y.AfS178S0100000_9;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCLASubtitleVM extends AssemViewModelWithItem<C664740Q5o, InterfaceC664660Q5g> implements InterfaceC738070SxJ<C664740Q5o, InterfaceC664660Q5g> {
    public final C0Q66 LL = new InterfaceC1472010oPP() { // from class: X.0Q66
        @Override // X.InterfaceC1472010oPP
        public final /* synthetic */ String LIZ(String str) {
            return "";
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [X.0Q6E] */
        @Override // X.InterfaceC1472010oPP
        public final void LIZIZ(int i, String str, String str2) {
            int i2;
            if (str2 != null) {
                try {
                    i2 = JSONObjectProtectorUtils.getInt(new JSONObject(str2), "sub_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
            SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
            ?? r2 = new Object(str, i, i2) { // from class: X.0Q6E
                public final String LIZ;
                public final int LIZIZ;
                public final int LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0Q6E)) {
                        return false;
                    }
                    C0Q6E c0q6e = (C0Q6E) obj;
                    return Intrinsics.LJFF(this.LIZ, c0q6e.LIZ) && this.LIZIZ == c0q6e.LIZIZ && this.LIZJ == c0q6e.LIZJ;
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = i;
                    this.LIZJ = i2;
                }
            };
            searchCLASubtitleVM.getClass();
            searchCLASubtitleVM.setState(new AwS589S0100000_10((C0Q6E) r2, 624));
            C1485670olR.LIZ().LIZJ(i, null, str2, str, false, false);
        }

        @Override // X.InterfaceC1472010oPP
        public final void LIZLLL(int i, String str, String str2) {
            SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
            C0Q6D c0q6d = new C0Q6D(str, i, str2);
            searchCLASubtitleVM.getClass();
            searchCLASubtitleVM.setState(new AwS589S0100000_10(c0q6d, 623));
            C1485670olR.LIZ().LIZJ(i, null, str2, str, false, true);
        }

        @Override // X.InterfaceC1472010oPP
        public final void LIZJ(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3, int i5) {
            C0Q6C c0q6c = new C0Q6C();
            C0Q69 c0q69 = c0q6c.LIZ;
            c0q69.LIZ = str;
            c0q69.LIZIZ = i4;
            c0q69.LIZJ = str2;
            c0q69.LJ = i5;
            Integer numValueOf = Integer.valueOf(i2);
            C0Q69 c0q692 = c0q6c.LIZ;
            c0q692.LIZLLL = numValueOf;
            SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
            searchCLASubtitleVM.getClass();
            searchCLASubtitleVM.setState(new AwS589S0100000_10(c0q692, 625));
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C664740Q5o(0);
    }

    public final void xQ2(Aweme aweme) {
        Integer numValueOf;
        Integer numValueOf2;
        C664650Q5f c664650Q5fLLJLLIL;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        CaptionModel captionModel2;
        List<CaptionItemModel> list2;
        long j;
        Integer numValueOf3;
        String strLJIIIZ = C20703515zt.LJIIIZ(aweme);
        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
        C0Q5W.LIZ.getClass();
        String str = null;
        Integer numValueOf4 = null;
        str = null;
        boolean zLIZIZ = false;
        if (!C0Q5W.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("change SubtitlesLanguages SubId");
            if (captionItemModelLJIIIIZZ != null) {
                numValueOf3 = Integer.valueOf(captionItemModelLJIIIIZZ.subId);
            } else {
                numValueOf3 = null;
            }
            sbLIZ.append(numValueOf3);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C664730Q5n.LIZ.getClass();
            if (C664730Q5n.LIZ(aweme) && C664730Q5n.LIZLLL(strLJIIIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("captionList.size:");
                Video video = aweme.getVideo();
                if (video != null && (captionModel2 = video.getCaptionModel()) != null && (list2 = captionModel2.captionList) != null) {
                    numValueOf2 = Integer.valueOf(list2.size());
                } else {
                    numValueOf2 = null;
                }
                sbLIZ2.append(numValueOf2);
                sbLIZ2.append(" aid:");
                sbLIZ2.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ2);
                Video video2 = aweme.getVideo();
                if (video2 != null && (captionModel = video2.getCaptionModel()) != null && (list = captionModel.captionList) != null) {
                    for (CaptionItemModel captionItemModel : list) {
                        String str2 = captionItemModel.languageCode;
                        C664730Q5n.LIZ.getClass();
                        if (Intrinsics.LJFF(str2, C664730Q5n.LIZJ())) {
                            zQ2(this, false, Integer.valueOf(captionItemModel.subId), null, captionItemModel.claSubtitleId, C1485670olR.LIZIZ(captionItemModel), 4);
                            return;
                        }
                    }
                }
                C0Q5T.LIZ.getClass();
                C664730Q5n.LIZ.getClass();
                CaptionItemModel captionItemModelLJII = C161N.LIZIZ.LJII(aweme, C664730Q5n.LIZJ());
                if (captionItemModelLJII != null) {
                    zQ2(this, true, null, new C0Q5I(aweme.getAid(), captionItemModelLJII.subId, captionItemModelLJII), r8.LIZIZ, false, 2);
                    return;
                }
                InterfaceC664660Q5g item = getItem();
                if (item != null && (c664650Q5fLLJLLIL = item.LLJLLIL()) != null) {
                    str = c664650Q5fLLJLLIL.LIZIZ;
                }
                setState(AFwS241S0000000_10.get$arr$(560));
                vQ2(aweme, str, new AwS589S0100000_10(this, 617), new AwS589S0100000_10(this, 620));
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("change SubtitlesLanguages:");
            if (captionItemModelLJIIIIZZ != null) {
                numValueOf = Integer.valueOf(captionItemModelLJIIIIZZ.subId);
            } else {
                numValueOf = null;
            }
            sbLIZ3.append(numValueOf);
            sbLIZ3.append(' ');
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (captionItemModelLJIIIIZZ != null) {
            numValueOf4 = Integer.valueOf(captionItemModelLJIIIIZZ.subId);
        }
        if (captionItemModelLJIIIIZZ != null) {
            j = captionItemModelLJIIIIZZ.claSubtitleId;
        } else {
            j = 0;
        }
        if (captionItemModelLJIIIIZZ != null) {
            zLIZIZ = C1485670olR.LIZIZ(captionItemModelLJIIIIZZ);
        }
        zQ2(this, false, numValueOf4, null, j, zLIZIZ, 4);
    }

    public final void yQ2(EnumC664680Q5i enumC664680Q5i) {
        setState(new AwS589S0100000_10(enumC664680Q5i, 235));
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC664660Q5g state2ItemAccept(InterfaceC0148002o interfaceC0148002o, InterfaceC664660Q5g interfaceC664660Q5g) {
        return interfaceC664660Q5g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, X.06Xj] */
    @Override // X.InterfaceC738070SxJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o itemSync2StateAccept(X.InterfaceC0148002o r11, X.InterfaceC664660Q5g r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM.itemSync2StateAccept(X.002o, java.lang.Object, java.util.List):X.002o");
    }

    public static void vQ2(final Aweme aweme, String str, final Function1 function1, final Function1 function12) {
        Long lLJIIJ;
        String str2 = str;
        if (aweme != null && (lLJIIJ = C20703515zt.LJIIJ(aweme)) != null) {
            long jLongValue = lLJIIJ.longValue();
            C664730Q5n.LIZ.getClass();
            final String strLIZJ = C664730Q5n.LIZJ();
            C161N c161n = C161N.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            c161n.LJIILJJIL(jLongValue, aweme, strLIZJ, str2).LJL(C11S5.LIZ()).LJJIJIIJI(new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 31)).LJJIJIIJIL(new C09JN() { // from class: X.0Q5q
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SearchCLASubtitleVM@363d.internalFetchRealtimeTranslation$2");
                    if (!Intrinsics.LJFF(obj, Boolean.TRUE)) {
                        function1.invoke(new Throwable("fetch fail"));
                    } else {
                        CaptionItemModel captionItemModelLJII = C161N.LIZIZ.LJII(aweme, strLIZJ);
                        if (captionItemModelLJII == null) {
                            function1.invoke(new Throwable("Oops! success fetch but no cache"));
                        } else {
                            function12.invoke(captionItemModelLJII);
                        }
                    }
                    C1C7U.LIZIZ("SearchCLASubtitleVM@363d.internalFetchRealtimeTranslation$2");
                }
            }).LJJLJ();
        }
    }

    public static void wQ2(Aweme aweme, C653660PkS c653660PkS, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String aid;
        String str6;
        C650460PfI<C0Q6B> c650460PfI = new C650460PfI<C0Q6B>() { // from class: X.0Q6B
        };
        String str7 = null;
        if (c653660PkS != null) {
            str3 = c653660PkS.LJIIIIZZ;
        } else {
            str3 = null;
        }
        c650460PfI.LJIJJ(str3);
        if (c653660PkS != null) {
            str4 = c653660PkS.LIZLLL;
        } else {
            str4 = null;
        }
        c650460PfI.LJIIZILJ("search_type", str4);
        if (c653660PkS != null) {
            str5 = c653660PkS.LJIIJ;
        } else {
            str5 = null;
        }
        c650460PfI.LJIIZILJ("search_id", str5);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c650460PfI.LJIJI("search_result_id", aid);
        if (c653660PkS != null) {
            str7 = c653660PkS.LJFF;
        }
        c650460PfI.LJIIZILJ("search_keyword", str7);
        if (Intrinsics.LJFF(Boolean.FALSE, Boolean.TRUE)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c650460PfI.LJIIZILJ("is_fullscreen", str6);
        c650460PfI.LJ("switch_status", str);
        if (str2 != null) {
            c650460PfI.LJJIJIL(str2);
        }
        c650460PfI.LJIILJJIL();
    }

    public static void zQ2(SearchCLASubtitleVM searchCLASubtitleVM, boolean z, Integer num, C0Q5I c0q5i, long j, boolean z2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            c0q5i = null;
        }
        searchCLASubtitleVM.getClass();
        searchCLASubtitleVM.setState(new AwS589S0100000_10(new C0Q5F(z, num, c0q5i), 626));
    }
}
