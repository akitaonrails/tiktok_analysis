package com.ss.android.ugc.aweme.share.base.download.configuration.protocol;

import X.AbstractC21169117sn;
import X.C06KX;
import X.InterfaceC21171017t6;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DownloadAbilityProtocol<CONTEXT extends AbstractC21169117sn> implements C06KX {
    public final CONTEXT LL;

    public abstract void LIZ(Context context);

    public abstract boolean LIZJ(String str, String str2, String str3);

    public InterfaceC21171017t6 LIZLLL() {
        return null;
    }

    public String LJ() {
        return "";
    }

    public abstract List<String> LJFF();

    public abstract void LJI();

    public abstract void LJII(AbsDownloadListener absDownloadListener);

    public abstract boolean LJIIIIZZ(String str, String str2, String str3, String str4);

    public DownloadAbilityProtocol(CONTEXT context) {
        this.LL = context;
    }
}
