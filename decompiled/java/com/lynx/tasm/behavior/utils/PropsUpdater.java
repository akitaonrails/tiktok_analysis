package com.lynx.tasm.behavior.utils;

import X.AbstractC1312520kGA;
import X.C0WZX;
import X.C1311730kEt;
import X.C1312550kGD;
import X.C1312880kGk;
import X.C1312890kGl;
import X.C2188811AlT;
import X.C2204961BRm;
import X.InterfaceC1312510kG9;
import X.InterfaceC1312870kGj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.eventreport.LynxEventReporter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class PropsUpdater {
    public static final Map<Class<?>, LynxUISetter<?>> LIZ = new ConcurrentHashMap();
    public static final Map<Class<?>, ShadowNodeSetter<?>> LIZIZ = new ConcurrentHashMap();
    public static final Map<String, Settable> LIZJ = new HashMap();

    public static class FallbackLynxUISetter<T extends LynxBaseUI> implements LynxUISetter<T> {
        public final Map<String, AbstractC1312520kGA> LIZ;

        public FallbackLynxUISetter() {
            throw null;
        }

        public FallbackLynxUISetter(Class cls) {
            this.LIZ = C1312550kGD.LIZJ(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.LynxUISetter
        public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
            AbstractC1312520kGA abstractC1312520kGA = this.LIZ.get(str);
            if (abstractC1312520kGA != null) {
                try {
                    Integer num = abstractC1312520kGA.LIZJ;
                    if (num == null) {
                        C2204961BRm.a0(abstractC1312520kGA.LIZIZ, lynxBaseUI, new Object[]{abstractC1312520kGA.LIZ(c1311730kEt)}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM1qY36dXknh4LJPfkb+D60b", null));
                    } else {
                        C2204961BRm.a0(abstractC1312520kGA.LIZIZ, lynxBaseUI, new Object[]{num, abstractC1312520kGA.LIZ(c1311730kEt)}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM1qY36dXknh4LJPfkb+D60b", null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    RuntimeException runtimeException = new RuntimeException("Fallback setter, error while updating property '" + abstractC1312520kGA.LIZ + "' in Lynx UI of type: " + lynxBaseUI.getClass() + ":" + th, th);
                    runtimeException.setStackTrace(th.getStackTrace());
                    throw runtimeException;
                }
            }
        }
    }

    public static class FallbackShadowNodeSetter<T extends ShadowNode> implements ShadowNodeSetter<T> {
        public final Map<String, AbstractC1312520kGA> LIZ;

        public FallbackShadowNodeSetter() {
            throw null;
        }

        public FallbackShadowNodeSetter(Class cls) {
            this.LIZ = C1312550kGD.LIZLLL(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
        public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
            AbstractC1312520kGA abstractC1312520kGA = this.LIZ.get(str);
            if (abstractC1312520kGA != null) {
                try {
                    Integer num = abstractC1312520kGA.LIZJ;
                    if (num == null) {
                        C2204961BRm.a0(abstractC1312520kGA.LIZIZ, shadowNode, new Object[]{abstractC1312520kGA.LIZ(c1311730kEt)}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM1qY36dXknh4LJPfkb+D60b", null));
                    } else {
                        C2204961BRm.a0(abstractC1312520kGA.LIZIZ, shadowNode, new Object[]{num, abstractC1312520kGA.LIZ(c1311730kEt)}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezazEe8gM1qY36dXknh4LJPfkb+D60b", null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    RuntimeException runtimeException = new RuntimeException("Fallback setter, error while updating property '" + abstractC1312520kGA.LIZ + "' in shadow node of type: " + shadowNode.LJIILIIL() + ":" + th, th);
                    runtimeException.setStackTrace(th.getStackTrace());
                    throw runtimeException;
                }
            }
        }
    }

    public static <T> T LIZ(Class<?> cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getName());
        sbLIZ.append("$$PropsSetter");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        T t = (T) ((HashMap) LIZJ).get(strLIZIZ);
        if (t != null) {
            return t;
        }
        try {
            return (T) Class.forName(strLIZIZ).newInstance();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unable to instantiate methods getter for ");
            sbLIZ2.append(strLIZIZ);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
        } catch (InstantiationException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("Unable to instantiate methods getter for ");
            sbLIZ22.append(strLIZIZ);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ22), e);
        }
    }

    public static <T extends LynxBaseUI> LynxUISetter<T> LIZIZ(final Class<? extends LynxBaseUI> cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        LynxUISetter<T> fallbackLynxUISetter = (LynxUISetter) concurrentHashMap.get(cls);
        if (fallbackLynxUISetter == null) {
            fallbackLynxUISetter = (LynxUISetter) LIZ(cls);
            if (fallbackLynxUISetter == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PropsSetter not generated for class: ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(". You should add module lynxProcessor");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (LynxEnv.inst().isCheckPropsSetter() && LynxEnv.inst().isLynxDebugEnabled()) {
                    throw new IllegalStateException(strLIZIZ);
                }
                LynxLog.e("PropsUpdater", strLIZIZ);
                fallbackLynxUISetter = new FallbackLynxUISetter<>(cls);
                LynxEventReporter.onEvent("lynxsdk_props_setter_fallback", new HashMap<String, Object>(cls) { // from class: X.0kG8
                    {
                        put("class_name", cls.getName());
                    }
                }, -1);
            }
            concurrentHashMap.put(cls, fallbackLynxUISetter);
        }
        return fallbackLynxUISetter;
    }

    public static <T extends ShadowNode> void LIZJ(T t, C1311730kEt c1311730kEt) {
        Class<?> cls = t.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        ShadowNodeSetter fallbackShadowNodeSetter = (ShadowNodeSetter) concurrentHashMap.get(cls);
        if (fallbackShadowNodeSetter == null) {
            fallbackShadowNodeSetter = (ShadowNodeSetter) LIZ(cls);
            if (fallbackShadowNodeSetter == null) {
                fallbackShadowNodeSetter = new FallbackShadowNodeSetter(cls);
            }
            concurrentHashMap.put(cls, fallbackShadowNodeSetter);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = c1311730kEt.LIZ.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            fallbackShadowNodeSetter.LIZIZ(t, readableMapKeySetIteratorKeySetIterator.nextKey(), c1311730kEt);
        }
        InterfaceC1312870kGj interfaceC1312870kGj = c1311730kEt.LIZIZ;
        if (interfaceC1312870kGj != null && (t instanceof BaseTextShadowNode)) {
            BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) t;
            for (InterfaceC1312510kG9 interfaceC1312510kG9 : interfaceC1312870kGj) {
                int key = interfaceC1312510kG9.getKey();
                if (key != 22) {
                    if (key != 73) {
                        if (key != 122) {
                            if (key != 130) {
                                if (key != 192) {
                                    if (key != 61) {
                                        if (key != 62) {
                                            if (key != 96) {
                                                if (key != 97) {
                                                    if (key != 195) {
                                                        if (key != 196) {
                                                            switch (key) {
                                                                case 42:
                                                                    baseTextShadowNode.setWhiteSpace(interfaceC1312510kG9.LJFF());
                                                                    break;
                                                                case 43:
                                                                    baseTextShadowNode.setLetterSpacing((float) interfaceC1312510kG9.LIZ());
                                                                    break;
                                                                case 44:
                                                                    baseTextShadowNode.setTextAlign(interfaceC1312510kG9.LJFF());
                                                                    break;
                                                                case 45:
                                                                    baseTextShadowNode.setLineHeight((float) interfaceC1312510kG9.LIZ());
                                                                    break;
                                                                case 46:
                                                                    baseTextShadowNode.setTextOverflow(interfaceC1312510kG9.LJFF());
                                                                    break;
                                                                case 47:
                                                                    baseTextShadowNode.setFontSize((float) interfaceC1312510kG9.LIZ());
                                                                    break;
                                                                case 48:
                                                                    baseTextShadowNode.setFontWeight(interfaceC1312510kG9.LJFF());
                                                                    break;
                                                            }
                                                        } else {
                                                            baseTextShadowNode.setTextStrokeColor(new C1312890kGl(new C1312880kGk(interfaceC1312870kGj), 196));
                                                        }
                                                    } else {
                                                        baseTextShadowNode.setTextStrokeWidth((float) interfaceC1312510kG9.LIZ());
                                                    }
                                                } else {
                                                    baseTextShadowNode.setTextShadow(new C1312880kGk(interfaceC1312510kG9.LIZIZ()));
                                                }
                                            } else {
                                                baseTextShadowNode.setTextDecoration(new C1312880kGk(interfaceC1312510kG9.LIZIZ()));
                                            }
                                        } else {
                                            baseTextShadowNode.setFontStyle(interfaceC1312510kG9.LJFF());
                                        }
                                    } else {
                                        baseTextShadowNode.setFontFamily(interfaceC1312510kG9.getString());
                                    }
                                } else {
                                    baseTextShadowNode.setTextIndent(new C1312880kGk(interfaceC1312510kG9.LIZIZ()));
                                }
                            } else {
                                baseTextShadowNode.setDirection(interfaceC1312510kG9.LJFF());
                            }
                        } else {
                            baseTextShadowNode.setWordBreakStrategy(interfaceC1312510kG9.LJFF());
                        }
                    } else {
                        baseTextShadowNode.setLineSpacing((float) interfaceC1312510kG9.LIZ());
                    }
                } else {
                    baseTextShadowNode.setColor(new C1312890kGl(new C1312880kGk(interfaceC1312870kGj), 22));
                }
            }
        }
    }
}
