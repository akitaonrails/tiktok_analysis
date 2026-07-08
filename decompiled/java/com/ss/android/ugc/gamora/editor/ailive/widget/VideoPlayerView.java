package com.ss.android.ugc.gamora.editor.ailive.widget;

import X.C08CU;
import X.C2286708xd;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.gamora.editor.ailive.widget.VideoPlayerView;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import cxo.a4;
import fyo.e;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes33.dex */
public final class VideoPlayerView implements LifecycleEventObserver {
    public final Context LL;
    public final Lifecycle LLILLJJLI;
    public final int LLILLL;
    public final Function2<Integer, Integer, Pair<Integer, Integer>> LLILZ;
    public Surface LLILZIL;
    public TTVideoEngine LLILZLL;
    public TextureView LLIZ;
    public View LLIZLLLIL;
    public int LLJ;

    public /* synthetic */ VideoPlayerView(Context context, Lifecycle lifecycle) {
        this(context, lifecycle, -1, null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        TTVideoEngine tTVideoEngine;
        TTVideoEngine tTVideoEngine2;
        TTVideoEngine tTVideoEngine3;
        int i = C08CU.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TTVideoEngine tTVideoEngine4 = this.LLILZLL;
                    if (tTVideoEngine4 != null) {
                        tTVideoEngine4.release();
                    }
                    Surface surface = this.LLILZIL;
                    if (surface != null) {
                        surface.release();
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    return;
                }
                return;
            }
            TTVideoEngine tTVideoEngine5 = this.LLILZLL;
            if (tTVideoEngine5 == null || tTVideoEngine5.LJJLIIIJILLIZJL() != 1 || (tTVideoEngine3 = this.LLILZLL) == null) {
                return;
            }
            tTVideoEngine3.pause();
            return;
        }
        TTVideoEngine tTVideoEngine6 = this.LLILZLL;
        if (tTVideoEngine6 == null || !tTVideoEngine6.LJJZZIII() || (tTVideoEngine = this.LLILZLL) == null || tTVideoEngine.LJJLIIIJILLIZJL() != 2) {
            return;
        }
        int i2 = this.LLILLL;
        if ((i2 != -1 && this.LLJ >= i2) || (tTVideoEngine2 = this.LLILZLL) == null) {
            return;
        }
        tTVideoEngine2.play();
    }

    public final void LIZ(View view, String str, String str2) {
        this.LLILLJJLI.addObserver(this);
        this.LLIZLLLIL = view.findViewById(R.id.fig);
        this.LLIZ = (TextureView) view.findViewById(R.id.xry);
        this.LLJ = 0;
        TTVideoEngine tTVideoEngine = this.LLILZLL;
        if (tTVideoEngine != null && this.LLILZIL != null) {
            tTVideoEngine.play();
        } else {
            TTVideoEngine tTVideoEngine2 = new TTVideoEngine(this.LL, 2);
            this.LLILZLL = tTVideoEngine2;
            tTVideoEngine2.LLILZIL("TikTokSAARootGroupScene");
            TTVideoEngine tTVideoEngine3 = this.LLILZLL;
            if (tTVideoEngine3 != null) {
                tTVideoEngine3.setLooping(true);
            }
            TTVideoEngine tTVideoEngine4 = this.LLILZLL;
            if (tTVideoEngine4 != null) {
                tTVideoEngine4.LIZJ(199, 1);
            }
            TTVideoEngine tTVideoEngine5 = this.LLILZLL;
            if (tTVideoEngine5 != null) {
                tTVideoEngine5.LIZJ(4, 2);
            }
            TTVideoEngine tTVideoEngine6 = this.LLILZLL;
            if (tTVideoEngine6 != null) {
                tTVideoEngine6.LLI(new a4() { // from class: X.18Zq
                    @Override // cxo.a4
                    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine7) {
                    }

                    @Override // cxo.a4
                    public final void LIZJ(TTVideoEngine tTVideoEngine7, int i) {
                    }

                    @Override // cxo.a4
                    public final void LJI(e eVar) {
                    }

                    @Override // cxo.a4
                    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine7) {
                    }

                    @Override // cxo.a4
                    public final void LJIIIZ(TTVideoEngine tTVideoEngine7) {
                    }

                    @Override // cxo.a4
                    public final void LJIIJJI(TTVideoEngine tTVideoEngine7, int i, int i2) {
                    }

                    @Override // cxo.a4
                    public final void LJIIL(TTVideoEngine tTVideoEngine7, int i) {
                    }

                    @Override // cxo.a4
                    public final void LJIJ(TTVideoEngine tTVideoEngine7, int i) {
                    }

                    @Override // cxo.a4
                    public final void LJIJI(TTVideoEngine tTVideoEngine7, int i) {
                    }

                    @Override // cxo.a4
                    public final void LJIJJLI(int i) {
                    }

                    @Override // cxo.a4
                    public final void LJ(TTVideoEngine tTVideoEngine7) {
                        TextureView textureView = this.LL.LLIZ;
                        if (textureView != null) {
                            C375780EoK.LIZJ(textureView, true);
                        }
                        View view2 = this.LL.LLIZLLLIL;
                        if (view2 != null) {
                            C375780EoK.LIZIZ(view2, false);
                        }
                    }

                    @Override // cxo.a4
                    public final void LJIILIIL(TTVideoEngine tTVideoEngine7) {
                        int iLIZIZ;
                        int iLIZ;
                        if (tTVideoEngine7 == null) {
                            return;
                        }
                        VideoPlayerView videoPlayerView = this.LL;
                        Function2<Integer, Integer, Pair<Integer, Integer>> function2 = videoPlayerView.LLILZ;
                        if (function2 != null) {
                            Pair<Integer, Integer> pairInvoke = function2.invoke(Integer.valueOf(tTVideoEngine7.LJJLJ()), Integer.valueOf(tTVideoEngine7.LJJLIIIJLLLLLLLZ()));
                            int iIntValue = pairInvoke.getFirst().intValue();
                            int iIntValue2 = pairInvoke.getSecond().intValue();
                            TextureView textureView = this.LL.LLIZ;
                            if (textureView != null) {
                                C12ES.LJIIZILJ(iIntValue, iIntValue2, textureView);
                                return;
                            }
                            return;
                        }
                        int iLJJLJ = tTVideoEngine7.LJJLJ();
                        int iLJJLIIIJLLLLLLLZ = tTVideoEngine7.LJJLIIIJLLLLLLLZ();
                        videoPlayerView.getClass();
                        if (iLJJLJ <= 0 || iLJJLIIIJLLLLLLLZ <= 0) {
                            return;
                        }
                        float f = iLJJLIIIJLLLLLLLZ;
                        float f2 = iLJJLJ;
                        float fLIZIZ = (C1415610mwR.LIZIZ() * f) / f2;
                        if (fLIZIZ >= C1415610mwR.LIZ()) {
                            iLIZ = C1415610mwR.LIZ();
                            iLIZIZ = (int) ((iLIZ * f2) / f);
                        } else {
                            iLIZIZ = C1415610mwR.LIZIZ();
                            iLIZ = (int) fLIZIZ;
                        }
                        TextureView textureView2 = videoPlayerView.LLIZ;
                        if (textureView2 == null) {
                            return;
                        }
                        C12ES.LJIIZILJ(iLIZIZ, iLIZ, textureView2);
                    }

                    @Override // cxo.a4
                    public final void LJIILL(TTVideoEngine tTVideoEngine7) {
                        VideoPlayerView videoPlayerView = this.LL;
                        int i = videoPlayerView.LLJ + 1;
                        videoPlayerView.LLJ = i;
                        int i2 = videoPlayerView.LLILLL;
                        if (i2 != -1 && i >= i2 && tTVideoEngine7 != null) {
                            tTVideoEngine7.setLooping(false);
                            if (tTVideoEngine7 != null) {
                                long jLJJJJL = tTVideoEngine7.LJJJJL();
                                if (jLJJJJL > 0) {
                                    if (tTVideoEngine7 != null) {
                                        tTVideoEngine7.LJIJJLI((int) jLJJJJL, null);
                                    } else {
                                        return;
                                    }
                                } else if (tTVideoEngine7 == null) {
                                    return;
                                }
                                tTVideoEngine7.pause();
                            }
                        }
                    }
                });
            }
        }
        TextureView textureView = this.LLIZ;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.18Zr
                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    VideoPlayerView videoPlayerView = this.LL;
                    if (videoPlayerView.LLILZIL == null) {
                        videoPlayerView.LLILZIL = new Surface(surfaceTexture);
                    }
                    VideoPlayerView videoPlayerView2 = this.LL;
                    TTVideoEngine tTVideoEngine7 = videoPlayerView2.LLILZLL;
                    if (tTVideoEngine7 != null) {
                        tTVideoEngine7.setSurface(videoPlayerView2.LLILZIL);
                        TTVideoEngine tTVideoEngine8 = this.LL.LLILZLL;
                        if (tTVideoEngine8 != null) {
                            tTVideoEngine8.play();
                        }
                    }
                }
            });
        }
        if (C2286708xd.LIZJ(str)) {
            TTVideoEngine tTVideoEngine7 = this.LLILZLL;
            if (tTVideoEngine7 != null) {
                tTVideoEngine7.LJIJ(str);
                return;
            }
            return;
        }
        TTVideoEngine tTVideoEngine8 = this.LLILZLL;
        if (tTVideoEngine8 == null) {
            return;
        }
        tTVideoEngine8.LJIJI(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPlayerView(Context context, Lifecycle lifecycle, int i, Function2<? super Integer, ? super Integer, Pair<Integer, Integer>> function2) {
        this.LL = context;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = i;
        this.LLILZ = function2;
    }
}
