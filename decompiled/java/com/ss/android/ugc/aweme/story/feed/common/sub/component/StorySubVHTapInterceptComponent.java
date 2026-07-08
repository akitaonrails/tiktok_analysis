package com.ss.android.ugc.aweme.story.feed.common.sub.component;

import X.AbstractC693100RGq;
import X.C01GW;
import X.C1558520qew;
import X.C1618440sDa;
import X.C19580611jA;
import X.C2188811AlT;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690980R8m;
import X.C690990R8n;
import X.C692910RFx;
import X.C693080RGo;
import X.C693090RGp;
import X.C705930RmZ;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C726890SfH;
import X.C729510SjV;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.collection.story.ability.StoryInvisibleVideoAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StorySubVHTapInterceptComponent extends BaseSubVHTapTouchInterceptComponent<StorySubVHTapInterceptComponent> {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 611));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(148));

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent
    public final AbstractC693100RGq hp(float f, float f2, int i, long j) {
        Object obj;
        String aid;
        Object obj2;
        Object obj3;
        List<InteractStickerStruct> interactStickerStructs;
        Object obj4;
        InteractStickerStruct next;
        ViewGroup viewGroup;
        Object obj5;
        Object obj6;
        OcrLocation ocrLocation;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSingleTap[Story]: processing， curAid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
        if (AwemeExtKt.isSharedStoryVisible(aweme2) && !AwemeExtKt.isProhibited(aweme2) && !AwemeExtKt.isCommentPostInvisible(aweme2)) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            Aweme aweme3 = ((VideoItemParams) obj3).getAweme();
            if (aweme3 != null && (interactStickerStructs = aweme3.getInteractStickerStructs()) != null && !interactStickerStructs.isEmpty()) {
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().getType() == 19) {
                        C724270Sb3 c724270Sb34 = this.LLJI;
                        if (c724270Sb34 != null) {
                            obj4 = c724270Sb34.LL;
                        } else {
                            obj4 = null;
                        }
                        List<InteractStickerStruct> interactStickerStructs2 = ((VideoItemParams) obj4).getAweme().getInteractStickerStructs();
                        if (interactStickerStructs2 != null) {
                            Iterator<InteractStickerStruct> it3 = interactStickerStructs2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (next.getType() == 19) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            InteractStickerStruct interactStickerStruct = next;
                            if (interactStickerStruct != null) {
                                View viewLJJIJL = LJJIJL();
                                if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                                    Context context = viewGroup.getContext();
                                    C724270Sb3 c724270Sb35 = this.LLJI;
                                    if (c724270Sb35 != null) {
                                        obj5 = c724270Sb35.LL;
                                    } else {
                                        obj5 = null;
                                    }
                                    Aweme aweme4 = ((VideoItemParams) obj5).getAweme();
                                    C692910RFx c692910RFx = (C692910RFx) this.LLJLLL.getValue();
                                    C724270Sb3 c724270Sb36 = this.LLJI;
                                    if (c724270Sb36 != null) {
                                        obj6 = c724270Sb36.LL;
                                    } else {
                                        obj6 = null;
                                    }
                                    Aweme aweme5 = ((VideoItemParams) obj6).getAweme();
                                    if (aweme5 != null) {
                                        ocrLocation = AwemeExtKt.getOcrLocation(aweme5);
                                    } else {
                                        ocrLocation = null;
                                    }
                                    C690990R8n c690990R8nLIZ = new C690980R8m(context, aweme4, c692910RFx, ocrLocation, viewGroup, (CellAdaptionComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), CellAdaptionComponentAbility.class, null)).LIZ();
                                    C705930RmZ c705930RmZ = new C705930RmZ();
                                    c705930RmZ.LIZ = c690990R8nLIZ.LIZ;
                                    c705930RmZ.LIZIZ = c690990R8nLIZ.LIZIZ;
                                    if (C726890SfH.LIZJ(f, f2, C19580611jA.LIZIZ(interactStickerStruct), c705930RmZ, viewGroup.getContext(), C724240Sb0.LJI(this))) {
                                        ip(Float.valueOf(f), Float.valueOf(f2), i, j);
                                        return new C693080RGo(true, true, 0, 4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return C693090RGp.LIZLLL;
        }
        return C693090RGp.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BaseSubVHTapTouchInterceptComponent
    public final void ip(Float f, Float f2, int i, long j) {
        Object obj;
        InterfaceC665370Q7z interfaceC665370Q7z;
        StoryInvisibleVideoAbility storyInvisibleVideoAbility;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C729510SjV.LJIJJLI(((VideoItemParams) obj).getAweme())) {
            C1618440sDa.LIZIZ.LJIJJLI().LJIILJJIL(j);
        }
        super.ip(f, f2, i, j);
        if (f != null && f2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue()) != null && (storyInvisibleVideoAbility = (StoryInvisibleVideoAbility) C1558520qew.LIZ(interfaceC665370Q7z, StoryInvisibleVideoAbility.class, null)) != null) {
            storyInvisibleVideoAbility.wG0();
        }
        FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJLLIL.getValue();
        if (fakePlayerAbility != null) {
            fakePlayerAbility.wg2();
        }
    }
}
