package com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel;

import X.C0H8A;
import X.C13LP;
import X.C20638015pK;
import X.C20638215pM;
import X.C661030PwL;
import X.EnumC1782610wUN;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchDetailKeyframeSheetVM extends BaseSearchDetailKeyframeVM {
    public AwS575S0100000_31 LLILZIL;

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void vQ2(int i, C0H8A c0h8a) {
        BQ2(Integer.valueOf(i), c0h8a, "start");
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void wQ2(int i, C0H8A c0h8a) {
        BQ2(Integer.valueOf(i), c0h8a, "end");
    }

    @Override // com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.BaseSearchDetailKeyframeVM
    public final void yQ2(int i, C0H8A c0h8a) {
        super.yQ2(i, c0h8a);
        AQ2(EnumC1782610wUN.ENTER, Integer.valueOf(i), c0h8a);
        AwS575S0100000_31 awS575S0100000_31 = this.LLILZIL;
        if (awS575S0100000_31 != null) {
            awS575S0100000_31.invoke();
        }
    }

    public final void AQ2(final EnumC1782610wUN enumC1782610wUN, Integer num, C0H8A c0h8a) {
        final List<SearchKeyFramePoint> list;
        final int iIntValue;
        final C0H8A c0h8a2 = c0h8a;
        final Aweme aweme = this.LLILLL;
        if (aweme == null || (list = this.LLILZ) == null) {
            return;
        }
        String mob = enumC1782610wUN.getMob();
        EnumC1782610wUN enumC1782610wUN2 = EnumC1782610wUN.ENTER;
        if (Intrinsics.LJFF(mob, enumC1782610wUN2.getMob())) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = getState().LL;
            }
        } else {
            iIntValue = -1;
        }
        if (Intrinsics.LJFF(enumC1782610wUN.getMob(), enumC1782610wUN2.getMob())) {
            if (c0h8a2 == null) {
                c0h8a2 = (C0H8A) C13LP.LJJJLZIJ(iIntValue, getState().LLILLL);
            }
        } else {
            c0h8a2 = null;
        }
        final ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LL.getValue();
        new C661030PwL<C20638215pM>(aweme, list, iSearchContextAbility, iIntValue, c0h8a2, enumC1782610wUN) { // from class: X.15pM
            {
                String strValueOf;
                SearchKeyFramePoint searchKeyFramePoint;
                String str;
                SearchKeyFramePoint searchKeyFramePoint2;
                String str2;
                String str3 = "";
                if (iIntValue == -1) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(iIntValue);
                }
                LJIJI("click_chapter_rank", strValueOf);
                LJIJI("click_chapter_title", (c0h8a2 == null || (searchKeyFramePoint2 = c0h8a2.LLILLJJLI) == null || (str2 = searchKeyFramePoint2.title) == null) ? "" : str2);
                if (c0h8a2 != null && (searchKeyFramePoint = c0h8a2.LLILLJJLI) != null && (str = searchKeyFramePoint.contentDetails) != null) {
                    str3 = str;
                }
                LJIJI("click_chapter_note", str3);
                LJIIZILJ("click_type", enumC1782610wUN.getMob());
            }
        }.LJIILJJIL();
    }

    public final void BQ2(final Integer num, final C0H8A c0h8a, final String str) {
        final List<SearchKeyFramePoint> list;
        final Aweme aweme = this.LLILLL;
        if (aweme == null || (list = this.LLILZ) == null) {
            return;
        }
        final ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LL.getValue();
        new C661030PwL<C20638015pK>(aweme, list, iSearchContextAbility, num, c0h8a, str) { // from class: X.15pK
            {
                SearchKeyFramePoint searchKeyFramePoint;
                SearchKeyFramePoint searchKeyFramePoint2;
                String str2 = null;
                LJIIZILJ("sub_titles_list", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS276S0000000_31.get$arr$(294), 31));
                LJIIZILJ("sub_notes_list", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS276S0000000_31.get$arr$(295), 31));
                if (num != null) {
                    num.intValue();
                    LJIIZILJ("highlight_chapter_rank", num.toString());
                    String str3 = null;
                    if (c0h8a != null && (searchKeyFramePoint2 = c0h8a.LLILLJJLI) != null) {
                        str2 = searchKeyFramePoint2.title;
                    }
                    LJIIZILJ("highlight_chapter_title", str2);
                    if (c0h8a != null && (searchKeyFramePoint = c0h8a.LLILLJJLI) != null) {
                        str3 = searchKeyFramePoint.contentDetails;
                    }
                    LJIIZILJ("highlight_chapter_note", str3);
                    LJIIZILJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
                }
            }
        }.LJIILJJIL();
    }
}
