package com.ss.ttm.player;

import X.InterfaceC1470080oMI;
import X.InterfaceC1470900oNc;
import X.InterfaceC1470910oNd;
import X.InterfaceC1470920oNe;
import X.InterfaceC1470930oNf;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;

/* JADX INFO: loaded from: classes24.dex */
public class u implements InterfaceC1470080oMI {
    @Override // X.InterfaceC1470080oMI
    public final void LIZ(int i, String str) {
    }

    @Override // X.InterfaceC1470080oMI
    public final long LIZIZ(int i, long j) {
        return -1L;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZJ(int i, int i2) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZLLL(s sVar) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJ(boolean z) {
    }

    @Override // X.InterfaceC1470080oMI
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1470080oMI
    public final int LJI(int i, int i2) {
        return i2;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJII() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIIIIZZ(Context context, Uri uri) {
    }

    @Override // X.InterfaceC1470080oMI
    public final String LJIIIZ(int i) {
        return null;
    }

    @Override // X.InterfaceC1470080oMI
    public final long LJIIJ(int i, long j) {
        return j;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIILLIIL(float f, float f2) {
    }

    @Override // X.InterfaceC1470080oMI
    public final int getCurrentPosition() {
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getDuration() {
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getPlayerType() {
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoHeight() {
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoWidth() {
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.InterfaceC1470080oMI
    public final void pause() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void prepareAsync() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void release() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void reset() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void seekTo(int i) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void setLooping(boolean z) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf) {
    }

    @Override // X.InterfaceC1470080oMI
    public final void start() {
    }

    @Override // X.InterfaceC1470080oMI
    public final void stop() {
    }

    static {
        TTVersion.LIZ();
    }

    @Override // X.InterfaceC1470080oMI
    public final void setSurface(Surface surface) {
        if (surface != null) {
            surface.isValid();
        }
    }
}
