package com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel;

import X.C0H8A;
import X.C13LP;
import X.C20638115pL;
import X.C20638315pN;
import X.C661040PwM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchDetailKeyframeBottomVM extends BaseSearchDetailKeyframeVM {
    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void vQ2(int i, C0H8A c0h8a) {
        AQ2(Integer.valueOf(i), c0h8a, "start");
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void wQ2(int i, C0H8A c0h8a) {
        AQ2(Integer.valueOf(i), c0h8a, "end");
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void yQ2(int i, final C0H8A c0h8a) {
        final List<SearchKeyFramePoint> list;
        final int iIntValue;
        super.yQ2(i, c0h8a);
        Integer numValueOf = Integer.valueOf(i);
        final Aweme aweme = this.LLILLL;
        if (aweme != null && (list = this.LLILZ) != null) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = getState().LL;
            }
            final ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LL.getValue();
            new C661040PwM<C20638315pN>(aweme, list, iSearchContextAbility, iIntValue, c0h8a) { // from class: X.15pN
                {
                    String strValueOf;
                    SearchKeyFramePoint searchKeyFramePoint;
                    String str;
                    String str2 = "";
                    if (iIntValue == -1) {
                        strValueOf = "";
                    } else {
                        strValueOf = String.valueOf(iIntValue);
                    }
                    LJIJI("click_chapter_rank", strValueOf);
                    if (c0h8a != null && (searchKeyFramePoint = c0h8a.LLILLJJLI) != null && (str = searchKeyFramePoint.title) != null) {
                        str2 = str;
                    }
                    LJIJI("click_chapter_title", str2);
                }
            }.LJIILJJIL();
        }
    }

    public final void AQ2(final Integer num, C0H8A c0h8a, final String str) {
        final List<SearchKeyFramePoint> list;
        int iIntValue;
        final C0H8A c0h8a2 = c0h8a;
        final Aweme aweme = this.LLILLL;
        if (aweme == null || (list = this.LLILZ) == null) {
            return;
        }
        if (c0h8a2 == null) {
            List<C0H8A> list2 = getState().LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c0h8a2 = (C0H8A) C13LP.LJJJLZIJ(iIntValue, list2);
        }
        final ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LL.getValue();
        new C661040PwM<C20638115pL>(aweme, list, iSearchContextAbility, num, c0h8a2, str) { // from class: X.15pL
            /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
            {
                /*
                    r9 = this;
                    java.lang.String r0 = "key_card_show"
                    r1 = r11
                    r9.<init>(r0, r10, r1, r12)
                    r2 = 0
                    r5 = 0
                    r0 = 298(0x12a, float:4.18E-43)
                    kotlin.jvm.internal.AFwS276S0000000_31 r7 = kotlin.jvm.internal.AFwS276S0000000_31.get$arr$(r0)
                    r8 = 31
                    r3 = r2
                    r4 = r2
                    r6 = r2
                    java.lang.String r1 = X.C13LP.LJJLIIIJ(r1, r2, r3, r4, r5, r6, r7, r8)
                    java.lang.String r0 = "sub_titles_list"
                    r9.LJIIZILJ(r0, r1)
                    if (r13 == 0) goto L44
                    r13.intValue()
                    java.lang.String r1 = "highlight_chapter_rank"
                    java.lang.String r0 = r13.toString()
                    r9.LJIIZILJ(r1, r0)
                    if (r14 == 0) goto L45
                    com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint r0 = r14.LLILLJJLI
                    if (r0 == 0) goto L34
                    java.lang.String r1 = r0.subTitlePlaying
                    if (r1 != 0) goto L3a
                L34:
                    com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint r0 = r14.LLILLJJLI
                    if (r0 == 0) goto L45
                    java.lang.String r1 = r0.title
                L3a:
                    java.lang.String r0 = "highlight_chapter_title"
                    r9.LJIIZILJ(r0, r1)
                    java.lang.String r0 = "status"
                    r9.LJIIZILJ(r0, r15)
                L44:
                    return
                L45:
                    r1 = 0
                    goto L3a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20638115pL.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility, java.lang.Integer, X.0H8A, java.lang.String):void");
            }
        }.LJIILJJIL();
    }
}
