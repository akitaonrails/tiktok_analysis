package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.AbstractC528270Knh;
import X.AbstractC528580KoC;
import X.C0CNO;
import X.C15O7;
import X.C1659640tI2;
import X.C1954807lC;
import X.C2217381BqS;
import X.C528590KoD;
import X.C528600KoE;
import X.C528610KoF;
import X.C528620KoG;
import X.C528630KoH;
import X.C528720KoQ;
import X.C529210KpD;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ChooseMediaExtensionKt {
    public static final C2217381BqS LIZ(AbstractC528580KoC abstractC528580KoC) {
        if (Intrinsics.LJFF(abstractC528580KoC, C528590KoD.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getAllMediaList();
                }
            };
        }
        if (Intrinsics.LJFF(abstractC528580KoC, C528620KoG.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getPhotoMediaList();
                }
            };
        }
        if (Intrinsics.LJFF(abstractC528580KoC, C528630KoH.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getVideoMediaList();
                }
            };
        }
        if (Intrinsics.LJFF(abstractC528580KoC, C528600KoE.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getLivePhotoMediaList();
                }
            };
        }
        if (Intrinsics.LJFF(abstractC528580KoC, C528720KoQ.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getAiContentMediaList();
                }
            };
        }
        if (Intrinsics.LJFF(abstractC528580KoC, C528610KoF.LIZ)) {
            return new C2217381BqS() { // from class: X.0KoP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getLiveRecordingsMediaList();
                }
            };
        }
        throw new C1954807lC();
    }

    public static final void LIZIZ(C529210KpD c529210KpD, MediaModel mediaModel) {
        C0CNO.LIZ(C15O7.LJI, new AwS409S0200000_8(c529210KpD, mediaModel, 32));
    }

    public static final void LIZJ(final AbstractC528270Knh abstractC528270Knh, final AbstractC528580KoC abstractC528580KoC) {
        abstractC528270Knh.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt$selectMediaList$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                abstractC528270Knh.getLifecycle().removeObserver(this);
                BaseJediViewModel.iR2((BaseJediViewModel) C1659640tI2.LIZJ(abstractC528270Knh.mView).LIZ(ChooseMediaViewModel.class), abstractC528270Knh, ChooseMediaExtensionKt.LIZ(abstractC528580KoC), new AwS374S0200000_8(this, abstractC528270Knh, 46));
                BaseJediViewModel baseJediViewModel = (BaseJediViewModel) C1659640tI2.LIZJ(abstractC528270Knh.mView).LIZ(ChooseMediaViewModel.class);
                AbstractC528270Knh abstractC528270Knh2 = abstractC528270Knh;
                BaseJediViewModel.iR2(baseJediViewModel, abstractC528270Knh2, new C2217381BqS() { // from class: X.0KoJ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getAlbumAssetCount();
                    }
                }, new AwS374S0200000_8(this, abstractC528270Knh2, 47));
            }
        });
    }
}
