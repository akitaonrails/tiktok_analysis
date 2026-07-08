package com.ss.android.ugc.aweme.ui.feed.subphoto.holders;

import X.C0RDF;
import X.C0SMB;
import X.C0SMN;
import X.C0SZS;
import X.C0SZU;
import X.C19EG;
import X.C719950SLx;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAssemViewHolder extends C0SMB implements C0SMN<PhotoAssemViewHolder, C719950SLx> {
    public final /* synthetic */ C0SMN<PhotoAssemViewHolder, C719950SLx> LLILZ;

    @Override // X.C0SMN
    public final C0RDF C41() {
        return this.LLILZ.C41();
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLILZ.E82();
    }

    @Override // X.C0SMN
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public final void SN1(int i, C719950SLx c719950SLx) {
        this.LLILZ.SN1(i, c719950SLx);
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLILZ.LJJIJL();
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<PhotoAssemViewHolder, C719950SLx> LJJJLL() {
        return this.LLILZ.LJJJLL();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLILZ.LLIIIILZ();
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return this.LLILZ.Mk2();
    }

    @Override // X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLILZ.NG1();
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLILZ.PO1();
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLILZ.Sl0(view, interfaceC719640SKs);
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLILZ.getActivity();
    }

    @Override // X.C0SMO
    public final C0SZU<PhotoAssemViewHolder, C719950SLx> getChild() {
        return this.LLILZ.getChild();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ.getLifecycle();
    }

    @Override // X.C0SMO
    public final C0SZS<PhotoAssemViewHolder, C719950SLx> getProxy() {
        return this.LLILZ.getProxy();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLILZ.k0();
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLILZ.md1();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LLILZ.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<PhotoAssemViewHolder, C719950SLx> c0szs) {
        this.LLILZ.setProxy(c0szs);
    }

    @Override // X.C0SMN
    public final void wY0() {
        this.LLILZ.wY0();
    }

    public PhotoAssemViewHolder(View view, FeedPhotoSlidesAdapter$createAssemVHContainer$1 feedPhotoSlidesAdapter$createAssemVHContainer$1) {
        super(view);
        this.LLILZ = feedPhotoSlidesAdapter$createAssemVHContainer$1;
        Sl0(view, this);
    }
}
