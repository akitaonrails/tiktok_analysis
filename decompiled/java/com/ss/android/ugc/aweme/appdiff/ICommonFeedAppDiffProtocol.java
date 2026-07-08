package com.ss.android.ugc.aweme.appdiff;

import X.C0SPT;
import X.C1865480ye2;
import android.view.View;
import com.ss.android.ugc.aweme.experiment.FeedAdaptionMultiContainerSettingsConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: loaded from: classes29.dex */
public interface ICommonFeedAppDiffProtocol {
    public static final C1865480ye2 LIZ = C1865480ye2.LIZ;

    void LIZ();

    FeedAdaptionMultiContainerSettingsConfig LIZIZ(AFwS217S0000000_28 aFwS217S0000000_28);

    View.OnClickListener LIZJ(C0SPT c0spt);

    void LIZLLL();

    void LJ();

    void LJFF(AwS412S0200000_11 awS412S0200000_11);

    void LJI();

    void LJII();

    void LJIIIIZZ();

    int LJIIIZ(AFwS190S0000000_4 aFwS190S0000000_4);

    void LJIIJ();

    void LJIIJJI();

    boolean LJIIL(AwS429S0200000_28 awS429S0200000_28);

    void LJIILIIL();

    public static final class DowngradeInstance implements ICommonFeedAppDiffProtocol {
        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LIZ() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final View.OnClickListener LIZJ(C0SPT c0spt) {
            return c0spt;
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LIZLLL() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJ() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJI() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJII() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJIIIIZZ() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJIIJ() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJIIJJI() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJIILIIL() {
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final FeedAdaptionMultiContainerSettingsConfig LIZIZ(AFwS217S0000000_28 aFwS217S0000000_28) {
            return (FeedAdaptionMultiContainerSettingsConfig) aFwS217S0000000_28.invoke();
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final void LJFF(AwS412S0200000_11 awS412S0200000_11) {
            awS412S0200000_11.invoke();
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final int LJIIIZ(AFwS190S0000000_4 aFwS190S0000000_4) {
            return ((Number) aFwS190S0000000_4.invoke()).intValue();
        }

        @Override // com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol
        public final boolean LJIIL(AwS429S0200000_28 awS429S0200000_28) {
            return ((Boolean) awS429S0200000_28.invoke()).booleanValue();
        }
    }
}
