package com.ss.android.ugc.aweme.share.base.download.configuration;

import X.AbstractC21169117sn;
import X.C06KX;
import X.C19719912Dl;
import X.InterfaceC21168617si;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DownloadConfiguration<CONTEXT extends AbstractC21169117sn> implements C06KX {
    public DownloadAbilityProtocol<CONTEXT> LIZ(CONTEXT context) {
        return null;
    }

    public abstract C19719912Dl LIZLLL();

    public MuteAudioAbilityProtocol<CONTEXT> LJ(CONTEXT context) {
        return null;
    }

    public WaterMarkAbilityProtocol<CONTEXT> LJFF(CONTEXT context) {
        return null;
    }

    public DownloadUIProtocol LIZJ() {
        return new DownloadUIProtocol() { // from class: com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration$getDownloadUIProtocol$1
            @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol
            public final <CONTEXT extends AbstractC21169117sn> InterfaceC21168617si vn0(CONTEXT context) {
                return new InterfaceC21168617si() { // from class: X.0m5T
                    @Override // X.InterfaceC21168617si
                    public final void LIZ(Context context2) {
                    }

                    @Override // X.InterfaceC21168617si
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC21168617si
                    public final void onFailed(int i) {
                    }

                    @Override // X.InterfaceC21168617si
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC21168617si
                    public final void onSuccess() {
                    }
                };
            }
        };
    }
}
