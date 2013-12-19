/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.hierarchy;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.hierarchy.AbstractHierarchyTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({HierarchyTestGenerated.Type.class, HierarchyTestGenerated.Super.class, HierarchyTestGenerated.Sub.class, HierarchyTestGenerated.Callers.class, HierarchyTestGenerated.Callees.class})
public class HierarchyTestGenerated extends AbstractHierarchyTest {
    @TestMetadata("idea/testData/hierarchy/class/type")
    public static class Type extends AbstractHierarchyTest {
        public void testAllFilesPresentInType() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/hierarchy/class/type"), Pattern.compile("^(.+)$"), false);
        }
        
        @TestMetadata("CaretAtAnnotation")
        public void testCaretAtAnnotation() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtAnnotation");
        }
        
        @TestMetadata("CaretAtConstructor")
        public void testCaretAtConstructor() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtConstructor");
        }
        
        @TestMetadata("CaretAtFabricMethod")
        public void testCaretAtFabricMethod() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtFabricMethod");
        }
        
        @TestMetadata("CaretAtImport")
        public void testCaretAtImport() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtImport");
        }
        
        @TestMetadata("CaretAtJavaType")
        public void testCaretAtJavaType() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtJavaType");
        }
        
        @TestMetadata("CaretAtModifierList")
        public void testCaretAtModifierList() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtModifierList");
        }
        
        @TestMetadata("CaretAtReceiverExtFun")
        public void testCaretAtReceiverExtFun() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtReceiverExtFun");
        }
        
        @TestMetadata("CaretAtSuperCall")
        public void testCaretAtSuperCall() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtSuperCall");
        }
        
        @TestMetadata("CaretAtSupertypesList")
        public void testCaretAtSupertypesList() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtSupertypesList");
        }
        
        @TestMetadata("CaretAtTypeReference")
        public void testCaretAtTypeReference() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretAtTypeReference");
        }
        
        @TestMetadata("CaretInClassBody")
        public void testCaretInClassBody() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/CaretInClassBody");
        }
        
        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/ClassFromClass");
        }
        
        @TestMetadata("ClassFromObject")
        public void testClassFromObject() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/ClassFromObject");
        }
        
        @TestMetadata("ClassInClassObject")
        public void testClassInClassObject() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/ClassInClassObject");
        }
        
        @TestMetadata("ClassInPackage")
        public void testClassInPackage() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/ClassInPackage");
        }
        
        @TestMetadata("InnerClass")
        public void testInnerClass() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/InnerClass");
        }
        
        @TestMetadata("JKJHierarchy")
        public void testJKJHierarchy() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/JKJHierarchy");
        }
        
        @TestMetadata("JavaFromKotlin")
        public void testJavaFromKotlin() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/JavaFromKotlin");
        }
        
        @TestMetadata("JavaFromKotlinForKotlinClass")
        public void testJavaFromKotlinForKotlinClass() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/JavaFromKotlinForKotlinClass");
        }
        
        @TestMetadata("JetInt")
        public void testJetInt() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/JetInt");
        }
        
        @TestMetadata("KJKHierarchy")
        public void testKJKHierarchy() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/KJKHierarchy");
        }
        
        @TestMetadata("KotlinFromJava")
        public void testKotlinFromJava() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/KotlinFromJava");
        }
        
        @TestMetadata("Object")
        public void testObject() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/Object");
        }
        
        @TestMetadata("TwoChildren")
        public void testTwoChildren() throws Exception {
            doTypeClassHierarchyTest("idea/testData/hierarchy/class/type/TwoChildren");
        }
        
    }
    
    @TestMetadata("idea/testData/hierarchy/class/super")
    public static class Super extends AbstractHierarchyTest {
        public void testAllFilesPresentInSuper() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/hierarchy/class/super"), Pattern.compile("^(.+)$"), false);
        }
        
        @TestMetadata("JetList")
        public void testJetList() throws Exception {
            doSuperClassHierarchyTest("idea/testData/hierarchy/class/super/JetList");
        }
        
        @TestMetadata("TwoTraits")
        public void testTwoTraits() throws Exception {
            doSuperClassHierarchyTest("idea/testData/hierarchy/class/super/TwoTraits");
        }
        
    }
    
    @TestMetadata("idea/testData/hierarchy/class/sub")
    public static class Sub extends AbstractHierarchyTest {
        public void testAllFilesPresentInSub() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/hierarchy/class/sub"), Pattern.compile("^(.+)$"), false);
        }
        
        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            doSubClassHierarchyTest("idea/testData/hierarchy/class/sub/ClassFromClass");
        }
        
        @TestMetadata("ObjectFromClass")
        public void testObjectFromClass() throws Exception {
            doSubClassHierarchyTest("idea/testData/hierarchy/class/sub/ObjectFromClass");
        }
        
        @TestMetadata("ObjectFromTrait")
        public void testObjectFromTrait() throws Exception {
            doSubClassHierarchyTest("idea/testData/hierarchy/class/sub/ObjectFromTrait");
        }
        
    }
    
    @TestMetadata("idea/testData/hierarchy/calls/callers")
    public static class Callers extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallers() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/hierarchy/calls/callers"), Pattern.compile("^(.+)$"), false);
        }
        
        @TestMetadata("javaConstructor")
        public void testJavaConstructor() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/javaConstructor");
        }
        
        @TestMetadata("javaMethod")
        public void testJavaMethod() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/javaMethod");
        }
        
        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinClass");
        }
        
        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinFunction");
        }
        
        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinLocalClass");
        }
        
        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinLocalFunction");
        }
        
        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinNestedClass");
        }
        
        @TestMetadata("kotlinNestedInnerClass")
        public void testKotlinNestedInnerClass() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinNestedInnerClass");
        }
        
        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinPackageFunction");
        }
        
        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            doCallerHierarchyTest("idea/testData/hierarchy/calls/callers/kotlinPackageProperty");
        }
        
    }
    
    @TestMetadata("idea/testData/hierarchy/calls/callees")
    public static class Callees extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallees() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/hierarchy/calls/callees"), Pattern.compile("^(.+)$"), false);
        }
        
        @TestMetadata("javaConstructor")
        public void testJavaConstructor() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/javaConstructor");
        }
        
        @TestMetadata("javaMethod")
        public void testJavaMethod() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/javaMethod");
        }
        
        @TestMetadata("kotlinAnonymousObject")
        public void testKotlinAnonymousObject() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinAnonymousObject");
        }
        
        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinClass");
        }
        
        @TestMetadata("kotlinClassObject")
        public void testKotlinClassObject() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinClassObject");
        }
        
        @TestMetadata("kotlinEnumClass")
        public void testKotlinEnumClass() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinEnumClass");
        }
        
        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinFunction");
        }
        
        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinLocalClass");
        }
        
        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinLocalFunction");
        }
        
        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinNestedClass");
        }
        
        @TestMetadata("kotlinObject")
        public void testKotlinObject() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinObject");
        }
        
        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinPackageFunction");
        }
        
        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinPackageProperty");
        }
        
        @TestMetadata("kotlinProperty")
        public void testKotlinProperty() throws Exception {
            doCalleeHierarchyTest("idea/testData/hierarchy/calls/callees/kotlinProperty");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("HierarchyTestGenerated");
        suite.addTestSuite(Type.class);
        suite.addTestSuite(Super.class);
        suite.addTestSuite(Sub.class);
        suite.addTestSuite(Callers.class);
        suite.addTestSuite(Callees.class);
        return suite;
    }
}
