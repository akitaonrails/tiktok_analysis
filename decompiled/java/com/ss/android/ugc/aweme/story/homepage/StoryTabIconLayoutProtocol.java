package com.ss.android.ugc.aweme.story.homepage;

import X.C09RD;
import X.C09RE;
import X.C1585060rLk;
import X.C1596000rdO;
import X.C1600640rks;
import X.C19252910Tv;
import X.C295430Bi1;
import X.C418440Gaw;
import X.C426750GoL;
import X.C705890RmV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1584350rKb;
import X.InterfaceC1570900qyu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryTabIconLayoutProtocol implements TabIconCustomLayoutProtocol {
    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void WT0(ViewGroup viewGroup) {
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        ViewGroup viewGroup2 = null;
        ViewGroup viewGroup3 = null;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            Object tag = view.getTag();
            if (Intrinsics.LJFF(tag, EnumC1584350rKb.SEARCH.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup2 = (ViewGroup) view;
                } else {
                    viewGroup2 = null;
                }
            } else if (Intrinsics.LJFF(tag, EnumC1584350rKb.LIVE.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup3 = (ViewGroup) view;
                } else {
                    viewGroup3 = null;
                }
            }
        }
        if (viewGroup2 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                C786410Ut5.W5(viewGroup, layoutParams);
                if (viewGroup3 == null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 != null) {
                        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
                            iLIZIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJI(iLIZIZ, false);
                        }
                        layoutParams2.width = iLIZIZ;
                        C786410Ut5.W5(viewGroup2, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
                    if (layoutParams3 != null) {
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        C19252910Tv c19252910Tv2 = C19252910Tv.LIZIZ;
                        if (c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                            iLIZIZ2 = c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJI(iLIZIZ2, true);
                        }
                        layoutParams3.width = iLIZIZ2;
                        C786410Ut5.W5(viewGroup2, layoutParams3);
                        View childAt = viewGroup2.getChildAt(0);
                        if (childAt != null) {
                            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                            if (layoutParams4 != null) {
                                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                                layoutParams5.gravity = 8388629;
                                if (C295430Bi1.LIZ() && !c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                                    layoutParams5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                                    layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                    layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                }
                                C786410Ut5.W5(childAt, layoutParams5);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        }
                        ViewGroup.LayoutParams layoutParams6 = viewGroup3.getLayoutParams();
                        if (layoutParams6 != null) {
                            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            if (c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                                iLIZIZ3 = c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJI(iLIZIZ3, true);
                            }
                            layoutParams6.width = iLIZIZ3;
                            C786410Ut5.W5(viewGroup3, layoutParams6);
                            View childAt2 = viewGroup3.getChildAt(0);
                            if (childAt2 != null) {
                                ViewGroup.LayoutParams layoutParams7 = childAt2.getLayoutParams();
                                if (layoutParams7 != null) {
                                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                                    layoutParams8.gravity = 8388629;
                                    if (C295430Bi1.LIZ() && !c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                                        layoutParams8.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                        layoutParams8.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                        layoutParams8.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                    } else {
                                        layoutParams8.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8)));
                                    }
                                    C786410Ut5.W5(childAt2, layoutParams8);
                                    C426750GoL.LJIIL(childAt2, 0, 0, 0, 0, 16);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJ(null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void Yv2(ViewGroup viewGroup) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        ViewGroup viewGroup2 = null;
        ViewGroup viewGroup3 = null;
        ViewGroup viewGroup4 = null;
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            Object tag = view.getTag();
            if (Intrinsics.LJFF(tag, EnumC1584350rKb.STORY_CAMERA.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup3 = (ViewGroup) view;
                } else {
                    viewGroup3 = null;
                }
            } else if (Intrinsics.LJFF(tag, EnumC1584350rKb.STORY.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup4 = (ViewGroup) view;
                } else {
                    viewGroup4 = null;
                }
            } else if (Intrinsics.LJFF(tag, EnumC1584350rKb.LIVE.getTag())) {
                if (view instanceof FrameLayout) {
                    viewGroup2 = (ViewGroup) view;
                } else {
                    viewGroup2 = null;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            C786410Ut5.W5(viewGroup, layoutParams);
            if (C1596000rdO.LIZ()) {
                if (viewGroup2 == null) {
                    if (viewGroup3 != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            C786410Ut5.W5(viewGroup3, layoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    if (viewGroup4 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewGroup4.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            C786410Ut5.W5(viewGroup4, layoutParams3);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    return;
                }
                if (C1585060rLk.LIZLLL()) {
                    iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                } else {
                    iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                }
                if (C1585060rLk.LIZLLL()) {
                    if (C295430Bi1.LIZ()) {
                        iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    } else {
                        iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    }
                } else if (C295430Bi1.LIZ()) {
                    iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8));
                }
                if (viewGroup3 != null) {
                    ViewGroup.LayoutParams layoutParams4 = viewGroup3.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.W5(viewGroup3, layoutParams4);
                        View childAt = viewGroup3.getChildAt(0);
                        if (childAt != null) {
                            ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                            if (layoutParams5 != null) {
                                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                                layoutParams6.gravity = 8388627;
                                layoutParams6.setMarginStart(iLIZIZ5);
                                C786410Ut5.W5(childAt, layoutParams6);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewGroup4 != null) {
                    ViewGroup.LayoutParams layoutParams7 = viewGroup4.getLayoutParams();
                    if (layoutParams7 != null) {
                        layoutParams7.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.W5(viewGroup4, layoutParams7);
                        View childAt2 = viewGroup4.getChildAt(0);
                        if (childAt2 != null) {
                            ViewGroup.LayoutParams layoutParams8 = childAt2.getLayoutParams();
                            if (layoutParams8 != null) {
                                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
                                layoutParams9.gravity = 8388627;
                                layoutParams9.setMarginStart(iLIZIZ5);
                                C786410Ut5.W5(childAt2, layoutParams9);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                ViewGroup.LayoutParams layoutParams10 = viewGroup2.getLayoutParams();
                if (layoutParams10 != null) {
                    layoutParams10.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    C786410Ut5.W5(viewGroup2, layoutParams10);
                    View childAt3 = viewGroup2.getChildAt(0);
                    if (childAt3 == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams11 = childAt3.getLayoutParams();
                    if (layoutParams11 != null) {
                        FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) layoutParams11;
                        layoutParams12.gravity = 8388627;
                        if (C295430Bi1.LIZ()) {
                            layoutParams12.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            layoutParams12.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        }
                        layoutParams12.setMarginStart(iLIZIZ6);
                        C786410Ut5.W5(childAt3, layoutParams12);
                        C426750GoL.LJIIL(childAt3, 0, 0, 0, 0, 16);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (viewGroup2 == null) {
                if (C1600640rks.LIZ()) {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                } else {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                }
                if (viewGroup3 != null) {
                    ViewGroup.LayoutParams layoutParams13 = viewGroup3.getLayoutParams();
                    if (layoutParams13 != null) {
                        layoutParams13.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        C786410Ut5.W5(viewGroup3, layoutParams13);
                        View childAt4 = viewGroup3.getChildAt(0);
                        if (childAt4 != null) {
                            ViewGroup.LayoutParams layoutParams14 = childAt4.getLayoutParams();
                            if (layoutParams14 != null) {
                                FrameLayout.LayoutParams layoutParams15 = (FrameLayout.LayoutParams) layoutParams14;
                                layoutParams15.gravity = 8388627;
                                layoutParams15.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                                C786410Ut5.W5(childAt4, layoutParams15);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (viewGroup4 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams16 = viewGroup4.getLayoutParams();
                if (layoutParams16 != null) {
                    layoutParams16.width = -2;
                    C786410Ut5.W5(viewGroup4, layoutParams16);
                    View childAt5 = viewGroup4.getChildAt(0);
                    if (childAt5 == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams17 = childAt5.getLayoutParams();
                    if (layoutParams17 != null) {
                        FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) layoutParams17;
                        layoutParams18.gravity = 8388627;
                        layoutParams18.setMarginStart(iLIZIZ4);
                        C786410Ut5.W5(childAt5, layoutParams18);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (C1585060rLk.LIZLLL()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            if (C1585060rLk.LIZLLL()) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
            }
            if (C1585060rLk.LIZLLL()) {
                if (C295430Bi1.LIZ()) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                }
            } else if (C295430Bi1.LIZ()) {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8));
            }
            if (viewGroup3 != null) {
                ViewGroup.LayoutParams layoutParams19 = viewGroup3.getLayoutParams();
                if (layoutParams19 != null) {
                    layoutParams19.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(viewGroup3, layoutParams19);
                    View childAt6 = viewGroup3.getChildAt(0);
                    if (childAt6 != null) {
                        ViewGroup.LayoutParams layoutParams20 = childAt6.getLayoutParams();
                        if (layoutParams20 != null) {
                            FrameLayout.LayoutParams layoutParams21 = (FrameLayout.LayoutParams) layoutParams20;
                            layoutParams21.gravity = 8388627;
                            layoutParams21.setMarginStart(iLIZIZ);
                            C786410Ut5.W5(childAt6, layoutParams21);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            if (viewGroup4 != null) {
                ViewGroup.LayoutParams layoutParams22 = viewGroup4.getLayoutParams();
                if (layoutParams22 != null) {
                    layoutParams22.width = -2;
                    C786410Ut5.W5(viewGroup4, layoutParams22);
                    View childAt7 = viewGroup4.getChildAt(0);
                    if (childAt7 != null) {
                        ViewGroup.LayoutParams layoutParams23 = childAt7.getLayoutParams();
                        if (layoutParams23 != null) {
                            FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) layoutParams23;
                            layoutParams24.gravity = 8388627;
                            layoutParams24.setMarginStart(iLIZIZ2);
                            C786410Ut5.W5(childAt7, layoutParams24);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            ViewGroup.LayoutParams layoutParams25 = viewGroup2.getLayoutParams();
            if (layoutParams25 != null) {
                layoutParams25.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.W5(viewGroup2, layoutParams25);
                View childAt8 = viewGroup2.getChildAt(0);
                if (childAt8 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams26 = childAt8.getLayoutParams();
                if (layoutParams26 != null) {
                    FrameLayout.LayoutParams layoutParams27 = (FrameLayout.LayoutParams) layoutParams26;
                    layoutParams27.gravity = 8388627;
                    if (C295430Bi1.LIZ()) {
                        layoutParams27.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        layoutParams27.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    }
                    layoutParams27.setMarginStart(iLIZIZ3);
                    C786410Ut5.W5(childAt8, layoutParams27);
                    C426750GoL.LJIIL(childAt8, 0, 0, 0, 0, 16);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final boolean eJ(Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair) {
        List<? extends InterfaceC1570900qyu> first = pair.getFirst();
        if ((first instanceof Collection) && first.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = first.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((InterfaceC1570900qyu) it2.next()).getTag(), EnumC1584350rKb.STORY.getTag())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol
    public final void vo2(C705890RmV c705890RmV) {
        Integer num;
        boolean z;
        if (C1596000rdO.LIZ()) {
            if (!C1585060rLk.LIZJ()) {
                num = null;
                z = false;
                C426750GoL.LJIIIZ(c705890RmV, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58))), null, null, null, false, 30);
            } else {
                num = null;
                z = false;
                C426750GoL.LJIIIZ(c705890RmV, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92))), null, null, null, false, 30);
            }
        } else {
            num = null;
            z = false;
            C426750GoL.LJIIIZ(c705890RmV, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), null, null, null, false, 30);
        }
        if (C1585060rLk.LIZ() == 1) {
            C426750GoL.LJIIIZ(c705890RmV, num, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), num, false, 27);
        } else {
            C426750GoL.LJIIIZ(c705890RmV, num, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))), num, z, 27);
        }
    }
}
