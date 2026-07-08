package com.ss.android.ugc.aweme.story.highlights.service;

import X.AnonymousClass0950;
import X.C06TF;
import X.C2252321DDq;
import X.C2252331DDr;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface IStoryHighlightsMyDataManager {
    void LIZ(List<StoryHighlightCollection> list);

    boolean LIZIZ();

    C06TF LIZJ();

    Aweme LIZLLL(String str);

    Object LJ(String str, String str2, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    Object LJFF(String str, String str2, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    boolean LJI();

    C2252321DDq LJII();

    void LJIIIIZZ();

    void LJIIIZ();

    AnonymousClass0950 LJIIJ();

    Object LJIIJJI(String str, InterfaceC1364105Vn<? super StoryHighlightGetDetailResponse> interfaceC1364105Vn);

    void LJIIL(Aweme aweme);

    void LJIILIIL(String str, String str2, StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponse);

    Object LJIILJJIL(String str, String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    List<StoryHighlightAwemePreview> LJIILL();

    boolean LJIILLIIL();

    boolean LJIIZILJ(String str);

    Object LJIJ(Context context, StoryHighlightCollection storyHighlightCollection, String str, String str2, String str3, StoryHighlightCollection.CoverType coverType, List<String> list, String str4, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    boolean LJIJI(List<String> list);

    StoryHighlightsAwemeDetailResponse LJIJJ(String str);

    Object LJIJJLI(String str, InterfaceC1364105Vn<? super StoryHighlightListForAwemeResponse> interfaceC1364105Vn);

    void LJIL();

    String LJJ(Context context, String str);

    void LJJI();

    C2252331DDr LJJIFFI();

    Object LJJII(Context context, String str, String str2, String str3, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    Object LJJIII(Context context, String str, String str2, String str3, StoryHighlightCollection.CoverType coverType, List<String> list, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    Object LJJIIJ(String str, String str2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    AnonymousClass0950 LJJIIJZLJL();

    Object LJJIIZ(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    void LJJIIZI();

    Object LJJIJ(List<String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean LJJIJIIJI();

    void LJJIJIIJIL(List<StoryHighlightAwemePreview> list);

    void LJJIJIL();

    AnonymousClass0950 LJJIJL();

    Object LJJIJLIJ(String str, InterfaceC1364105Vn<? super StoryHighlightDeleteResponse> interfaceC1364105Vn);
}
